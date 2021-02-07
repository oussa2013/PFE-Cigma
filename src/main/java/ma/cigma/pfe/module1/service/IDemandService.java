package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.models.Demand;

import java.util.List;

/**
 * this interface contains signatures of methods to be called
 * by the controllers (presentation layer)
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandService {

    Demand save(Demand demand);

    Demand update(Demand demand);

    List<Demand> findAll();

    Demand getById(Integer id);

    void delete(Integer id);
}
