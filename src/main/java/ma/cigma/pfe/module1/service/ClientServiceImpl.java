package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.dao.IClientDao;
import ma.cigma.pfe.module1.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    IClientDao dao ;

    @Override
    public Boolean save(Client client) {

        return dao.save(client);
    }
}
