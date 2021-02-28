package exo7;
import java.util.Collection;
import java.util.ArrayList;

public class EquipeLimitee {

	Collection <Joueur> team= new ArrayList<Joueur>();
	int nbr;

	public EquipeLimitee(Collection<Joueur> team, int max) {
		this.team = team;
		this.nbr=max;
	}
	public EquipeLimitee() {
		super();
	}
	public EquipeLimitee(int max) { 
		team = new ArrayList<>();
		this.nbr=max;
	}
	public void addJoueur (Joueur player) {
		if(team.size()< nbr)
		{
		team.add(player);
		}
	}
	public boolean removeJoueur (Joueur player) {
		return team.remove(player);
	}
	public boolean isJoueurPresent (Joueur player) {
		return team.contains(player);
	}

	@Override
	public String toString() {
		return "Equipe " + team.size() + " joueurs\n" + team ;
	}
	public void addAllEquipe(Equipe team2) {
        for (Joueur element: team2.team) {
            if (!(this.isJoueurPresent(element))) {
                this.addJoueur(element);
            }
        }

    }
	
	public void clear() {
		team.clear();
	}
	
	public int getNombreJoueurs() {
		return team.size();
	}
	
	public double getMoyenneAge() {
		int m=0;
		for(Joueur j:team) {
			m+=j.getAge();
		}
		return m/team.size();
	}

	
}
