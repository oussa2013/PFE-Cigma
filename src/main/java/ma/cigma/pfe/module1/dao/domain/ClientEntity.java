package ma.cigma.pfe.module1.dao.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
@Entity
@Table(name="TClient")
@Getter
@Setter
@ToString
public class ClientEntity {

    @Id
    @SequenceGenerator(name="utilisateur_id_seq",
            sequenceName="utilisateur_id_seq",
            allocationSize=1,
            initialValue = 10)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name = "prenom", nullable = false, length = 30)

    protected String firstname;

    @Column(name = "nom",  nullable = false, length = 30)

    protected String lastname;

    @Column(name = "email", nullable = false, unique = true)
    protected String email;

    @Column(name = "telephone")
    protected String phone;

    @Column(name = "adresse")

    protected String address;

    @Column(name = "active")

    protected boolean enabled = true;

    @Transient
    int total;


}
