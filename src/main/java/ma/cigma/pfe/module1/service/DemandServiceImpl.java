package ma.cigma.pfe.module1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.pfe.module1.dao.IDemandDao;
import ma.cigma.pfe.module1.models.Demand;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;
import java.util.List;

/**
 * this class is created to validate all rules related to
 * business logic
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Service
@Transactional
public class DemandServiceImpl implements IDemandService {
    @Autowired
    private IDemandDao dao;


    @Override
    public Demand save(Demand demand) {
        return dao.save(demand);
    }

    @Override
    public Demand update(Demand demand) {
        return dao.update(demand);
    }

    @Override
    public List<Demand> findAll() {
        return dao.findAll();
    }

    @Override
    public Demand getById(Integer id) {
        return getById(id);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }
}
