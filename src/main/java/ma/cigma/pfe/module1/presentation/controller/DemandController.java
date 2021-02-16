package ma.cigma.pfe.module1.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.module1.presentation.models.DemandDto;
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

    DemandDto save(DemandDto demandDto) {
        return demandService.save(demandDto);
    }

    DemandDto update(DemandDto demandDto) {
        return demandService.update(demandDto);
    }

    List<DemandDto> findAll() {
        return demandService.findAll();
    }

    void delete(Integer id) {
        demandService.delete(id);
    }

    DemandDto getById(Integer id) {
        return demandService.getById(id);
    }

}
