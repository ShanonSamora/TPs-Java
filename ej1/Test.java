package ar.edu.ort.tp1.ej1;

public class Test {

	public static void main(String[] args) {
		Grupo grupo1 = new Grupo("Los pibes");
		
		agregarAlGrupo("Uriel Segaloff", grupo1);
		agregarAlGrupo("Uriel Segaloff", grupo1);
		agregarAlGrupo("Uriel Segaloff", grupo1);
		
		System.out.println("-----------");
		agregarAlGrupo("ficticio", grupo1);
		
		System.out.println("-----------");
		grupo1.mostrar();
		
		System.out.println("-----------");
		buscarEnGrupo("ficticio", grupo1);
		
		System.out.println("-----------");
		buscarEnGrupo("inexistente", grupo1);
		
		System.out.println();
		System.out.println(grupo1.obtenerIntegrante(2));
		
		System.out.println("-----------");
		System.out.println("Se ha eliminado " + grupo1.removerIntegrante("ficticio"));
		
		System.out.println("-----------");
		grupo1.mostrar();
		
		System.out.println("-----------");
		grupo1.vaciar();
		
		System.out.println("-----------");
		grupo1.mostrar();
	}
	
	public static void agregarAlGrupo(String nombre, Grupo grupo) {
		grupo.agregarIntegrante(nombre);
	}
	
	public static void buscarEnGrupo(String nombre, Grupo grupo) {
		if (!nombre.isEmpty()) {
			if (grupo.buscarIntegrante(nombre) != null) {
				System.out.println("El integrante: " + nombre + " se encuentra en el grupo");
			} else {
				System.out.println("El integrante: " + nombre + " no se encuentra en el grupo");
			}
		}
		else {
			System.out.println("No se encuentra al integrante.");
		}
	}
}
