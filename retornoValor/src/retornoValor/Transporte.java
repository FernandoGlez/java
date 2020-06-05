package retornoValor;

public class Transporte {
	int precio = 0;

	// Constructor de la Clase
	public Transporte(int precio) {
		System.out.println("Se creo un objeto transporte");
		this.precio = precio;

	}

	// retorno de valor para esta funcion es int:
	public int precio() {
		// instruccciones que devuelven un valor

		this.precio--;
		return this.precio;
	}
}
