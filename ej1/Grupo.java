package ar.edu.ort.tp1.ej1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		this.setNombre(nombre);
		this.integrantes = new ArrayList<String>();
	}
	
	public int getCantidadIntegrantes() {
		return integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if (getCantidadIntegrantes() == 0) {
			integrantes.add(nombreIntegrante);
			System.out.println("Se agrego " + nombreIntegrante + " al grupo: " + getNombre());
		} else {
			if (obtenerPosicionIntegrante(nombreIntegrante) == -1) {
				integrantes.add(nombreIntegrante);
				System.out.println(nombreIntegrante + " fue asignado al grupo: "+ getNombre());
			}
		}
	}
	
	public String buscarIntegrante(String nombre) {
		int pos = obtenerPosicionIntegrante(nombre);
		if (pos != -1) {
			return integrantes.get(pos);
		} else {
			return null;
		}
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		int pos = obtenerPosicionIntegrante(nombreIntegrante);
		if (pos != -1) {
			integrantes.remove(pos);
			return nombreIntegrante;
		} else {
			return null;
		}
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		boolean encontro = false;
		while (i < integrantes.size() && !encontro) {
			if (integrantes.get(i).equals(nombreIntegrante)) {
				encontro = true;
			} else {
				i++;
			}
		}
		if (encontro) {
			return i;
		} else {
			return -1;
		}
	}
	
	public String obtenerIntegrante(int posicionPedida) {
		if (posicionPedida < integrantes.size() && posicionPedida >= 1)
			return integrantes.get(posicionPedida-1);
		else
			return null;
	}
	
	private void mostrarIntegrantes() {
		if (getCantidadIntegrantes() > 0) {
			System.out.println("En total " + getCantidadIntegrantes() + " integrantes y sus nombres son: ");
			for (int i = 0; i < integrantes.size(); i++) {
				System.out.println("Integrante: " + integrantes.get(i));
			}
		} else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void mostrar() {
		if (integrantes.size() > 0) {
			System.out.println("El grupo: " + this.nombre + " tiene ");
			mostrarIntegrantes();
		} else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void vaciar() {
		integrantes.clear();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}
	
}
