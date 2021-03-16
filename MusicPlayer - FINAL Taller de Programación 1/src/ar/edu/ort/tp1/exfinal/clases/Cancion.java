package ar.edu.ort.tp1.exfinal.clases;

public class Cancion extends Item {
	
	public Cancion(String nombre, String artista, int anioLanzamiento) {
		super(nombre,artista,anioLanzamiento);
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo la " + this.getClass().getSimpleName() + ": " + this.getNombre());
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("Deteniendo la cancion: " + this.getNombre());
	}

	@Override
	public String toString() {
		return "Cancion [" + super.toString() + "]";
	}
}
