package exo7;
import java.util.Collection;
import java.util.ArrayList;
public class Equipe {
	Collection <Joueur> team= new ArrayList<Joueur>();

	public Equipe(Collection<Joueur> team) {
		this.team = team;
	}

	public Equipe() {
		super();
	}
	public void addJoueur (Joueur player) {
		team.add(player);
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
	public void  addAllEquipe(Equipe team2 ){
	   team2.team.removeAll(this.team);
	   team.addAll(team2.team);
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
