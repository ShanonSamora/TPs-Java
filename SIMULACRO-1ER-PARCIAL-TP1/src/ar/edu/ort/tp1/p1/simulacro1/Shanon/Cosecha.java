package ar.edu.ort.tp1.p1.simulacro1.Shanon;

import java.util.ArrayList;

public class Cosecha {

	private String 		nombre;
	private String 		fecha;
	private String 		cultivo;
	private int 		kilos;
	private int			altura;
	private int			humedad;
	
	public Cosecha() {
		nombre 		= "";
		fecha 		= "";
		cultivo 	= "";
		kilos		= 0;
		altura		= 0;
		humedad		= 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getCultivo() {
		return cultivo;
	}
	
	public void setCultivo(String cultivo) {
		this.cultivo = cultivo;
	}
	
	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return "Cosecha " + nombre + ": fecha: " + fecha + " cultivo: " + cultivo + " kilos: " + kilos
				+ " altura: " + altura + " humedad: " + humedad;
	}
}