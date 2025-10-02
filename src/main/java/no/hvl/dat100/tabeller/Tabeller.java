package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i != tabell.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] \n");

	}

	// b)
	public static String tilStreng(int[] tabell) {

        String resultat = "";
        resultat += "[";

        for (int i = 0; i < tabell.length; i++) {
            resultat += tabell[i];
            if (i != tabell.length - 1) {
                resultat += ",";
            }
        }
        resultat += "] \n";
        return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

	    int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

        int[] nyTabell = new int[tabell.length];
        int j = 0;

		for (int i = tabell.length - 1; i >= 0; i--) {
            nyTabell[j] = tabell[i];
            j++;
        }
        return nyTabell;


	}


	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
            nyTabell[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
            nyTabell[i + tabell1.length] = tabell2[i];
        }
        return nyTabell;
	}
}
