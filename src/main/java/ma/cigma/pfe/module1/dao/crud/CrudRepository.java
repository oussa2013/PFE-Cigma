package ma.cigma.pfe.module1.dao.crud;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-13.
 */

public interface CrudRepository<T> {

    T save(T b);

    T update(T b);

    List<T> findAll();

    T findById(Integer id);

    void delete(Integer id);
}
