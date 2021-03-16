package ar.edu.ort.tp1.exfinal.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class MusicPlayer implements Reproducible, Mostrable {

	private static final String ITEM_NO_PUEDE_SER_NULO = "El Item no puede ser nulo.";
	private static final String ITEM_YA_EXISTENTE = "El item ingresado ya existe en el reproductor";
	private static final String NOMBRE_NO_PUEDE_SER_NULO = "El  nombre no puede ser nulo";
	private static final String ITEM_NO_ENCONTRADO = "El item no fue encontrado";
	
	//TODO A implementar Atributos faltantes
	private String nombre;
	private ListaOrdenada<String, Item> items;
	private Cola<Item> playlist;
	private Pila<Item> ultimosReproducidos;

	public MusicPlayer(String nombre) {
		//TODO A implementar
		this.setNombre(nombre);
		this.items = new ListadoPorNombre();
		this.playlist = new ColaNodos<>();
		this.ultimosReproducidos = new PilaNodos<>();
	}

	/**
	 * Agrega un item al listado de disponibles. este item, que se identifica con un
	 * nombre, no podrá estar repetido en la lista y tampoco podrá ser nulo.
	 * 
	 * @param item el Item a agregar.
	 */
	public void agregarItemDisponible(Item item) throws IllegalArgumentException {
		//TODO A implementar 
		if (item == null) {
			throw new IllegalArgumentException(ITEM_NO_PUEDE_SER_NULO);	
		} 
		
		Item unItem = this.buscarItemPorNombre(item.getNombre());
		if (unItem != null) {
			throw new IllegalArgumentException(ITEM_YA_EXISTENTE);
			
		}
		this.items.add(item);
	
	}

	public Item buscarItemPorNombre(String nombre)  throws IllegalArgumentException  {
		//TODO A implementar 
		/*Item item = null;
		int i = 0;*/
		
		if (nombre == null) {
			throw new IllegalArgumentException(NOMBRE_NO_PUEDE_SER_NULO);
		}
		
		/*while (item == null && i < this.items.size()) {
			if (this.items.get(i).getNombre().equals(nombre)) {
				item = this.items.get(i);
			} else {
				i++;
			}
		}*/
		
		Item itemm = this.items.search(nombre);
		
		return itemm;
	}

	public void agregarPlaylist(Item item)   throws IllegalArgumentException {
		//TODO A implementar
		if (item == null) {
			throw new IllegalArgumentException(ITEM_NO_PUEDE_SER_NULO);
		}
		this.playlist.add(item);
	}

	@Override
	public void detener() {
		System.out.println("No implementado, se detendrá la reproducción en curso.");
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Reproductor: " + this.nombre);
		
		System.out.println("Reproducibles disponibles:");
		for (Item item : items) {
			System.out.println(item.toString());
		}
		
		
		System.out.println("--------------------");
		System.out.println("Ultimos escuchados:");
		
		Pila<Item> aux = new PilaNodos<>();
		while (!this.ultimosReproducidos.isEmpty()) {
			aux.push(this.ultimosReproducidos.pop());
		}
		while (!aux.isEmpty()) {
			Item error = aux.pop();
			System.out.println(error);
			this.ultimosReproducidos.push(error);
		}
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo playlist");
		
		Item i = null;
		this.playlist.add(i);
		Item aux = this.playlist.remove();
		
		while (aux != i) {
			aux.reproducir();
			this.playlist.add(aux);
			aux = this.playlist.remove();
		}
	}
	
	//TODO Agregar métodos faltantes
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
