package ar.edu.ort.tp1.ej6;

public class Test {

	public static void main(String[] args) {
		
		GastosAnuales gastoAnual = new GastosAnuales();
		gastoAnual.agregarGasto(Mes.ENERO, "administracion", 1500);
		gastoAnual.agregarGasto(Mes.ENERO, "tecnico", 150);
		gastoAnual.agregarGasto(Mes.FEBRERO, "tecnico", 500);
		gastoAnual.agregarGasto(Mes.MARZO, "comercial", 750);
		gastoAnual.agregarGasto(Mes.ABRIL, "funcional", 200);
		gastoAnual.agregarGasto(Mes.MAYO, "comercial", 7500);
		gastoAnual.agregarGasto(Mes.JUNIO, "administracion", 500);
		gastoAnual.agregarGasto(Mes.JULIO, "funcional", 50);
		gastoAnual.agregarGasto(Mes.AGOSTO, "funcional", 300);
		gastoAnual.agregarGasto(Mes.SEPTIEMBRE, "tecnico", 500);
		gastoAnual.agregarGasto(Mes.OCTUBRE, "comercial", 300);
		gastoAnual.agregarGasto(Mes.NOVIEMBRE, "administracion", 1000);
		gastoAnual.agregarGasto(Mes.DICIEMBRE, "comercial", 400);
		
		System.out.println("Gasto del rubro tecnico: "+gastoAnual.gastoAcumulado("tecnico"));
		System.out.println("Gasto del rubro administracion: "+gastoAnual.gastoAcumulado("administracion"));
		System.out.println("Gasto del rubro comercial: "+gastoAnual.gastoAcumulado("comercial"));
		System.out.println("Gasto del rubro funcional: "+gastoAnual.gastoAcumulado("funcional"));
		
		System.out.println();
		gastoAnual.informarConsumosPorMes();
		
		gastoAnual.informarPromedioMensualPorRubro();
		
		System.out.println();
		gastoAnual.informarMesMayorConsumo();
	}

}
