package ar.edu.ort.tp1.enu;

public class Test {
	
	public static void main(String[] args) {
		Telefono nroArgentina1 = new Telefono(CodigosDeArea.ARGENTINA, 1111, 2222);
		nroArgentina1.imprimirTelefono();
		nroArgentina1.decimeTuPais();
		
		for (int i = 0; i<CodigosDeArea.values().length; i++) {
			System.out.println("Codigo: " + (CodigosDeArea.values()[i].ordinal()+1) + " - " + 
		CodigosDeArea.values()[i].name());
		}
		
		codigoDeArea(CodigosDeArea.CANADA);
		System.out.println("--------------");
		nombreCodigoDeArea(2);

	}
	
	public static void codigoDeArea(CodigosDeArea codigo) {
		System.out.println((codigo.ordinal()+1));
	}
	public static void nombreCodigoDeArea(int codigo) {
		System.out.println(CodigosDeArea.values()[codigo-1].name());
	}
}
