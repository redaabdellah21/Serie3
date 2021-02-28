package exo7;

public class exo7 {

	public static void main(String[] args) {
		Equipe equipe1 = new Equipe();
		Equipe equipe2 = new Equipe();
		EquipeLimitee equipe3 = new EquipeLimitee(3);
		EquipeLimitee equipe4 = new EquipeLimitee(4);
		Joueur j1 = new Joueur ("Zineddine",25);
		Joueur j2 = new Joueur ("Ronaldo",30);
		Joueur j3 = new Joueur ("Beckham",35);
		Joueur j4 = new Joueur ("Figo",40);
		Joueur j5 = new Joueur ("Casillas",45);
		Joueur jtest = new Joueur ("messi",35);
		Joueur j6 = new Joueur ("Beckham",35); 
		Joueur team1[] = {j1,j2,j3} ;
		Joueur team2[]= {j4,j5,j6};
		Joueur team3[]= {j1,j2,j3,j4,j5,j6};
		for(int i=0;i<team1.length;i++) {
			equipe1.addJoueur(team1[i]);
		}
		for(int i=0;i<team2.length;i++) {
			equipe2.addJoueur(team2[i]);
		}
		equipe1.addJoueur(jtest);
		 if (equipe1.isJoueurPresent(jtest)) {
		        System.out.println(jtest.getNom()+" est maintenant un membre ");
		 }
		 if (equipe1.removeJoueur(jtest)){
	            System.out.println(jtest.getNom()+" n'est plus un membre");
	     }
		System.out.println("Nombre de Joueurs equipe 1 : "+equipe1.getNombreJoueurs());
		System.out.println("Moyenne age equipe 1 : "+equipe1.getMoyenneAge());
		System.out.println("Nombre de Joueurs equipe 2 : "+equipe2.getNombreJoueurs());
		System.out.println("Moyenne age equipe 2 : "+equipe2.getMoyenneAge());
		System.out.println("l'equipe 1 : ");
		System.out.println(equipe1.toString());
		System.out.println("l'equipe 2 : ");
		System.out.println(equipe2.toString());
		equipe1.addAllEquipe(equipe2);
		System.out.println("Equipe 1+Equipe 2: ");
		System.out.println(equipe1.toString());
		System.out.println("Nombre de Joueurs de la nouvelle équipe : "+equipe1.getNombreJoueurs());
		System.out.println("Moyenne age de la nouvelle équipe : "+equipe1.getMoyenneAge());
		equipe1.clear();
		System.out.println(equipe1.toString());
		
		for(int i=0;i<team3.length;i++)
	       {
	           equipe3.addJoueur(team3[i]);
	       }
		System.out.println("Equipe 3: ");
	    System.out.print(equipe3);
	    
		for(int i=0;i<team1.length;i++) {
			equipe4.addJoueur(team1[i]);
		}
	    equipe4.addAllEquipe(equipe2);
	    System.out.println("Equipe 4: ");
	    System.out.print(equipe4);
	}

}
