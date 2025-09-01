package Clase02ArreglosString;

public class Strings {

	public static boolean esPrimo(int n) {
		for (int i = 2; i < n - 1; i++) {
			if (n % 1 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void saludo(int dia, int mes, int anio) {
		System.out.println("Buen día, hoy es " + dia + "/" + mes + "/" + anio);
	}

	public static boolean puedenColocarse(String a, String b, String c) {
		if (a.length() == 0 || b.length() == 0 || c.isEmpty()) {
			return false;
		}

		a = a.toUpperCase();
		b = b.toUpperCase();
		c = c.toUpperCase();

		for (int i = 0; i < b.length(); i++) {
			if (a.indexOf(b.charAt(i)) != -1) { // ubicamos a en b
				i++;
				for (int j = i + 1; j < b.length(); j++) {
					if (c.indexOf(b.charAt(j)) != -1) { // ubicamos c en b
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	public static boolean esCapicua(String s) {
		s = s.toLowerCase();
		String k = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			k = k + s.charAt(i);
		}
		return s.equals(k); // Devuelve true si son iguales
	}

	public static boolean esDobleteCapicua(String s) {
		for (int i = 0; i < s.length(); i++) {
			String s1 = s.substring(0, i + 1);
			String s2 = s.substring(i + 1);
			if (esCapicua(s1) && esCapicua(s2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		// String a = "Amor";

		// System.out.println(a.charAt(0));
		// System.out.println(a.charAt(9));
//		System.out.println(a.toLowerCase());
//		System.out.println(a);

//		String b = a.toLowerCase();
//		for (int i = 0; i < b.length() - 1; i++) {
//			if (!(b.charAt(i) <= b.charAt(i + 1))) {
//				System.out.println("No es abecedaria");
//			}
//		}
//
//		String c = "amorosa";
//		System.out.println(c.substring(0));
//		System.out.println(c.substring(3));
//		System.out.println(c.substring(2, 4));

		// System.out.println(esCapicua("Neuquen"));
		System.out.println(esDobleteCapicua("ananaoso"));
	}

}
