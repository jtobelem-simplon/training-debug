package debug.films;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassementFilms {
	
	/**
	 * Calule la moyenne arrondie à l'entier pour le film n°i.
	 */
	public static int calculeMoyenne(List<MesNotes> ensembleNotes, int i) {
		int somme = 0;
		for (MesNotes mesNotes : ensembleNotes) {
			somme += mesNotes.getNote(i);
		}
		
		return Math.round(((float)somme)/ensembleNotes.size());
		
	}

	public static void main(String[] argv) throws FileNotFoundException {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		String line;
		Scanner sc = new Scanner(new FileReader("src/debug/deux/input.txt"));
		
		MesNotes mesNotes;
		List<MesNotes> ensembleNotes = new ArrayList<MesNotes>();
		
		int nbNotes, numFilm = 0;
		
		try {
			nbNotes = Integer.parseInt(sc.nextLine());
			numFilm = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Erreur de formatage du fichier en entrée."
					+ "La première ligne doit être le nombre de notes et la seconde le numéro du film dont on veut la note moyenne.");
		}
		
		// Lit toutes les lignes dans le fichier. 
		// Chaque ligne correspond à une liste de notes séparés par des espaces (une note par film)
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			
			 mesNotes = new MesNotes();
			 mesNotes.readLine(line);
			 ensembleNotes.add(mesNotes);
		}
		
		int moyenne = calculeMoyenne(ensembleNotes, numFilm);
		
		System.out.println(MessageFormat.format("Le film {0} a pour note moyenne {1}", numFilm, moyenne));
		
	}
}
