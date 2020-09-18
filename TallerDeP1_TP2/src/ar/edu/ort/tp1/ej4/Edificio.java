package ar.edu.ort.tp1.ej4;

import java.util.ArrayList;

import ar.edu.ort.tp1.ej3.Vivienda;

public class Edificio {
	private ArrayList<Vivienda> viviendas;
	
	public Edificio() {
		this.viviendas = new ArrayList<Vivienda>();
	}
	
	public void realizarMudanza(Vivienda origen, Vivienda destino) {
		if (origen.getPersonas() != null) {
			destino.getPersonas().addAll(origen.getPersonas());
			origen.getPersonas().clear();
		} else {
			System.out.println("No hay personas que mudar en " + origen.getNombre());
		}
		if (origen.getMuebles() != null) {
			destino.getMuebles().addAll(origen.getMuebles());
			origen.getMuebles().clear();
		} else {
			System.out.println("No hay muebles que mudar en " + origen.getNombre());
		}
	}
	
	public void agregarVivienda(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}

	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	
}
