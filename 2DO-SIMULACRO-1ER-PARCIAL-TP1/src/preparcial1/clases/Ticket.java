package preparcial1.clases;

public class Ticket {

	private Fecha fecha;
	private String titulo;
	private String espectador;

	public Ticket(Fecha fecha, String titulo, String nombreEspectador) {
		this.setFecha(fecha);
		this.setTitulo(titulo);
		this.setEspectador(nombreEspectador);
	}

	private void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	private void setEspectador(String registrado) {
		this.espectador = registrado;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [fecha=" + fecha + ", titulo=" + titulo
				+ ", espectador=" + espectador + "]";
	}

}