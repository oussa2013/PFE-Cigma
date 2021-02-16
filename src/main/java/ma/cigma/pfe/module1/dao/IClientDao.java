package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepository;
import ma.cigma.pfe.module1.dao.domain.ClientEntity;
import ma.cigma.pfe.module1.presentation.models.ClientDto;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
public interface IClientDao extends CrudRepository<ClientEntity> {

}
