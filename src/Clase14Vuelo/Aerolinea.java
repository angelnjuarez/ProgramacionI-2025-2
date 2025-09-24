package Clase14Vuelo;

public class Aerolinea {
	Vuelo[] vuelos;

	int vuelosEn(Tripulante t, String tipoAvion) {
		int cant = 0;
		for (Vuelo v : this.vuelos) {
			if (v.avion.tipo.equals(tipoAvion) && v.estaTripulante(t)) {
				cant++;
			}
		}
		return cant;
	}

	int antiguedadPromedio(String tipoAvion) {
		int cant = 0;
		int sumaAnti = 0;
		for (Vuelo v : this.vuelos) {
			if (v.avion.tipo.equals(tipoAvion)) {
				sumaAnti += v.sumAntiguedad();
				cant++;
			}
		}
		return sumaAnti / cant;
	}
}
