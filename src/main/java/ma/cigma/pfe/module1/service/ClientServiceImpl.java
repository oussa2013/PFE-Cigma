package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.dao.IClientDao;
import ma.cigma.pfe.module1.dao.domain.ClientEntity;
import ma.cigma.pfe.module1.mapper.ClientMapper;
import ma.cigma.pfe.module1.presentation.models.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Service
@Transactional
public class ClientServiceImpl implements IClientService {

    private IClientDao dao;

    private ClientMapper clientMapper;

    public ClientServiceImpl(IClientDao dao, ClientMapper clientMapper) {
        this.dao = dao;
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientDto save(ClientDto client) {

        ClientEntity clientEntity = dao.save(clientMapper.convertToEntity(client));
        return clientMapper.convertToDto(clientEntity);
    }

    @Override
    public List<ClientDto> findAll() {
        return clientMapper.convertToListDto(dao.findAll());
    }

    @Override
    public ClientDto update(ClientDto client) {
        ClientEntity clientEntity = dao.update(clientMapper.convertToEntity(client));
        return clientMapper.convertToDto(dao.update(clientEntity));
    }

    @Override
    public ClientDto getById(Integer id) {
        return clientMapper.convertToDto(dao.findById(id));
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

}
