package Clase06Objetos;

public class Fecha {
	// variables de instancia
	int dia;
	int mes;
	int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha(int dia, String nombreMes, int anio) {
		this.dia = dia;
		this.anio = anio;
		this.mes = convertir(nombreMes);
	}

	public int convertir(String m) {
		String mesX = m.toLowerCase();
		String[] aux = { "enero", "febreo", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre",
				"octubre", "noviembre", "diciembre" };
		for (int i = 0; i < 13; i++) {
			if (aux[i].equals(mesX)) {
				return i + 1;
			}
		}
		return -1;
	}

	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);

	}

	public static boolean esBisiesto(int aaaa) {
		if (aaaa % 4 == 0 && aaaa % 100 != 0) {
			return true;
		}
		if (aaaa % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (mes == 2) {
			return esBisiesto(anio) ? 29 : 28;
		}
		return mes == 4 || mes == 6 || mes == 9 || mes == 11 ? 30 : 31;
	}

	public boolean esValida() {
		if (this.mes < 1 || this.mes > 12) {
			System.out.println("Invalida");
			return false;
		}
		if (this.anio < 2000 || this.anio > 2026) {
			System.out.println("Invalida");
			return false;
		}
		if (this.dia < 1 || this.dia > diasDelMes(this.mes, this.anio)) {
			System.out.println("Invalida");
			return false;
		}
		return true;
	}

	public boolean antesQue(Fecha otra) { // considera anio >= 2000
		return (cantDias(this) < cantDias(otra));
	}

	private int cantDias(Fecha f) {
		int cant = 0;
		for (int i = 2000; i < f.anio; i++) {
			cant = cant + (esBisiesto(i) ? 366 : 365);
		}
		return cant + f.diaDelAnio();
	}

	public int diaDelAnio() {
		int cant = 0;
		for (int i = 1; i < this.mes; i++) {
			cant = cant + diasDelMes(i, this.anio);
		}
		cant = cant + this.dia;
		return cant;
	}

	public int diasDeDiferenciaCon(Fecha otra) {
		return Math.abs(cantDias(this) - cantDias(otra));
	}
}
