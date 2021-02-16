package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.presentation.models.DemandDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.pfe.module1.dao.IDemandDao;
import org.springframework.transaction.annotation.Transactional;

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
    public DemandDto save(DemandDto demandDto) {
        return dao.save(demandDto);
    }

    @Override
    public DemandDto update(DemandDto demandDto) {
        return dao.update(demandDto);
    }

    @Override
    public List<DemandDto> findAll() {
        return dao.findAll();
    }

    @Override
    public DemandDto getById(Integer id) {
        return getById(id);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }
}
