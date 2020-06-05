
public class Automovil {
	// TODO Auto-generated method stub

	// Atributos o caracteristicas
	String marca;
	int modelo;
	int precio;

	boolean estado = false;

	// definicion de constructor

	public Automovil() {
		System.out.println("se creo un objeto de tipo automovil");
	}

	// metodos o acciones
	public void encender() {
		if (estado == true) {
			System.out.println("El automovil ya esta encendido");
		} else {
			System.out.println("El automovil ah encendido");
			estado = true;
		}

	}

	public void apagar() {
		if (estado == true) {
			System.out.println("El automovil se apago");
			estado = false;
		} else {
			System.out.println("El automovil ya esta apagado");

		}
	}

	public void avanzar() {
		if (estado == true) {
			System.out.println("El automovil esta avanzando");
		} else {
			System.out.println("El automovil no puede avanzar apagado");
		}
	}

}
