package Clase14UNGS;

public class Comision {
	String materia; 
	int numero; 
	Docente[] docentes; 
	Estudiante[] inscriptos; 
	int[] calificaciones;


	public boolean estaEstudiante(Estudiante e2) {
		for(Estudiante e:this.inscriptos){
			if(e.equals(e2)) {
				return true;
			}
		}

		return false;
	}

	public boolean estaDocente(Docente d2) {
		for(Docente d:this.docentes) {
			if(d.equals(d2)) {
				return true;
			}
		}
		return false;
	}

	public int laMejorNota() {
		int mejorNota=0;  
		//for(Integer cal:this.calificaciones) 
		for(int i=0; i < this.calificaciones.length;i++){
			//	 if( cal > mejorNota) {
			if(calificaciones[i] > mejorNota) {
				mejorNota=calificaciones[i];
			}
		}
		return mejorNota;
	}

	public int alumnosConMejorNota(int mejorNota) {
		// TODO Auto-generated method stub
		int cantAlum=0;
		for(int i=0; i < this.inscriptos.length;i++) {
			if(this.calificaciones[i] == mejorNota) {
				cantAlum++;
			}
		} 
		return cantAlum;	
	}

}