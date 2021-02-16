package ma.cigma.pfe.module1.presentation.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */

@Getter
@Setter
public class ClientDto {


    private Integer id;

    protected String firstname;

    protected String lastname;

    protected String email;

    protected String phone;

    protected String address;

    protected boolean enabled = true;

    int total;


}
