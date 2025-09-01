package Clase05FuncionesAuxRec;

public class Test {
	public static void main(String[] args) {

		int[] ar = { 5, 8, 9, 4, 3, 0, 1 };
		RecursionArreglos.imprimir(ar);
		System.out.println(RecursionArreglos.suma(ar));
		System.out.println(RecursionArreglos.pertenece(ar, 1));

	}
}
