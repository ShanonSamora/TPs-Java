package ar.edu.ort.tp1.ej3;

public class TestEj3 {

	public static void main(String[] args) {
		Vivienda vivienda1 = new Vivienda("Vivienda 1");
		
		vivienda1.agregarDireccion("Av. Siempre Viva", 3831, 1, "C");
		vivienda1.agregarPersona("Shanon", "Samora", 19);
		vivienda1.agregarPersona("Antonio", "David", 45);
		vivienda1.agregarMueble("Mesa de escritorio", "madera", "negro");
		vivienda1.agregarMueble("Sillon", "cuero", "blanco");
		
		vivienda1.mostrarTodo();
	}

}
