package Clase03IntroRecursion;

public class Recursion {

	public static int sumatoriaRec(int n) {
		if (n == 1) {
			return n;
		}
		return n + sumatoriaRec(n - 1);
	}

	public static int sumaParesRec(int n) {
		if (n == 2) {
			return n;
		}
		if (n % 2 == 0) {
			return n + sumaParesRec(n - 2);
		}
		return sumaParesRec(n - 1);
	}

	public static int sumaParesRecT(int n) {
		if (n == 2) {
			return n;
		}
		return n % 2 == 0 ? n + sumaParesRec(n - 2) : sumaParesRec(n - 2);
	}

	public static double potencia(double base, int exponente) {
		if (exponente == 0) {
			return 1;
		}
		return base * potencia(base, exponente - 1);

	}

	public static void main(String[] args) {
		// System.out.println(sumaParesRecT(10))
		System.out.println(potencia(3.2, 3));
	}

}
