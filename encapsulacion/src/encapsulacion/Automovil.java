package encapsulacion;

public class Automovil {

	// atributos
	private int precio;
	private String marca;

	// Constructor
	public Automovil() {
		System.out.println("Se ha creado un objeto automovil");

		// Encapsulacion es que una clase encapsula todos sus atributos
		/* los hace privados */

	}

	// metodos getter devuelve valor y setter asigna un valor
	public int getPrecio() {
		return this.precio;
	}

	public String getMarca() {
		return this.marca;
	}

	// METODOS SET
	public void setPrecio(int p) {
		this.precio = p;
	}

	public void setMarca(String m) {
		this.marca = m;
	}
}
