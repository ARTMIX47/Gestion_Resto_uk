case 3:

    System.out.print("ID ou Nom à rechercher : ");
    sc.nextLine();
    String recherche = sc.nextLine();

    boolean trouve = false;

    for(Plat p : menu) {
        if(String.valueOf(p.id).equals(recherche)
           || p.nom.equalsIgnoreCase(recherche)) {

            p.afficher();
            trouve = true;
        }
    }

    if(!trouve) {
        System.out.println("Plat non trouvé");
    }
    break;
