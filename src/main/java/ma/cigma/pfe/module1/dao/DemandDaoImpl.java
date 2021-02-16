package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.dao.crud.CrudRepositoryImpl;
import ma.cigma.pfe.module1.dao.domain.DemandEntity;
import ma.cigma.pfe.module1.presentation.models.DemandDto;
import org.springframework.stereotype.Repository;

/**
 * this class is created to update the database
 * and it will implement all CRUD  operations
 * It is responsible for database access.
 * will use JPA to implement it.
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Repository
public class DemandDaoImpl extends CrudRepositoryImpl<DemandDto> implements IDemandDao {



}
