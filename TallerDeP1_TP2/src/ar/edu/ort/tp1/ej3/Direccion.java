package ar.edu.ort.tp1.ej3;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private String depto;
	
	public Direccion(String calle, int altura, int piso, String depto) {
		this.setCalle(calle);
		this.setAltura(altura);
		this.setPiso(piso);
		this.setDepto(depto);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}
}
