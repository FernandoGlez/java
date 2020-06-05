package parametros;

public class Persona {
  
	String nombre = "";
	int edad = 0;
	
	
	
	//inicializacion de un objeto Constructor
	public Persona(String nom, int age) {
		
		//asignando valor a la variable nombre
		this.nombre = nom;
		this.edad = age;
		System.out.println("El objeto " + nombre + " tiene " + edad + " años ");
	}
}
