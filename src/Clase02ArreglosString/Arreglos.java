package Clase02ArreglosString;

import java.util.Arrays;

public class Arreglos {

	public static void agregarElem(int[] ar, int elem) {
		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
		ar2[ar2.length - 1] = elem;
		ar = ar2;
	}

	public static boolean estaElem(int[] ar, int elem) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == elem) {
				return true;
			}
		}
		return false;
	}

	public static int[] quitar(int[] a, int pos) {
		int j = 0;
		int[] a2 = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i != pos) {
				a2[j] = a[i];
				j++;
			}
		}
		return a2;
	}

	public static void main(String[] args) {
//		int[] ar = new int[5];
//		ar[0] = 2;
//		ar[1] = 4;
//		ar[2] = 6;
//		ar[3] = 8;
//		ar[4] = 10;
		int[] ar = { 2, 4, 6, 8, 10 };
//		double[] ar2 = { 1.0, 3.0, 5.1, 7.0, 9.5 };
//
//		double[] ar3; // NULL
//		ar3 = new double[2];
//		System.out.println(ar3[0]);

		int[] ar2 = quitar(ar, 2);
		System.out.println(Arrays.toString(ar2));
	}
}
