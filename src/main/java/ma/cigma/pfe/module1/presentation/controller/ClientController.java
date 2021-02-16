package ma.cigma.pfe.module1.presentation.controller;

import ma.cigma.pfe.module1.presentation.models.ClientDto;
import ma.cigma.pfe.module1.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IClientService clientService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    RedirectView save(@ModelAttribute("client") ClientDto clientDto) {
        clientService.save(clientDto);
        return new RedirectView("/client/home", true);
    }

    @RequestMapping("/init")
    String getClient(Model model) {
        model.addAttribute("client", new ClientDto());
        return "clientPage";
    }

    ClientDto update(ClientDto client) {
        return clientService.update(client);
    }


    @RequestMapping("/home")
    private String findAll(Model model) {
        List<ClientDto> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "listClientsPage";
    }


    @RequestMapping("/{id}")
    public String getById(@PathVariable Integer id, Model m) {
        ClientDto clientDto = clientService.getById(id);
        m.addAttribute("client", clientDto);
        return "editClientPage";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RedirectView editSave(@ModelAttribute("client") ClientDto clientDto) {
        clientService.update(clientDto);
        return new RedirectView("/client/home", true);
    }

    void delete(Integer id) {
        clientService.delete(id);
    }

    @RequestMapping(value = "/delete/{id}")
    public RedirectView deleteDemand(@PathVariable Integer id) {
        clientService.delete(id);
        return new RedirectView("/client/home", true);
    }


}
