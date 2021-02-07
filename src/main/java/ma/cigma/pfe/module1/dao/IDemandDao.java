package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepository;
import ma.cigma.pfe.module1.models.Demand;
import org.springframework.stereotype.Repository;

/**
 * this interface contains signatures of methods to be called 
 * by the service layer 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandDao extends CrudRepository<Demand> {

}
