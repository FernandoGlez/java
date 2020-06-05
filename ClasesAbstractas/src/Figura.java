
public class Figura {

	private String nombre;

	// Constructor por defecto
	public Figura() {
		System.out.println("El objeto tipo figura se ah creado");
	}

	/*
	// Declaracion de metodo
	public void area() {
		System.out.println("Se esta calculando el area...");
	}
	*/
	
	
//Constructor Sobrecargado/ sobre carga de metodos mismo nombre de una funcion , pero con distintos valores
	public Figura(String nombre) {
		// This hace una Referencia a los Metodos y atributos dentro de nuestra clase
		this.nombre = nombre;
		//  nombre = nombre;
		System.out.println("El objeto con nombre: " +nombre+ " se ah creado");
	}
	public Figura(String nombre, int edad) {
		System.out.println("El objeto con nombre: "+nombre+ " y edad: " +edad+ " se ah creado");
	}
}
