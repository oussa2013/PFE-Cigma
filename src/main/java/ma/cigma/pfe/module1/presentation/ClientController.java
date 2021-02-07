package ma.cigma.pfe.module1.presentation;

import ma.cigma.pfe.module1.models.Client;
import ma.cigma.pfe.module1.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IClientService clientService;

    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    @RequestMapping("/add")
    String save(@ModelAttribute("client") Client client, Model model) {
        System.out.println("oook goood gooood");
        model.addAttribute("result", " sucess");
        clientService.save(client);
        return "listClientsPage";
    }

    @RequestMapping("/home")
    String getClient(Model model) {
       // Client client = clientService.getById(1);
        model.addAttribute("client", new Client());
        return "clientPage";
    }

    Client update(Client client) {
        return clientService.update(client);
    }


    @RequestMapping("/all")
    private String findAll(Model model) {
        List<Client>  clients = clientService.findAll();
        model.addAttribute("client", clients);
        return "listClientsPage";
    }

    void delete(Integer id) {
        clientService.delete(id);
    }

    Client getById(Integer id) {
        return clientService.getById(id);
    }


}
