package ar.edu.ort.tp1.exfinal.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListadoPorNombre extends ListaOrdenadaNodos<String, Item> implements Mostrable {

	@Override
	public double compare(Item dato1, Item dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Item elemento) {
		// TODO Auto-generated method stub
		return clave.compareTo(elemento.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("\nItems por nombre:");
		for (Item item : this) {
			System.out.println(item);
		}
	}

}
