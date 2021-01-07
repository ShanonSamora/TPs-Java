package preparcial1;

import java.util.ArrayList;

import preparcial1.clases.Fecha;
import preparcial1.clases.CicloDeCharlas;
import preparcial1.clases.Ticket;

public class Main {

	private static final int MAX_VACANTES = 50;

	public static void main(String[] args) {
		ArrayList<String> peliculas = obtenerPeliculas();
		
		CicloDeCharlas miCicloDeCharlas = new CicloDeCharlas("Visitantes", new Fecha(2020, 9, 22), peliculas, MAX_VACANTES);
		Ticket reg = miCicloDeCharlas.registrarEspectador(1, "Eloy Ente");
		System.out.println(reg);
		reg = miCicloDeCharlas.registrarEspectador(8, "Juan Pirulo");
		System.out.println(reg);
		reg = miCicloDeCharlas.registrarEspectador(8, "Eloy Ente");
		System.out.println(reg);
		reg = miCicloDeCharlas.registrarEspectador(10, "Eloy Ente");
		System.out.println(reg);
		
		System.out.println();
		miCicloDeCharlas.mostrarCartelera();
	}

	private static ArrayList<String> obtenerPeliculas() {
		ArrayList<String> peliculas = new ArrayList<>();
		peliculas.add("Alien");
		peliculas.add("Mars Attack");
		peliculas.add("Encuentros Cercanos");
		peliculas.add("Avatar");
		peliculas.add("El arribo");
		return peliculas;
	}

}
