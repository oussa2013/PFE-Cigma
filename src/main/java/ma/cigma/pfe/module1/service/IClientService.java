package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.models.Client;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
public interface IClientService {

    Client save(Client client);

    Client update(Client client);

    List<Client> findAll();

    Client getById(Integer id);

    void delete(Integer id);


}
