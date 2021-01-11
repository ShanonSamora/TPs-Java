package ort.tp1.tdas.ejercicios.ej1;

import ort.tp1.tdas.ejercicios.ej1.clases.FabricanteDePelotas;
import ort.tp1.tdas.ejercicios.ej1.clases.PelotaDeTenis;
import ort.tp1.tdas.ejercicios.ej1.clases.TuboPelotasDeTenis;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();
		// Jugador
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);
		while(!tuboDePelotas.estaVacio()) {
			pelota = tuboDePelotas.extraer();
			System.out.println(pelota);
		}
	}

}
