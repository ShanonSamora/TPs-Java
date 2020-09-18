package ar.edu.ort.tp1.ej4y5;

public class Test {

	public static void main(String[] args) {
		System.out.println("---------EJ 4---------");
		Anio anio1 = new Anio();
		
		System.out.println("Obtener nombre de un mes:");
		System.out.println(anio1.getNombreDelMes(12));
		System.out.println(anio1.getNombreDelMes(8));
		
		System.out.print("Dias transcurridos: ");
		System.out.println(anio1.diasTranscurridos(12));
		
		System.out.println("---------EJ 5---------");
		AnioV2 anio2 = new AnioV2();
		
		System.out.println("Obtener nombre de un mes: ");
		anio2.imprimirMes(1);
		anio2.imprimirMes(2);
		anio2.imprimirMes(3);
		anio2.imprimirMes(4);
		anio2.imprimirMes(5);
		anio2.imprimirMes(6);
	}

}
