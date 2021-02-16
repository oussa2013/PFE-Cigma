package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.presentation.models.ClientDto;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
public interface IClientService {

    ClientDto save(ClientDto client);

    ClientDto update(ClientDto client);

    List<ClientDto> findAll();

    ClientDto getById(Integer id);

    void delete(Integer id);


}
