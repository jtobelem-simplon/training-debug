package debug.puissance;

/**
 * Ce programme doit afficher les n premières puissances de 2, avec n passé en paramètre.
 * 1. Exécutez le programme, en n'oubliant pas de spécifier n (dans Run Configurations…). 
 * 
 * 2. Visiblement le résultat n'est pas celui attendu…
 * Debugger le programme en utilisant toutes les fonctionnalités présentées. 
 */
public class Simple {
    static int traiterArguments(String[] args) {
	int res = 0;
	if (args.length != 1) {
	    System.err.println("Nombre d'arguments incorrect");
	    System.exit(2);
	}
	try {
	    res = Integer.parseInt(args[0]);
	    if (res < 0) {
		System.err.println("l'argument doit etre un entier naturel");
		System.exit(2);
	    }
	} catch (NumberFormatException e) {
	    System.err.println("l'argument n'est pas un entier");
	    System.exit(2);
	}
	return res;
    }

    static void ecrirePuissances(int n) {
	int puiss = 1;
	for (int i = 0; i <= n; ++i) {
	    System.out.println(puiss);
	    puiss <<= 2;
	}
    }

    public static void main(String[] args) {
	int n = traiterArguments(args);
	ecrirePuissances(n);
    }
}