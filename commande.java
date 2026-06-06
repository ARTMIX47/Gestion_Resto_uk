case 5:
    double total = 0;
    int choixPlat;
    do {
        System.out.println("Tape ID du plat, 0 pour finir");
        choixPlat = sc.nextInt();
        
        for (Plat p : menu) {
            if (p.id == choixPlat) {
                total += p.prix;
                System.out.println(p.nom + " ajouté. Sous-total: " + total + " FCFA");
            }
        }
    } while (choixPlat != 0);
    
    System.out.println("TOTAL COMMANDE : " + total + " FCFA");
    System.out.printf("Soit %.2f€%n", total / 655.957);
    break;

