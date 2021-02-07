package ma.cigma.pfe.module1.dao.crud;

import lombok.AllArgsConstructor;
import ma.cigma.pfe.module1.errorhandling.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-13.
 */

public abstract class CrudRepositoryImpl<T> implements CrudRepository<T> {

    //private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
    @PersistenceContext
    private EntityManager entityManager ;
    private Class<T> genericType ;

    public Class<T> getGenericType() {
        if(genericType == null){
            Type mySuperclass = getClass().getGenericSuperclass();
            Type tType = ((ParameterizedType)mySuperclass).getActualTypeArguments()[0];
            String className = tType.toString().split(" ")[1];
            try {
                genericType = (Class<T>) Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return genericType;
    }

    public CrudRepositoryImpl() {
        this.genericType = this.getGenericType();
    }


    @Override
    public T save(T b) {
        try {
            //entityManager.getTransaction().begin();
            entityManager.persist(b);
            //entityManager.getTransaction().commit();
            return b;
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @Override
    public T update(T b) {

        try {
            //entityManager.getTransaction().begin();
            entityManager.merge(b);
            //entityManager.getTransaction().commit();
            return b;
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("from "+ this.genericType.getName() +" e", this.genericType).getResultList();
    }

    @Override
    public T findById(Integer id) {
        try {
            //entityManager.getTransaction().begin();
            T entity = (T) entityManager.find(this.genericType, id);
            //entityManager.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }


    @Override
    public void delete(Integer id) {
        T entity = this.findById(id);
        entityManager.remove(entity);
    }
}
