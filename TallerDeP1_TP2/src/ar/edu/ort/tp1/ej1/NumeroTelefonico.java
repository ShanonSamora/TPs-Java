package ar.edu.ort.tp1.ej1;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipo;
	
	public NumeroTelefonico() {
		this.caracteristica = 0;
		this.numeroDeAbonado = 0;
		this.codigoDePais = 0;
		this.tipo = null;
	}
	public NumeroTelefonico(TipoDeLinea tipo, int codPais, int nroAbo, int carac) {
		this.setCaracteristica(carac);
		this.setNumeroDeAbonado(nroAbo);
		this.setCodigoDePais(codPais);
		this.setTipo(tipo);
	}
	
	public String getNumero() {
		return "(+" + codigoDePais + ")" + "-" +  numeroDeAbonado + "-" + caracteristica;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public TipoDeLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLinea tipo) {
		this.tipo = tipo;
	}
}
