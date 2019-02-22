package debug.voiture;

import java.util.Arrays;
import java.util.List;

public class Essai {
	
	/**
	 * Une méthode qui devrait ajouter des voitures à une agence de location.
	 * Mais produit une exception.
	 */
	public static void executionBug() {
		List<Voiture> voitures = Arrays.asList(
				new Voiture("honda"),
				new Voiture("mercedes benz"),
				new Voiture("sköda"),
				new Voiture("roylce roylce")
				);
		
		AgenceLocation hertz = new AgenceLocation();
		
		for (Voiture voiture : voitures) {
			hertz.addVoiture(voiture);
		}
	}
	

	/**
	 * Une méthode qui devrait créer des voitures et les faire dire vroum.
	 * Mais le résultat n'est pas celui qu'on attendait.
	 */
	public static void outputBug() {
		List<Voiture> voitures = Arrays.asList(
				new Voiture("honda"),
				new Voiture("mercedes benz"),
				new Voiture("sköda"),
				new Voiture("roylce roylce")
				);
		
		for (Voiture voiture : voitures) {
			voiture.roule();
		}
	}

	public static void main(String[] args) {
		outputBug();
		executionBug();
	}
	
}
