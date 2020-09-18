package ar.edu.ort.tp1.ej3;

import java.util.ArrayList;

public class Vivienda {
	private String nombre;
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda() {
		this.direccion = null;
	}
	
	public Vivienda(String nombre) {
		this.setNombre(nombre);
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void mostrarTodo() {
		System.out.println("--------------------------------------");
		System.out.println(this.nombre);
		
		if (direccion != null) {
			System.out.println("Direccion: " + direccion.getCalle() + " " + direccion.getAltura() + " "
		+ direccion.getPiso() + direccion.getDepto());
		} else {
			System.out.println("Esta casa no tiene direccion.");
		}
		System.out.println();
		
		System.out.println("Personas:");
		if (this.personas.size() != 0) {
			for (int i = 0; i < this.personas.size(); i++) {
				System.out.println("Nombre: " + this.personas.get(i).getApellido() + " " + this.personas.get(i).getNombre()
						+", Edad: " + this.personas.get(i).getEdad());
			}
		} else {
			System.out.println("No viven personas en esta vivienda.");
		}
		System.out.println();

		System.out.println("Muebles:");
		if (this.muebles.size() != 0) {
			for (int i = 0; i < this.muebles.size(); i++) {
				System.out.println(this.muebles.get(i).getNombre() + " de " + this.muebles.get(i).getMaterial()
						+ ", color " + this.muebles.get(i).getColor() + ".");
			}
		} else {
			System.out.println("No hay muebles en esta vivienda.");
		}
		System.out.println("--------------------------------------");
	}
	
	public void agregarDireccion(String calle, int altura, int piso, String depto) {
		this.direccion = new Direccion(calle, altura, piso, depto);
	}
	
	public void agregarPersona(String nombre, String apellido, int edad) {
		this.personas.add(new Persona(nombre, apellido, edad));
	}
	
	public void agregarMueble(String nombre, String material, String color) {
		this.muebles.add(new Mueble(nombre, material, color));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}
}
