package ar.edu.ort.tp1.p1.simulacro1;

import java.util.ArrayList;

public class EmpresaAgricola {

	private String 				nombre;
	private ArrayList<Cosecha> 	cosechas;
	private String				columnas[];
	private int 				resultadosCosecha[][];
	private static final String	tipoCultivo [] = {"TRIGO", "MAIZ", "SOJA"};

	public EmpresaAgricola(String nombre, int cantCosechas) {
		this.nombre 	= nombre;
		this.cosechas 	= new ArrayList<Cosecha>(cantCosechas);
	}
	
	//a)Cargar los arrays de columnas y resultadosCosecha
	public void cargarResultados() {
		columnas = new String [] { "Cosecha", "Tipo Cultivo", "Fecha", "Kilos", "Altura", "Humedad"};
		resultadosCosecha = new int[][] {
			{1, 1, 20170101, 20, 200, 78}, 
			{2, 1, 20170801, 19, 194, 85}, 
			{3, 2, 20170901, 25, 262, 85},
			{4, 2, 20171201, 12, 140, 64},
			{5, 3, 20180101, 26, 217, 93},
			{6, 3, 20180201, 34, 261, 91}
			};
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCosecha(Cosecha cosecha) {
		cosechas.add(cosecha);
	}
	
	public ArrayList<Cosecha> getCosechas() {
		return cosechas;
	}
	
	//b) Mostrar por pantalla el contenido de la matriz resultadosCosecha con sus nombres de columnas, usando el array columnas
	public void mostrarResultados() {
		int i,j=0;
		System.out.print("Resultados de todas las cosechas: \n");
		for (i = 0; i < columnas.length; i++)
			System.out.print(columnas[i]+"\t\t");
		System.out.println();
		
		for (i = 0; i < resultadosCosecha.length; i++) {
			for (j=0; j < resultadosCosecha[i].length; j++)
				System.out.print(resultadosCosecha[i][j] + "\t\t");
			System.out.println();
		}
	}
	
	//Carga los datos del array resultadosCosecha, agregando las cosechas correspondientes con todos sus datos.
	public void procesarResultados() {
		for (int i = 0; i < resultadosCosecha.length; i++) {
			Cosecha c = new Cosecha();
			for (int j = 0; j < resultadosCosecha[i].length; j++) {
				switch(j){
				case 0:	c.setNombre(String.valueOf(resultadosCosecha[i][j])); break;
				case 1: c.setCultivo(tipoCultivo[resultadosCosecha[i][j]-1]); break;
				case 2:	c.setFecha(String.valueOf(resultadosCosecha[i][j]));; break;
				case 3: c.setKilos(resultadosCosecha[i][j]); break;
				case 4: c.setAltura(resultadosCosecha[i][j]); break;
				case 5: c.setHumedad(resultadosCosecha[i][j]); break;
				}
			}
			cosechas.add(c);
		}
	}
	
	//c) Buscar una cosecha de un campo enviados por par�metro y mostrar su resultado incluyendo todos sus datos
	// Se debe validar que el campo y la cosecha sean v�lidos. Sino retornar "sin datos".
	public String buscarCosecha(int cosecha) {
		String r = "sin datos";
		if(cosecha <= 0 && cosecha>cosechas.size())
			return r;
		r = "Resultados de " + cosechas.get(cosecha-1).toString();
		return r;
	}
	
	//d) Obtiene el nombre de la cosecha con mayor cantidad de kilos recorriendo las cosechas.
	public String obtenerCosechaConMasKilos() {
		int maxKilos = 0;
		String mejorCosecha = "";
		for(int j = 0 ; j < cosechas.size(); j++) {
			if(cosechas.get(j).getKilos() > maxKilos){
				maxKilos = cosechas.get(j).getKilos();
				mejorCosecha = cosechas.get(j).getNombre();
			}
		}
		return mejorCosecha;
	}
	
	//e) Obtiene el nombre de la cosecha con mayor altura recorriendo las cosechas.
	public String obtenerCosechaConMasAltura() {
		int maxAltura = 0;
		String mejorCosecha = "";
		for(int j = 0 ; j < cosechas.size(); j++) {
			if(cosechas.get(j).getAltura() > maxAltura){
				maxAltura = cosechas.get(j).getAltura();
				mejorCosecha = cosechas.get(j).getNombre();
			}
		}
		return mejorCosecha;
	}
}