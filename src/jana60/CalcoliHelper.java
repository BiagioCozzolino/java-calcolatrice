package jana60;

public class CalcoliHelper {

	// Costruttore
	private CalcoliHelper() {
	}

	// Metodi Static

	// Somma di due numeri interi
	public static int somma(int primonum, int secondonum) {
		return primonum + secondonum;
	}

	// Differenza tra due numeri
	public static int differenza(int primonum, int secondonum) {

		if (primonum < secondonum) {
			return secondonum - primonum;
		} else {
			return primonum + secondonum;
		}

	}

	// Moltiplicazione di due numeri
	public static int moltiplicazione(int primonum, int secondonum) {
		return primonum * secondonum;
	}

	// Numero Assoluto
	public static int assoluto(int num) {
		if (num >= 0) {
			return num;
		} else {
			return num = -num;
		}
	}

	// Minimo numero
	public static int minore(int primonum, int secondonum) {
		if (primonum < secondonum) {
			return primonum;
		} else {
			return secondonum;
		}
	}

	// Massimo numero
	public static int maggiore(int primonum, int secondonum) {
		if (primonum > secondonum) {
			return primonum;
		} else {
			return secondonum;
		}
	}

}
