package ar.edu.ort.tp1.ej6;

import java.util.ArrayList;

public class GastosAnuales {
	private ArrayList<Rubro>rubros;
	
	public GastosAnuales() {
		this.rubros = new ArrayList<Rubro>();
	}
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		if (importe>0) {
			Rubro rubro = obtenerRubro(nombreRubro);
			rubro.agregarGasto(mes, importe);
		} else {
			System.out.println("El monto debe ser mayor a cero!");
		}
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = buscarRubro(nombreRubro);
		if (rubro==null) {
			this.rubros.add(new Rubro(nombreRubro));
			int tamanio = this.rubros.size();
			rubro = this.rubros.get(tamanio-1);
		}
		return rubro;
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroEncontrado = null;
		int index=0;
		
		while (rubroEncontrado == null && index < this.rubros.size()) {
			Rubro unRubro = this.rubros.get(index);
			if (unRubro.getNombre().equals(nombreRubro)) {
				rubroEncontrado = unRubro;
			}
			index++;
		}
		return rubroEncontrado;
	}
	private double[][] consolidadoDeGastos() {
		double [][] gastosConsolidados =
				new double [Mes.values().length][this.rubros.size()];
		Mes[] meses = Mes.values();
		
		for (int i = 0; i<gastosConsolidados.length; i++) {
			for (int j=0; j<gastosConsolidados[i].length; j++) {
				gastosConsolidados[i][j] = this.rubros.get(j).getTotalGastos(meses[i]);
			}
		}
		return gastosConsolidados;
	}
	public double gastoAcumulado(Mes mes) {
		double[][] gastosConsolidados = consolidadoDeGastos();
		double gastoAcumulado=0;
		for (int i=0; i<gastosConsolidados[mes.ordinal()].length; i++) {
			gastoAcumulado += gastosConsolidados[mes.ordinal()][i];
		}
		return gastoAcumulado;
	}
	public double gastoAcumulado(String nombreRubro) {
		double [] [] gastosConsolidados = consolidadoDeGastos();
		double gastoAcumulado=0;
		Rubro rubro = buscarRubro(nombreRubro);
		
		if (rubro!=null) {
			for (Mes mes : Mes.values()) {
				for (int j=0; j<this.rubros.size(); j++) {
					if (this.rubros.get(j).getNombre().equals(nombreRubro)) {
						gastoAcumulado += gastosConsolidados[mes.ordinal()][j];
					}
				}
			}
			return gastoAcumulado;
		} else {
			return gastoAcumulado;
		}
	}
	public void informarConsumosPorMes() {
		for (Mes mes: Mes.values()) {
			System.out.println(mes);
			for (int j=0; j<this.rubros.size(); j++) {
				System.out.println(this.rubros.get(j).getNombre()+ " = "
						+this.rubros.get(j).getTotalGastos(mes));
			}
			System.out.println("El total acumulado en el mes es de: "+gastoAcumulado(mes));
			System.out.println();
		}
	}
	public void informarPromedioMensualPorRubro() {
		double acumulador=0, promedio=0;
		for (int j=0; j<this.rubros.size(); j++) {
			for (Mes mes : Mes.values()) {
				acumulador += this.rubros.get(j).getTotalGastos(mes);
			}
			promedio=acumulador/Mes.values().length;
			System.out.println("El promedio anual de: " + this.rubros.get(j).getNombre() + " es de: "
					+ promedio);
		}
	}
	public void informarMesMayorConsumo() {
		ArrayList<Double> listMax = new ArrayList<Double>();
		ArrayList<String> listRubroMax = new ArrayList<String>();
		ArrayList<Mes> listMesMax = new ArrayList<Mes>();
		Double max = 0.0;
		int posMax = 0;
		Mes mesMax = Mes.ENERO;
		for (int j=0; j<this.rubros.size(); j++) {
			for (Mes mes: Mes.values()) {
				if (max < this.rubros.get(j).getTotalGastos(mes)) {
					max = this.rubros.get(j).getTotalGastos(mes);
					posMax = j;
					mesMax = mes;
				}
			}
			max = 0.0;
			listMax.add(this.rubros.get(posMax).getTotalGastos(mesMax));
			listRubroMax.add(this.rubros.get(posMax).getNombre());
			listMesMax.add(mesMax);
		}
		System.out.println("Mes maximo por cada rubro: ");
		for (int i = 0; i < listMax.size(); i++) {
			System.out.println("El rubro: " + listRubroMax.get(i) + " gasto: " + listMax.get(i) + " en el mes: " + listMesMax.get(i));
		}
	}
}
