package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.presentation.models.DemandDto;

import java.util.List;

/**
 * this interface contains signatures of methods to be called
 * by the controllers (presentation layer)
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandService {

    DemandDto save(DemandDto demandDto);

    DemandDto update(DemandDto demandDto);

    List<DemandDto> findAll();

    DemandDto getById(Integer id);

    void delete(Integer id);
}
