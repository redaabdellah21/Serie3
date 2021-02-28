package exo8;

public class exo8 {

	public static void main(String[] args) {
		RegistreJoueur registre = new RegistreJoueur();
		
		Joueur j1 = new Joueur("Steve",1980);
		Joueur j2 = new Joueur("Hugo",1986);
		Joueur j3 = new Joueur("Djibril",1992);
		Joueur j4 = new Joueur("Blaise",1987);
		Joueur j5 = new Joueur("Paul",1993);
		
		Joueur j6 = new Joueur("Zineddine",1960);
		Joueur j7 = new Joueur("Marcelo",1985);
		Joueur j8 = new Joueur("Ronaldo",1983);
		Joueur j9 = new Joueur("Mbappe",1999);
		Joueur j10 = new Joueur("Lampard",1968);


		registre.addJoueur(j1);
		registre.addJoueur(j2);
		registre.addJoueur(j3);
		registre.addJoueur(j4);
		registre.addJoueur(j5);
		
		System.out.println("le registre " + registre.count() + " joueurs");
		System.out.println(registre);
		
		registre.addJoueur(j6);
		registre.addJoueur(j7);
		registre.addJoueur(j8);
		registre.addJoueur(j9);
		registre.addJoueur(j10);
		System.out.println("Nouveau registre " + registre.count() + " joueurs");
		System.out.println(registre);
		
		System.out.println("les joueurs nés dans la décenie 60's: " + registre.count(1960));
		System.out.println("qui sont : " + registre.get(1960) + "\n");
		System.out.println("les joueurs nés dans la décenie 70's: " + registre.count(1970));
		System.out.println("qui sont : " + registre.get(1970) + "\n");
		System.out.println("les joueurs nés dans la décenie 80's: " + registre.count(1980));
		System.out.println("qui sont : " + registre.get(1980) + "\n");
		System.out.println("les joueurs nés dans la décenie 90's: " + registre.count(1990));
		System.out.println("qui sont : " + registre.get(1990) + "\n");
		
	}

}
