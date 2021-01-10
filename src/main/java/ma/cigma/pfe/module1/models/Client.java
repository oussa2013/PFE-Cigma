package ma.cigma.pfe.module1.models;

import com.sun.javafx.geom.transform.Identity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

/**
 * Created by Oussama_Qaiboub on 2021-01-10.
 */
@Entity
@Table(name="Tclient")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nom")
    private String name;

    @Transient
    private Double totalPrice;


}
