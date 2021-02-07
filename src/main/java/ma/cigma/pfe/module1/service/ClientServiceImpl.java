package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.dao.IClientDao;
import ma.cigma.pfe.module1.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Service
@Transactional
public class ClientServiceImpl implements IClientService {

    @Autowired
    IClientDao dao;

    @Override
    public Client save(Client client) {
        return dao.save(client);
    }

    @Override
    public List<Client> findAll() {
        return dao.findAll();
    }

    @Override
    public Client update(Client client) {
        return dao.update(client);
    }

    @Override
    public Client getById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void delete(Integer id) {
         dao.delete(id);
    }

}
