package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepository;
import ma.cigma.pfe.module1.models.Client;
import org.springframework.stereotype.Repository;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
public interface IClientDao extends CrudRepository<Client> {

}
