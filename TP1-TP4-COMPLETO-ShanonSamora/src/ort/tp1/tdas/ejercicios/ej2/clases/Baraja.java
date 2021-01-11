package ort.tp1.tdas.ejercicios.ej2.clases;

import java.util.ArrayList;

import ort.tp1.tdas.implementaciones.ColaNodos;
import ort.tp1.tdas.implementaciones.PilaNodos;
import ort.tp1.tdas.interfaces.Cola;
import ort.tp1.tdas.interfaces.Pila;

public abstract class Baraja {

	protected Pila<Naipe> naipes;

	public Baraja(boolean mezclado) {
		naipes = new PilaNodos<Naipe>();
		cargarNaipes();
		if (mezclado) {
			mezclar();
		}
	}

	public void agregar(ArrayList<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove(0));			
		}
	}

	public void agregar(Cola<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove());			
		}
	}

	public void agregar(Naipe naipe) {
		naipes.push(naipe);
	}

	public void agregar(Pila<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.pop());			
		}
	}

	protected abstract void cargarNaipes();

	public Naipe extraer() {
		return naipes.pop();
	}

	public Cola<Naipe> extraer(int cuantos) {
		Cola<Naipe> monton = new ColaNodos<>();
		int cont = 0;
		while (!naipes.isEmpty() && cont < cuantos) {
			monton.add(naipes.pop());
			cont++;
		}
		return monton;
	}

	public int getCantidadNaipes() {
		return naipes.size();
	}

	protected void mezclar() {
		// para preguntar en la practica
		Urna<Naipe> mezclador = new Urna<>();
		while (!naipes.isEmpty()) {
			mezclador.add(naipes.pop());
		}
		while (!mezclador.isEmpty()) {
			naipes.push(mezclador.remove());
		}
	}
}