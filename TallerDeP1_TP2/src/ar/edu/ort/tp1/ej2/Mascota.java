package ar.edu.ort.tp1.ej2;

public class Mascota {
	private String nombre;
	private String tipo;
	
	public Mascota(String nom, String tipo) {
		this.setNombre(nom);
		this.setTipo(tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
