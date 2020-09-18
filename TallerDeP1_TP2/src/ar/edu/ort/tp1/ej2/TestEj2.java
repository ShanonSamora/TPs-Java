package ar.edu.ort.tp1.ej2;

import ar.edu.ort.tp1.ej1.NumeroTelefonico;
import ar.edu.ort.tp1.ej1.Persona;
import ar.edu.ort.tp1.ej1.TipoDeLinea;

public class TestEj2 {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Messi", "Lionel");
		Persona persona2 = new Persona("Samora", "Shanon");
		
		NumeroTelefonico numero1 = new NumeroTelefonico(TipoDeLinea.CELULAR, 54, 117016, 3867);
		NumeroTelefonico numero2 = new NumeroTelefonico(TipoDeLinea.FIJO, 54, 55555, 3867);
		NumeroTelefonico numero3 = new NumeroTelefonico(TipoDeLinea.FAX, 4242, 2424, 3232);
		
		persona1.agregarEmail("lio@messi.com");
		persona1.agregarTelefono(numero1);
		persona1.agregarTelefono(numero2);
		persona1.mostrarTodo();
		
		persona2.agregarEmail("shanon@wachin.com");
		persona2.agregarEmail("saaaa@sasda.com");
		persona2.agregarTelefono(numero3);
		persona2.agregarMascota("Copelin", "Gato");
		persona2.agregarMascota("Wachin", "Perro");
		persona2.mostrarTodo();
		System.out.println("Mostrar todo pero con mascotas:");
		persona2.mostrarTodoConMascotas();
	}

}
