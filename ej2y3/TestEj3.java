package ar.edu.ort.tp1.ej2y3;

public class TestEj3 {
	public static void main(String[] args) {
		Competencia carrera1 = new Competencia("100 mts");
		
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.86);
		Atleta atleta4 = new Atleta("Daniel",10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		Atleta atleta11 = new Atleta("Mariana", 10.01);
		Atleta atleta12 = new Atleta("Luis", 9.80);
		Atleta atleta13 = new Atleta("Cesar", 9.97);
		Atleta atleta14 = new Atleta("Marisa", 9.80);
		Atleta atleta15 = new Atleta("Silvia", 9.80);
		
		carrera1.agregarParticipantes(atleta1);
		carrera1.agregarParticipantes(atleta2);
		carrera1.agregarParticipantes(atleta3);
		carrera1.agregarParticipantes(atleta4);
		carrera1.agregarParticipantes(atleta5);
		carrera1.agregarParticipantes(atleta11);
		carrera1.agregarParticipantes(atleta12);
		carrera1.agregarParticipantes(atleta13);
		carrera1.agregarParticipantes(atleta14);
		carrera1.agregarParticipantes(atleta15);
	
		carrera1.mostrarGanadores();
		
		System.out.println("---------- OTRA FORMA -------------");
		System.out.println("Atletas ganadores: ");
		for (Atleta ganadores: carrera1.getGanadores()) {
			System.out.println(ganadores.toString());
		}
		System.out.println("-----------------------");
		
		Posicion[] arrGanadores = carrera1.getTernaGanadores();
		
		System.out.println("Terna de ganadores: ");
		for (int i = 0; i < arrGanadores.length;i++) {
			for (int j = 0; j < arrGanadores[i].getlAtletas().size();j++) {
				System.out.println("El atleta: " + arrGanadores[i].getlAtletas().get(j).getNombre() + " termino la competencia con tiempo: "
			+ arrGanadores[i].getTiempo() + " y obtuvo el puesto numero: " + (i+1));
			}
		}
	}
}
