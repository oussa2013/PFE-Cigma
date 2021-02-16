package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepositoryImpl;
import ma.cigma.pfe.module1.dao.domain.ClientEntity;
import org.springframework.stereotype.Repository;


/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
@Repository
public class ClientDaoImpl extends CrudRepositoryImpl<ClientEntity> implements IClientDao {



}
