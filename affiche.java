case 2:
  if(menu.isEmpty()){
    System.out.println("Menu vide");
  }else{
    for(Plat p : menu){
      p.afficher();
    }
  }
  break;
