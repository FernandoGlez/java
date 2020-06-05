
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Matriz = un arreglo bidimencional
		int[][] matriz = new int[4][3];

		matriz[0][0] = 5;
		matriz[0][1] = 8;

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 3; x++) {
				matriz[i][x] = 3;
			}

		}

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(matriz[i][x]);
			}
			System.out.println("\n");
		}
		// System.out.println(matriz[0][0]);
	}

}
