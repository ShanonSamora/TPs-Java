package ar.edu.ort.tp1.ej4y5;

public class Anio {
	private String[] meses;
	private int[] cantidadDiasMes = new int[12];
	
	public Anio() {
		this.cantidadDiasMes = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		this.meses = new String[] {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
	}
	
	public String getNombreDelMes(int numeroMes) {
		if (numeroMes <= 12 && numeroMes > 0) {
			return meses[numeroMes-1];
		} else {
			return null;
		}
	}
	
	public int diasTranscurridos(int numeroMes) {
		int result = 0;
		result = this.cantidadDiasMes[numeroMes-1];
		return result;
	}
}
