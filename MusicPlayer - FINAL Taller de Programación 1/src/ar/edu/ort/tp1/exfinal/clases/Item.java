package ar.edu.ort.tp1.exfinal.clases;

public abstract class Item implements Reproducible {
	//TODO A implementar 
	private String nombre;
	private String artista;
	private int anioLanzamiento;
	
	public Item(String nombre, String artista, int anioLanzamiento) {
		this.setNombre(nombre);
		this.setArtista(artista);
		this.setAnioLanzamiento(anioLanzamiento);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre.equals(null) || nombre.isEmpty()) {
			throw new RuntimeException("El nombre no puede estar vacio o ser null");
		}
		this.nombre = nombre;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if (artista.equals(null) || artista.isEmpty()) {
			throw new RuntimeException("El nombre del artista no puede ser null");
		}
		this.artista = artista;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", artista=" + artista + ", anioLanzamiento=" + anioLanzamiento;
	}
	
	
}
