package ma.cigma.pfe.module1.mapper;

import ma.cigma.pfe.module1.dao.domain.ClientEntity;
import ma.cigma.pfe.module1.presentation.models.ClientDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oussama_Qaiboub on 2021-02-13.
 */
@Component
public class ClientMapper {

    public ClientEntity convertToEntity(ClientDto source){

        ClientEntity target = new ClientEntity();

        target.setId(source.getId());
        target.setFirstname(source.getFirstname());
        target.setAddress(source.getAddress());
        target.setEmail(source.getEmail());
        target.setLastname(source.getLastname());
        target.setPhone(source.getPhone());
        return target;
    }

    public ClientDto convertToDto(ClientEntity source){

        ClientDto target = new ClientDto();


        target.setId(source.getId());
        target.setFirstname(source.getFirstname());
        target.setAddress(source.getAddress());
        target.setEmail(source.getEmail());
        target.setLastname(source.getLastname());
        target.setPhone(source.getPhone());

        return target;
    }
    public List<ClientDto> convertToListDto(List<ClientEntity> sources) {

        List<ClientDto> targets = new ArrayList<>();

        sources.forEach(source -> {
            ClientDto target=new ClientDto();
            target.setId(source.getId());
            target.setFirstname(source.getFirstname());
            target.setAddress(source.getAddress());
            target.setEmail(source.getEmail());
            target.setLastname(source.getLastname());
            target.setPhone(source.getPhone());
            targets.add(target);
        });

        return targets;
    }
}
