package preparcial1.clases;

public class Charla {
	private Fecha fecha;
	private String titulo;
	private int registrados;
	private String[] audiencia;

	public Charla(Fecha fecha, String titulo, int maximoEspectadores) {
		// TODO Punto 1B - Completar el constructor
		this.setFecha(fecha);
		this.setTitulo(titulo);
		this.setRegistrados(0);
		this.audiencia = new String[maximoEspectadores];
	}

	public int getRegistrados() {
		return registrados;
	}

	public boolean hayVacantes() {
		return registrados < audiencia.length;
	}

	public int getVacantes() {
		return audiencia.length - registrados;
	}

	public boolean registracionExitosa(String nombre) {
		// TODO - Procesar la registracion del espectador siempre que haya
		// vacante y no esté registrado previamente. Implementar también la
		// búsqueda.
		boolean pudo = false;
		if (hayVacantes()) {
			if (buscarRegistrado(nombre) == -1) {
				audiencia[registrados] = nombre;
				registrados++;
				pudo = true;
			}
		}
		return pudo;
	}

	private int buscarRegistrado(String nombre) {
		int index = registrados - 1;
		// TODO - Completar la busqueda
		while (index > -1 && !audiencia[index].equals(nombre)) {
			index--;
		}
		return index;
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fecha getFecha() {
		return fecha;
	}

	private void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	private void setRegistrados(int registrados) {
		this.registrados = registrados;
	}

	public String[] getAudiencia() {
		return audiencia;
	}

	public void setAudiencia(String[] audiencia) {
		this.audiencia = audiencia;
	}
}