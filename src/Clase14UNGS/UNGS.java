package Clase14UNGS;

public class UNGS {

	Comision[] comisiones;

	boolean cursaCon(Estudiante e, Docente d)  {
		for (Comision con:this.comisiones) {
			if(con.estaDocente(d) && con.estaEstudiante(e)) {
				return true;
			}
		}
		return false;
	}
	
	boolean suficientesDocentes() {
		for(Comision co:this.comisiones) {
			if(co.inscriptos.length / 20.0 < co.docentes.length ) {
				return false;
			}
		}
		return true;
	}
	Estudiante elMasEstudioso() {
		 Estudiante masEst=comisiones[0].inscriptos[0];
		 int cantMat=cantidadAprobadas(masEst);
		 for(Comision co:this.comisiones) {
			 for(Estudiante e:co.inscriptos) {
				 if(cantidadAprobadas(e) > cantMat) {
					 masEst=e;
					 cantMat=cantidadAprobadas(e);
				 }
				 
			 }
		 }
		
		 return masEst;
 	}

	private int cantidadAprobadas(Estudiante masEst) {
		int cant=0;
		for(Comision cc:this.comisiones) {
			for(int i=0; i < cc.inscriptos.length;i++) {
				if(cc.inscriptos[i].equals(masEst) &&
					cc.calificaciones[i] >= 4) {
					cant++;
				}
			}
		}
		return cant;
	}
	 public int losMejores() {
		 
		 int cantAlum=0;
		 //para cada comision
		  
		 for(Comision c: this.comisiones) {
			 // calcula la mejor nota
             
              // cuento los alumnos que obtivieron la mejor nota
            cantAlum += c.alumnosConMejorNota(c.laMejorNota());
            
		 }
		 
		 return cantAlum;
	 }
	 public int alumnosDe(Docente d) {
		 int cant=0;
		 for(Comision c:this.comisiones) {
			 if( c.estaDocente(d)) {
				 cant +=c.inscriptos.length;
			 }
		 }
		 return cant;
	 }
	  public int unicaComision() {
		 int cantUna=0;
		 for(Comision c:this.comisiones) {
			 if( cantComisiones(c.materia) == 1) {
				 cantUna ++;
			 }
		 }
		 return cantUna;
	 }
	 public int cantComisiones(String m) {
		 int cant=0;
		 for(Comision c:this.comisiones) {
			 if(c.materia.equals(m)) {
				 cant ++;
			 }
		 }
		 return cant;
	 }
	 
}











