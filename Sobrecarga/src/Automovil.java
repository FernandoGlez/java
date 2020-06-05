
public class Automovil {

	int precio = 0;
	String nombre = " ";
	int numPasajeros = 0;

	public Automovil(int pre, String nom) {
		this.precio = pre;
		this.nombre = nom;

		System.out.println("Se creo un automovil con precio: " + precio + " Ycon nombre:" + nombre);
	}

	// Constructor
	public Automovil(int pre, String nom, int numP) {
		this.precio = pre;
		this.nombre = nom;
		this.numPasajeros = numP;

		System.out.println("Se creo un nuevo automovil con precio: " + precio + " Y con nombre: " + nombre
				+ " y puede alcanzar " + numP + " pasajeros ");
	}

}
