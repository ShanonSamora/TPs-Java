package ar.edu.ort.tp1.ej4y5;

public class AnioV2 {
	
	/* public void imprimirMes(int numeroMes) {
		switch (numeroMes) {
		case 1:
			System.out.println(Mes.ENERO);
			break;
		case 2:
			System.out.println(Mes.FEBRERO);
			break;
		case 3:
			System.out.println(Mes.MARZO);
			break;
		case 4:
			System.out.println(Mes.ABRIL);
			break;
		case 5:
			System.out.println(Mes.MAYO);
			break;
		case 6:
			System.out.println(Mes.JUNIO);
			break;
		case 7:
			System.out.println(Mes.JULIO);
			break;
		case 8:
			System.out.println(Mes.AGOSTO);
			break;
		case 9:
			System.out.println(Mes.SEPTIEMBRE);
			break;
		case 10:
			System.out.println(Mes.OCTUBRE);
			break;
		case 11:
			System.out.println(Mes.NOVIEMBRE);
			break;
		case 12:
			System.out.println(Mes.DICIEMBRE);
			break;
		}
	} */
	public void imprimirMes(int numeroMes) {
		System.out.println(Mes.values()[numeroMes - 1]);
	}
}
