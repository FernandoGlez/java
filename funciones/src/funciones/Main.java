package funciones;

public class Main {

	/*
	 * Una funcion es un bloque de codigo que se ejecuta dependiendo nuestras
	 * necesidades
	 */
	// Funciones que ejecutan codigo
	// Que ejecutan codigo y devuelven un valor
	// Que reciben un valor
	// Reciben valor y devuelven un valor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// principal
		// System.out.println("Esta es la funcion Main");

		// Llamada a otra función
		// Hola();
		String res = " ";
		//Llamada a otra funcion
		res = devuelveValor();
		System.out.println(res);
	}
	/*
	 * Estructura Modificador de acceso, TipoDevolver, Nombre de la
	 * función(valorQueReciba) Instrucciones de la función }
	 */

	// funcion debe de tener modificador de acceso private, public projecter etc
	// que valor me va a devolver esta funcion void no regresa valores
	// Funcion que ejecuta Codigo
	
	/*
	public static void Hola() {
		// instrucciones
		System.out.println("Hola");

	}
	*/

	// Que devuelve un Valor
	public static String devuelveValor() {
		return "Hola Mundo";
	}
}
