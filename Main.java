  import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    // Jour 2 : Classe Plat
    static class Plat {
        int id;
        String nom;
        double prix; // FCFA
        String categorie;

        public Plat(int id, String nom, double prix, String categorie) {
            this.id = id;
            this.nom = nom;
            this.prix = prix;
            this.categorie = categorie;
        }

        public void afficher() {
            // TODO Jour 5 : afficher les détails du plat
        }
    }
    
    // Jour 8 : Classe Commande
    static class Commande {
        int idCommande;
        ArrayList<Plat> platsCommandes;
        double total;

        public Commande(int idCommande) {
            this.idCommande = idCommande;
            this.platsCommandes = new ArrayList<>();
            this.total = 0;
        }

        public void ajouterPlat(Plat p) {
            // TODO Jour 8 : ajouter p à la liste + mettre à jour total
        }

        public void afficherTicket() {
            // TODO Jour 8 : afficher tous les plats + total FCFA + total €
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;
        
        // Jour 3 : Stockage
        ArrayList<Plat> menu = new ArrayList<>();
        ArrayList<Commande> listeCommandes = new ArrayList<>();
        int prochainIdCommande = 1;
        
        // Données test
        menu.add(new Plat(1, "Burger Fox", 2500, "Plat"));
        menu.add(new Plat(2, "Coca", 500, "Boisson"));
        
        do {
            // Jour 1 : Menu
            System.out.println("\n===== RESTO CHEZ FOX X =====");
            System.out.println("1. Ajouter un plat");
            System.out.println("2. Afficher le menu");
            System.out.println("3. Rechercher un plat");
            System.out.println("4. Supprimer un plat");
            System.out.println("5. Passer une commande");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            
            choix = sc.nextInt();
            
            switch(choix) {
                case 1:
                    // TODO Jour 4 : ajouter un plat dans menu
                    break;
                    
                case 2:
                    // TODO Jour 5 : afficher tous les plats du menu
                    break;
                    
                case 3:
                    // TODO Jour 6 : rechercher par ID ou nom
                    break;
                    
                case 4:
                    // TODO Jour 7 : supprimer par ID
                    break;
                    
                case 5:
                    // TODO Jour 8 : créer commande, boucle ajout plats, afficher ticket
                    break;
                    
                case 0:
                    System.out.println("A bientôt !");
                    break;
                    
                default:
                    System.out.println("Choix invalide");
            }
        } while(choix != 0);
        sc.close();
    }
}
