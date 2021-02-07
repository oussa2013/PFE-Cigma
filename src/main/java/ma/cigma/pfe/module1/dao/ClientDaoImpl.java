package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepository;
import ma.cigma.pfe.module1.dao.crud.CrudRepositoryImpl;
import ma.cigma.pfe.module1.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
@Repository
public class ClientDaoImpl extends CrudRepositoryImpl<Client> implements IClientDao {

}
