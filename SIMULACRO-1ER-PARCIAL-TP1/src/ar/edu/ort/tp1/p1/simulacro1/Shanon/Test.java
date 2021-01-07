package ar.edu.ort.tp1.p1.simulacro1.Shanon;

public class Test {

	public static void main(String[] args) {
		//Completar
		
		EmpresaAgricola empresa = new EmpresaAgricola("Molinos",2);
		
		empresa.cargarResultados();
		empresa.mostrarResultados();
		empresa.procesarResultados();
		
		System.out.println(empresa.buscarCosecha(3));
		System.out.println(empresa.obtenerCosechaConMasKilos());
		System.out.println(empresa.obtenerCosechaConMasAltura());
	}
}