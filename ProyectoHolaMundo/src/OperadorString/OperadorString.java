package OperadorString;

public class OperadorString {
	public static void main(String[] args) {

		String saludo = "Hola mundo";

		String lenguaje = "Java";

		String union = saludo + lenguaje;
		union = union + "Version 14";

		saludo = saludo.toUpperCase();

		System.out.println(saludo);

	}
}
