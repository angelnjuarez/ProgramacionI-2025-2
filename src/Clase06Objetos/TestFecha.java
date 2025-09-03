package Clase06Objetos;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f1=new Fecha(3,9,2025);
		f1.imprimir();
//		Fecha f2=new Fecha(20,"Agosto",2024);
//		f2.imprimir();
//		System.out.println(Fecha.diasDelMes(6,2025));
//        System.out.println(f1.esValida());
		Fecha f3= new Fecha(20,9,2025);
		System.out.println(f1.antesQue(f3));
	}

}
