package ma.cigma.pfe.module1.presentation.models;

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

@Getter @Setter
public class DemandDto {

	private Integer id;

	private String compte;

	private int nb;

	private String status;

	private LocalDate dateDemand;


}
