package ma.cigma.pfe.module1.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * this class is created to contain data introduced by users Objects form this
 * class will persisted in our data base this class must contain only getter,
 * setters, constructors it can also override methods form Object class.
 * 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Entity
@Table(name = "TDemands")
@Getter @Setter
@ToString
public class Demand {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//Identity = AUTOINCREMENT
	//SEQUENCE = UTILISE UNE SEQUENCE [SEQUNCE SGBD]
	//TABLE = hibernate_sequences
	//AUTO= CHOISIR UNE DES TROIS
	@Column(name="id")
	private Integer id;

	@Column(name="cmp")
	private String compte;

	@Column(name="nb")
	private int nb;

	@Column(name="statut")
	private String status;

	@Column(name="date_demand")
	private LocalDate dateDemand;


	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_client", nullable = false)
	private Client client ;*/


}
