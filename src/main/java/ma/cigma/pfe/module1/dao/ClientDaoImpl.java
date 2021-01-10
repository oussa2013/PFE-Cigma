package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
@Repository
public class ClientDaoImpl implements IClientDao {


    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public Boolean save(Client client) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(client);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            return false;
        }

    }

}
