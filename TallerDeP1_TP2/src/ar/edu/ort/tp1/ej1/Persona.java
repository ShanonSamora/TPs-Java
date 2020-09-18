package ar.edu.ort.tp1.ej1;

import java.util.ArrayList;

import ar.edu.ort.tp1.ej2.Mascota;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String apellido, String nombre) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.emails = new ArrayList<Email>();
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.mascotas = new ArrayList<Mascota>();
	}
	
	public void mostrarTodoConMascotas() {
		this.mostrarTodo();
		System.out.println("Mascotas:");
		if (this.mascotas.size() != 0) {
			for (int i = 0; i < this.mascotas.size(); i++) {
				System.out.println(this.mascotas.get(i).getTipo() + ", "+ this.mascotas.get(i).getNombre());
			}
		} else {
			System.out.println("Esta persona no tiene mascotas.");
		}
		System.out.println("--------------------");
	}
	
	public void mostrarTodo() {
		System.out.println(apellido + ", " + nombre);
		
		System.out.println("--------------------");
		System.out.println("Email/s:");
		if (this.emails.size() != 0) {
			for (int i = 0; i < this.emails.size(); i++) {
				System.out.println(this.emails.get(i).getMail());
			}
		} else {
			System.out.println("Esta persona no tiene emails");
		}
		System.out.println("--------------------");
		
		System.out.println("Telefono/s:");
		if (this.telefonos.size() != 0) {
			for (int i = 0; i < this.telefonos.size(); i++) {
				System.out.println(this.telefonos.get(i).getNumero());
			}
		} else {
			System.out.println("Esta persona no tiene telefonos.");
		}
		System.out.println("--------------------");
	}
	
	public void agregarEmail(String mail) {
		this.emails.add(new Email(mail));
	}
	public void agregarTelefono(NumeroTelefonico nro) {
		this.telefonos.add(nro);
	}
	public void agregarMascota(String nombre, String tipo) {
		this.mascotas.add(new Mascota(nombre, tipo));
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<NumeroTelefonico> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<NumeroTelefonico> telefonos) {
		this.telefonos = telefonos;
	}

	public ArrayList<Email> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<Email> emails) {
		this.emails = emails;
	}
}
