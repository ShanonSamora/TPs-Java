package ar.edu.ort.tp1.ej2y3;

import java.util.ArrayList;

public class Competencia {
	private String nombre;
	private ArrayList<Atleta> atletasConcursantes;
	
	public Competencia(String nombre) {
		this.setNombre(nombre);
		this.atletasConcursantes = new ArrayList<Atleta>();
	}
	
	public void agregarParticipantes(Atleta atletaParticipante) {
		this.atletasConcursantes.add(atletaParticipante);
	}
	
	public Posicion[] getTernaGanadores() {
		Posicion p1 = new Posicion();
		Posicion p2 = new Posicion();
		Posicion p3 = new Posicion();
		Posicion[] arrPosiciones = new Posicion[3];
		int j;
		double primero = 9999;
		double segundo = 9999;
		double tercero = 9999;
		Atleta atleta = null;
		
		if (atletasConcursantes.size() > 0) {
			for (int i = 0; i < atletasConcursantes.size(); i++) {
				atleta = atletasConcursantes.get(i);
				j = 0;
				
				if (atletasConcursantes.get(i).getTiempo() < primero) {
					tercero = segundo;
					segundo = primero;
					primero = atletasConcursantes.get(i).getTiempo();
				} else {
					if ((atletasConcursantes.get(i).getTiempo() > primero) && atletasConcursantes.get(i).getTiempo() < tercero) {
						tercero = segundo;
						segundo = atletasConcursantes.get(i).getTiempo();
					} else {
						if (atletasConcursantes.get(i).getTiempo() > segundo && atletasConcursantes.get(i).getTiempo() < tercero) {
							tercero = atletasConcursantes.get(i).getTiempo();
						}
					}
				}
			}
			p1.setTiempo(primero);
			p2.setTiempo(segundo);
			p3.setTiempo(tercero);
			arrPosiciones[0] = p1;
			arrPosiciones[1] = p2;
			arrPosiciones[2] = p3;
			/*
			ternaGanadora.add(p1);
			ternaGanadora.add(p2);
			ternaGanadora.add(p3);
			*/
			for (int i = 0; i < atletasConcursantes.size();i++) {
				for (j=0; j<arrPosiciones.length;j++) {
					if (atletasConcursantes.get(i).getTiempo() == arrPosiciones[j].getTiempo()) {
						arrPosiciones[j].agregarAtleta(atletasConcursantes.get(i));
					}
				}
			}
		}
		return arrPosiciones;
	}
	
	public ArrayList<Atleta> getGanadores() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = atletasConcursantes.get(0).getTiempo();
		
		for (Atleta atleta: atletasConcursantes) {
			if (atleta.getTiempo() < mejorTiempo) {
				ganadores.clear();
				ganadores.add(atleta);
				mejorTiempo = atleta.getTiempo();
			} else if (atleta.getTiempo()==mejorTiempo) {
				ganadores.add(atleta);
			}
		}
		return ganadores;
	}
	
	public void mostrarGanadores() {
		System.out.println("Los ganadores de la carrera de " + " - " + this.nombre + " - " + " son:");
		System.out.println("\n" + getGanadores());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atleta> getAtletasConcursantes() {
		return atletasConcursantes;
	}

	public void setAtletasConcursantes(ArrayList<Atleta> atletasConcursantes) {
		this.atletasConcursantes = atletasConcursantes;
	}
}
