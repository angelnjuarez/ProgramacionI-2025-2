package Clase14Vuelo;

public class Vuelo {
	Avion avion;
	Tripulante[] tripulacion;

	public boolean estaTripulante(Tripulante t) {
		for (Tripulante tr : this.tripulacion) {
			if (tr.equals(t)) {
				return true;
			}
		}
		return false;
	}

	public int sumAntiguedad() {
		int cant = 0;
		for (Tripulante tr : this.tripulacion) {
			cant += tr.antiguedad;
		}
		return cant;
	}
}
