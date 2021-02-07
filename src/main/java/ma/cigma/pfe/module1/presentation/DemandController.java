package ma.cigma.pfe.module1.presentation;

import ma.cigma.pfe.module1.service.DemandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.module1.models.Demand;
import ma.cigma.pfe.module1.service.IDemandService;

import java.util.List;

/**
 * this controller will validate user's inputs
 * using hibernate-validators. It will be called
 * by main controller of Spring MVC
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Controller
public class DemandController {
    @Autowired
    private IDemandService demandService;

    Demand save(Demand demand) {
        return demandService.save(demand);
    }

    Demand update(Demand demand) {
        return demandService.update(demand);
    }

    List<Demand> findAll() {
        return demandService.findAll();
    }

    void delete(Integer id) {
        demandService.delete(id);
    }

    Demand getById(Integer id) {
        return demandService.getById(id);
    }

}
