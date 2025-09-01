package Clase05FuncionesAuxRec;

public class RecursionArreglos {

	public static void imprimir(int a[]) {
		imprimir(a, 0);
	}

	private static void imprimir(int a[], int i) {
		if (i >= a.length) {
			System.out.println();
			return;
		}
		System.out.print(a[i] + " ");
		imprimir(a, i + 1);
	}

	public static int suma(int[] b) {
		return suma(b, 0);
	}

	private static int suma(int[] b, int i) {
		if (i == b.length) {
			return 0;
		}
		return b[i] + suma(b, i + 1);
	}

	public static boolean pertenece(int[] a, int n) {
		return pertenece(a, 0, n);
	}

	private static boolean pertenece(int[] a, int i, int n) {
		if (i >= a.length) {
			return false;
		}
		if (a[i] == n) {
			return true;
		}
		return pertenece(a, i + 1, n);
	}
}
