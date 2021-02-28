package exo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class RegistreJoueur {
	private Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
	public RegistreJoueur() {
	}
	public RegistreJoueur(Map<Integer, List<String>> map) {
		this.map = map;
	}
	public void addJoueur(Joueur joueur) {
		char[] annee = ("" + joueur.getAnnee()).toCharArray();
		annee[3] = '0';
		String annees = new String (annee);
		int cle = Integer.valueOf(annees);	
		if( this.map.get(cle)== null) {
			List<String> newj = new ArrayList<>();
			newj.add(joueur.getNom());
			map.put(cle,newj);
		} 
		else {
				List<String> newj = map.get(cle);
				newj.add(joueur.getNom());
		}
	}
	public List<String> get(int cle) {
		if (!(map.get(cle) == null)) {
			return map.get(cle);			
		}else {
			return null;
		}
	}
	public int count(int cle) {
		if (!(map.get(cle) == null)) {
			return map.get(cle).size();
		}else {
			return 0;
		}
	}
	
	public int count() {
		Set<Integer> cle = this.map.keySet();
		int somme = 0;
		for (int i: cle) {
			somme += map.get(i).size();
		}
		return somme;
	}
	
	@Override
	public String toString() {
		return "registre Joueur:\n map = " + map;
	}
	
}
