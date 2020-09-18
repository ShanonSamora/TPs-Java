package ar.edu.ort.tp1.enu;

public class Telefono {
	private CodigosDeArea codigoDeArea;
	private int caracteristica;
	private int numeroAbonado;
	
	public Telefono (CodigosDeArea codigoDeArea, int caracteristica, int numeroAbonado) {
		this.codigoDeArea = codigoDeArea;
		this.caracteristica = caracteristica;
		this.numeroAbonado = numeroAbonado;
	}
	
	public void imprimirTelefono() {
		System.out.println("Codigo de Area: " + (codigoDeArea.ordinal()+1));
		System.out.println("Caracteristica: " + caracteristica);
		System.out.println("N de abonado: " + numeroAbonado);
	}
	
	public void decimeTuPais() {
		System.out.println(codigoDeArea.name());
	}
}
