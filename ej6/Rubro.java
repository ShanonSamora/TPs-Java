package ar.edu.ort.tp1.ej6;

public class Rubro {
	private final int TOTAL_MESES = Mes.values().length;
	private String nombre;
	private double[] gastosPorMes;
	
	public Rubro(String nombre) {
		this.setNombre(nombre);
		inicializarGastos();
	}
	
	public void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double gastos) {
		this.gastosPorMes[mes.ordinal()] += gastos;
	}
	
	public double getTotalGastos(Mes mes) {
		return gastosPorMes[mes.ordinal()];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getGastosPorMes() {
		return gastosPorMes;
	}

	public void setGastosPorMes(double[] gastosPorMes) {
		this.gastosPorMes = gastosPorMes;
	}

	public int getTOTAL_MESES() {
		return TOTAL_MESES;
	}
	
}
