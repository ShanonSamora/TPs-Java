package ar.edu.ort.tp1.exfinal.clases;

public class Podcast extends Item {
	
	public Podcast(String nombre, String artista, int anioLanzamiento) {
		super(nombre,artista,anioLanzamiento);
	}
	
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo el " + this.getClass().getSimpleName() + ": " + this.getNombre());
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("Deteniendo el podcast: " + this.getNombre());
	}

	@Override
	public String toString() {
		return "Podcast [" + super.toString() + "]";
	}
}
