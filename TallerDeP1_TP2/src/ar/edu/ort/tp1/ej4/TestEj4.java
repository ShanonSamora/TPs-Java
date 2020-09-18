package ar.edu.ort.tp1.ej4;

import ar.edu.ort.tp1.ej3.Vivienda;

public class TestEj4 {

	public static void main(String[] args) {
		
		Edificio edificio = new Edificio();
		
		Vivienda vivienda1 = new Vivienda("Vivienda 1");
		Vivienda vivienda2 = new Vivienda("Vivienda 2");
		
		//SE AGREGA LAS VIVIENDAS AL EDIFICIO
		
		edificio.agregarVivienda(vivienda1);
		edificio.agregarVivienda(vivienda2);
		
		//SE AGREGAN COSAS A VIVIENDA 2
		
		vivienda1.agregarDireccion("Av. Siempre Viva", 3831, 1, "C");
		vivienda1.agregarPersona("Shanon", "Samora", 19);
		vivienda1.agregarPersona("Antonio", "David", 45);
		vivienda1.agregarMueble("Mesa de escritorio", "madera", "negro");
		vivienda1.agregarMueble("Sillon", "cuero", "blanco");
		
		vivienda1.mostrarTodo();
		
		//SE AGREGAN COSAS A VIVIENDA 2
		
		vivienda2.agregarDireccion("Av. Siempre Viva", 3831, 2, "D");
		vivienda2.mostrarTodo();
		
		// SE REALIZA MUDANZA DE PERSONAS Y MUEBLES DE VIVIENDA 1 A VIVIENDA 2
		
		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
		edificio.realizarMudanza(vivienda1, vivienda2);
		
		vivienda1.mostrarTodo();
		vivienda2.mostrarTodo();
	}

}
