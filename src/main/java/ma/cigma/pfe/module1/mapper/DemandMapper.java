package ma.cigma.pfe.module1.mapper;

import ma.cigma.pfe.module1.dao.domain.DemandEntity;
import ma.cigma.pfe.module1.presentation.models.DemandDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-02-14.
 */
public class DemandMapper {

    public DemandEntity convertToEntity(DemandDto source){

        DemandEntity target = new DemandEntity();

        target.setId(source.getId());
        target.setCompte(source.getCompte());
        target.setDateDemand(source.getDateDemand());
        target.setNb(source.getNb());
        target.setStatus(source.getStatus());
        return target;
    }

    public DemandDto convertToDto(DemandEntity source){

        DemandDto target = new DemandDto();


        target.setId(source.getId());
        target.setCompte(source.getCompte());
        target.setDateDemand(source.getDateDemand());
        target.setNb(source.getNb());
        target.setStatus(source.getStatus());

        return target;
    }
    public List<DemandDto> convertToListDto(List<DemandEntity> sources) {

        List<DemandDto> targets = new ArrayList<>();

        sources.forEach(source -> {
            DemandDto target=new DemandDto();
            target.setId(source.getId());
            target.setId(source.getId());
            target.setCompte(source.getCompte());
            target.setDateDemand(source.getDateDemand());
            target.setNb(source.getNb());
            target.setStatus(source.getStatus());
            targets.add(target);
        });

        return targets;
    }
}
