package ar.edu.ort.tp1.ej2y3;

public class Atleta {
	private String nombre;
	private double tiempo;
	
	public Atleta(String nom, double tiem) {
		this.setNombre(nom);
		this.setTiempo(tiem);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [Nombre= " + nombre + ", Tiempo= " + tiempo + "]";
	}
	
}
