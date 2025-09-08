package Clase06Objetos;

public class Fecha {
	// variables de instancia
	private int dia;
	private int mes;
	private int anio;

	/*
	 * Regla de negocio: decidimos que los años son mayores al 2000
	 * Pre-Condicion: 
	 */
	
	/*
	 * IREP:
	 * -	this.anio >= 2000
	 * -	1 <= this.mes <= 12
	 * -	El dia tiene que ser mayor o igual que 1
	 * 		De acuerdo al mes y el año, debe ser menor
	 * 		o igual a 28, 29, 30 o 31.
	 */
	
	
	public Fecha(int dia, int mes, int anio) {
		setAnio(anio);
		setMes(mes);
		setDia(dia);
	}

	public Fecha(int dia, String nombreMes, int anio) {
		setAnio(anio);
		setMes(convertir(nombreMes));
		setDia(dia);
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		int diasDelMes = diasDelMes(this.mes, this.anio);
		if (dia < 1 || dia > diasDelMes) {
			throw new RuntimeException("Debe ser un día valido");
		}
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		// Pre-condicion
		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Debe ser un mes valido");
		}
		this.mes = mes;
	}
	// Post-condicion: que el this.mes tenga el valor 'mes' si era valido

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if (anio < 2000) {
			throw new RuntimeException("Año no valido");
		}
		this.anio = anio;
	}	

}
