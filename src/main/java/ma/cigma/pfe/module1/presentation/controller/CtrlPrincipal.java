package ma.cigma.pfe.module1.presentation.controller;

/**
 * this main controller will be removed and replaced by
 * DispatcherServelet of Spring MVC
 *
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public class CtrlPrincipal {

   /* static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    static DemandController ctrlDemande = (DemandController) context.getBean("ctrl");
    static ClientController ctrlClient = (ClientController) context.getBean("beanclient");


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Saisir le number de l'interface \n" +
                "1 - ClientDto \n" +
                "2 - DemandMapper \n" +
                "====================\n");
        int tbl = s.nextInt();
        if (tbl == 1) {
            System.out.println("Saisir le number de l'action \n" +
                    "1 - Ajouter un client \n" +
                    "2 - Modifier le client \n" +
                    "3 - Liste des clients \n" +
                    "4 - Supprimer le client \n" +
                    "5 - Trouver le client par id\n" +
                    "====================\n");
            int action = s.nextInt();
            if (action == 1) {
                // Recuperer les donnees de user
                Scanner scanner = new Scanner(System.in);
                System.out.println("Saisir votre prenom");
                String firstname = scanner.nextLine();
                System.out.println("Saisir votre nom");
                String lastname = scanner.nextLine();
                System.out.println("Saisir votre email");
                String email = scanner.nextLine();
                // construire l'objet
                ClientDto client = new ClientDto();
                client.setFirstname(firstname);
                client.setLastname(lastname);
                client.setEmail(email);
                // dispatcher vers le controleur
                System.out.println("====================\n" + ctrlClient.save(client));
            } else if (action == 2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Saisir un id");
                int id = scanner.nextInt();
                System.out.println("Saisir votre prenom");
                String firstname = scanner.nextLine();
                System.out.println("Saisir votre nom");
                String lastname = scanner.nextLine();
                System.out.println("Saisir votre email");
                String email = scanner.nextLine();
                // construire l'objet
                ClientDto client = new ClientDto();
                client.setId(id);
                client.setFirstname(firstname);
                client.setLastname(lastname);
                client.setEmail(email);
                // dispatcher vers le controleur
                System.out.println("====================\n" + ctrlClient.update(client));
            } else if (action == 3) {
                System.out.println("====================\n " + ctrlClient.findAll());
            } else if (action == 4) {
                // Recuperer les donnees de user
                System.out.println("Saisir un id");
                int id = s.nextInt();
                ctrlClient.delete(id);
                System.out.println("====================\n le client a été supprimé avec succès");
            } else if (action == 5) {
                // Recuperer les donnees de user
                System.out.println("Saisir un id");
                int id = s.nextInt();
                System.out.println("====================\n" + ctrlClient.getById(id));
            }
        } else if (tbl == 2) {
            System.out.println("Saisir le number de l'action \n" +
                    "1 - Ajouter un demande \n" +
                    "2 - Modifier la demande \n" +
                    "3 - Liste des demandes \n" +
                    "4 - Supprimer la demande \n" +
                    "5 - Trouver la demande par id\n" +
                    "====================\n");
            int action = s.nextInt();
            if (action == 1) {
                // Recuperer les donnees de user
                System.out.println("Saisir votre compte");
                String code = s.nextLine();
                System.out.println("Saisir votre nb");
                int nb = s.nextInt();
                System.out.println("Saisir votre email");
                String email = s.nextLine();
                // construire l'objet
                DemandMapper d = new DemandMapper();
                d.setCompte(code);
                d.setNb(nb);
                System.out.println("====================\n" + ctrlDemande.save(d));
            }
        }

    }*/
}
