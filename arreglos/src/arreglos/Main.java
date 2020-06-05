package arreglos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tipo[] nombreArreglo = new tipo[];
		int[] arregloEnteros = new int[10];
		/*
		 * arregloEnteros[0] = 10; arregloEnteros[1] = 20; arregloEnteros[2] = 30;
		 * arregloEnteros[3] = 40; arregloEnteros[4] = 50; arregloEnteros[5] = 60;
		 * arregloEnteros[6] = 70; arregloEnteros[7] = 80; arregloEnteros[8] = 90;
		 * arregloEnteros[9] = 100;
		 */
		// for para llenar arreglo
		for (int x = 0; x < 10; x++) {
			arregloEnteros[x] = x + 1;

		}
		// for muestra el arreglo
		for (int i = 0; i < 10; i++) {

			System.out.println(arregloEnteros[i]);

		}
	}

}
