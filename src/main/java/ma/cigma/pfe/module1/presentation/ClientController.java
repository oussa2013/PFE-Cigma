package ma.cigma.pfe.module1.presentation;

import ma.cigma.pfe.module1.dao.IClientDao;
import ma.cigma.pfe.module1.models.Client;
import ma.cigma.pfe.module1.service.ClientServiceImpl;
import ma.cigma.pfe.module1.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Controller
public class ClientController {

    @Autowired
    IClientService clientService;

    Boolean save(Client client){

        return clientService.save(client);

    }




}
