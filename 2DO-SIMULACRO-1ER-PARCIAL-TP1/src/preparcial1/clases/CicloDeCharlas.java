package preparcial1.clases;

import java.util.ArrayList;

public class CicloDeCharlas {
	private static final int CANT_DIAS_DIFERENCIA = 10;
	private static final int CANT_TANDAS = 2;
	private String nombreFestival;
	private Charla[][] charlas;
	private Fecha fechaInicial;

	public CicloDeCharlas(String nombreFestival, Fecha fechaInicial, ArrayList<String> peliculas, int maxEspectadores) {
		// TODO - Punto 1A - Desarrollar el constructor
		this.setNombreFestival(nombreFestival);
		this.setFechaInicial(fechaInicial);
		this.charlas = new Charla[CANT_TANDAS][peliculas.size()];
		completarCharlas(peliculas, maxEspectadores);
	}
	
	private void completarCharlas(ArrayList<String> peliculas, int maxEspectadores) {
		String nombrePelicula;
		for (int nroPelicula=0; nroPelicula < peliculas.size(); nroPelicula++) {
			nombrePelicula = peliculas.get(nroPelicula);
			for (int nroTanda = 0; nroTanda < CANT_TANDAS; nroTanda++) {
				Fecha fecha = obtenerFechaCharla(nroPelicula, nroTanda);
				this.charlas[nroTanda][nroPelicula] = new Charla(fecha, nombrePelicula, maxEspectadores);
			}
		}
	}

	public Ticket registrarEspectador(int nroDia, String nombreEspectador) {
		// TODO - Punto 3 - Registrar un espectador controlando que haya
		// vacantes y no haya sido cargado antes para ese dia.
		Ticket reg = null;
		int tanda = obtenerTandaDesdeNroTotal(nroDia);
		int diaCharla = obtenerDiaCharlaDesdeNroTotal(nroDia);
		Charla charla = charlas[tanda][diaCharla];
		
		if (charla.registracionExitosa(nombreEspectador)) {
			reg = generarTicket(charla, nombreEspectador);
		}
		return reg;
	}

	private Fecha obtenerFechaCharla(int nroCharla, int nroRonda) {
		return new Fecha(fechaInicial.getAnio(), fechaInicial.getMes(),
				fechaInicial.getDia() + nroCharla + nroRonda * CANT_DIAS_DIFERENCIA);
	}

	private int obtenerDiaCharlaDesdeNroTotal(int nroActividad) {
		return (nroActividad - 1) % charlas[0].length;
	}

	private int obtenerTandaDesdeNroTotal(int nroActividad) {
		return (nroActividad - 1) / charlas[0].length;
	}

	private Ticket generarTicket(Charla charla, String nombreEspectador) {
		return new Ticket(charla.getFecha(), charla.getTitulo(), nombreEspectador);
	}

	public void mostrarCartelera() {
		// TODO - Punto 2 - Desarollar para que muestre lo que se pide en el
		// enunciado.
		// Debajo hay dos metodos que pueden serte utiles
		Charla charla;
		System.out.println("Ciclo de Charlas " + "'" + this.nombreFestival + "'");
		for (int s = 1; s <= CANT_TANDAS; s++) {
			System.out.printf("** Tanda %d **\n", s);
			for (int i = 0; i < charlas[0].length; i++) {
				charla = charlas[s-1][i];
				if (charla.hayVacantes()) {
					mostrarCharlaConVacante(charla, s, i);
				} else {
					mostrarCharlaAgotada(charla, s, i);
				}
			}
		}
	}

	private void mostrarCharlaAgotada(Charla actividad, int s, int i) {
		System.out.printf("%s\tCharla %2d\t %-20sAGOTADA\n", actividad.getFecha(), (s - 1) * charlas[0].length + i + 1,
				actividad.getTitulo());
	}

	private void mostrarCharlaConVacante(Charla actividad, int s, int i) {
		System.out.printf("%s\tCharla %2d\t %-20s(%2d vacantes)\n", actividad.getFecha(),
				(s - 1) * charlas[0].length + i + 1, actividad.getTitulo(), actividad.getVacantes());
	}
	
	private void setFechaInicial(Fecha fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	private void setNombreFestival(String nombreFestival) {
		this.nombreFestival = nombreFestival;
	}

	public Charla[][] getCharlas() {
		return charlas;
	}

	public void setCharlas(Charla[][] charlas) {
		this.charlas = charlas;
	}

	public String getNombreFestival() {
		return nombreFestival;
	}

	public Fecha getFechaInicial() {
		return fechaInicial;
	}
}