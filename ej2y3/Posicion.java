package ar.edu.ort.tp1.ej2y3;

import java.util.ArrayList;

public class Posicion {
	private ArrayList<Atleta> lAtletas;
	private double tiempo;
	
	public Posicion() {
		this.lAtletas = new ArrayList<Atleta>();
		tiempo = 9999;
	}
	
	public void agregarAtleta(Atleta atleta) {
		this.lAtletas.add(atleta);
	}

	public ArrayList<Atleta> getlAtletas() {
		return lAtletas;
	}

	public void setlAtletas(ArrayList<Atleta> lAtletas) {
		this.lAtletas = lAtletas;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
}
