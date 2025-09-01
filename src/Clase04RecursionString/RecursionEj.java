package Clase04RecursionString;

public class RecursionEj {
	public static int sumarParesHasta(int n) {
		// caso base
		if (n == 0) {
			return 0;
		}
		// caso recursivo
		if (n % 2 == 0) {
			return n + sumarParesHasta(n - 2);
		}
		return sumarParesHasta(n - 1);

	}

	public static void imprimirHasta(int n) {
		// caso base
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		// caso recursivo
		RecursionEj.imprimirHasta(n - 1);
		System.out.print(n + " ");

	}

	public static void imprimirDesde(int n) {
		// caso base
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		// caso recursivo
		System.out.print(n + " ");
		RecursionEj.imprimirDesde(n - 1);

	}

	public static int cantidadPrimosEntre(int n, int m) {
		// caso base
		if (n > m) {
			return 0;
		}

		// caso recusivo
		if (esPrimo(n)) {
			return 1 + cantidadPrimosEntre(n + 1, m);
		}
		return cantidadPrimosEntre(n + 1, m);
	}

	public static boolean esPrimo(int n) {
		int cont = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				cont++;
			}
		}
		return cont == 1;
	}

	public static int siguientePrimo(int n) {

		// caso recursivo - caso base
		if (esPrimo(n + 1)) {
			return n + 1;
		}
		return siguientePrimo(n + 1);
	}

	public static boolean esPar(int n) {
		// caso base
		if (n == 0) {
			return true;
		}
		if (n == 1) {
			return false;
		}
		// caso recursivo
		return esPar(n - 2);

	}

	public static int cantidadDigitos(int n) {
		// caso base
		if (n < 10) {
			return 1;
		}

		// caso recursivo
		return 1 + cantidadDigitos(n / 10);
	}

	// ------------------------ recursion con String

	public static String intercalarAs(String s) {
		// caso base
		if (s.length() == 1) {
			return s;
		}

		// caso recursivo
		return s.charAt(0) + "*" + intercalarAs(s.substring(1));
	}

	public static String sinRepetidos(String s) {
		// caso base
		if (s.length() == 1) {
			return s;
		}

		// caso recursivo
		if (s.charAt(0) == s.charAt(1)) {
			return sinRepetidos(s.substring(1));
		}
		return s.charAt(0) + sinRepetidos(s.substring(1));
	}

	public static int cantidadRepetidos(String s, char c) {
		// caso base
		if (s.isEmpty()) {
			return 0;
		}

		// caso recursivo
		// if(s.charAt(0) == c) {
		if (s.charAt(0) == c) {
			return 1 + cantidadRepetidos(s.substring(1), c);
		}
		return cantidadRepetidos(s.substring(1), c);
	}

	public static boolean sonIguales(String s1, String s2) {
		if (s1.isEmpty() && s2.isEmpty()) {
			return true;
		}

		// caso recursivo
		if (s1.charAt(0) == s2.charAt(0)) {
			return sonIguales(s1.substring(1), s2.substring(1));
		}
		return false;
	}

	public static boolean esPrefijo(String s, String prefijo) {
		// cado base
		if (prefijo.isEmpty()) {
			return true;
		}
		// caso recursivo
		if (s.charAt(0) == prefijo.charAt(0)) {
			return esPrefijo(s.substring(1), prefijo.substring(1));
		}
		return false;
	}

	static boolean esPrefijoDesde(String s, String prefijo, int posicion) {

		// caso recursivo
		if (posicion > 0) {
			return esPrefijoDesde(s.substring(1), prefijo, posicion - 1);
		}
		return esPrefijo(s, prefijo);
	}

}

// n=8 0 1 2 3 4 5 6 7 8  hasta
// n=8 8 7 6 5 4 3 2 1  desde8

// rango  [n,m] n <= m   n=3 m=9   1 2 3 4 5 6 7 8 9 10 11 12 13

// n=6 proximo primo mayor  7

// n=6 par     6-2 4-2 2-2 0  es par
// n=9 9-2 7-2 5-2 3 3-2 1  es impar

// n=728    728/10  72/10 7/10 0

// intercalar *  "hola"  h*"ola" h*o*"la"  h*o*l*"a"  h*o*l*a
// "pollos"

// s="subacadena"  prefijo="cad" pos=4

// s1="abcdefghijkl"   s2=fgh1"
