package ma.cigma.pfe.module1.presentation;

import java.util.Scanner;

import ma.cigma.pfe.module1.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.module1.models.Demand;
/**
 * this main controller will be removed and replaced by
 * DispatcherServelet of Spring MVC
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public class CtrlPrincipal {
	
	static ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	static DemandController ctrlDemande=(DemandController)context.getBean("ctrl");
	static ClientController ctrlClient=(ClientController)context.getBean("beanclient");


	public static void main(String[] args) {
		// Recuperer les donnees de user
//		Scanner s = new Scanner(System.in);
//		System.out.println("Saisir un code");
//		String code= s.nextLine();
//		System.out.println("Saisir un nb");
//		int nb=s.nextInt();

		Scanner s = new Scanner(System.in);
		System.out.println("Saisir un nom");
		String nom= s.nextLine();


		// construire l'objet
		Demand d= new Demand();
		//d.setCompte(code);
		//d.setNb(nb);

		Client client  = new Client();
        client.setName(nom);
		// dispatcher vers le controleur
		String action="client/add";
		if(action.equals("demand/add")) {
			ctrlDemande.insert(d);
		}
		else if (action.equals("client/add")){
			System.out.println(ctrlClient.save(client));
		}
	}
}
