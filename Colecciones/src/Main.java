import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList
		ArrayList datos = new ArrayList(40);

		// insertar datos
		/*
		 * datos.add(5); datos.add(10); datos.add(8); System.out.println(datos.size());
		 */

		// insertar datos con un ciclo for
		for (int i = 0; i < 10; i++) {

			datos.add(i + 1);
		}

		System.out.println(datos);
		// Stack Pila
		// lAST IN FIRST OUT
		/*
		 * Push -Insertar elementos en la parte posterior de la pila Pop - Eleminar
		 * estos elementos
		 */

		Stack miPila = new Stack();

		miPila.push("Lola");
		miPila.push("Carmen");
		miPila.push("La mona lisa");
		miPila.push("El quijote");

		// miPila.clear(); // Limpiar la Pila

		String elemento;
		elemento = (String) miPila.pop();

		System.out.println(elemento);

		// Queue - Cola
		// Add - insertar elementos en la cola
		// poll - eliminar el primer elemento de la cola
		// peek - Consulta
		Queue cola = new LinkedList();
		cola.add(5);
		cola.add(10);
		cola.add(15);
		System.out.println(cola.poll());
		System.out.println(cola);

		// HashTable
		Hashtable tabla = new Hashtable();
		// Hashtable<Integer, String> tabla2 = new Hashtable<>();
		tabla.put(1, "Apple");
		tabla.put(2, "Sony");
		tabla.put(6, "Samsung");
		tabla.put("Ferrari", 400);
		System.out.println(tabla.get("Ferrari"));
		
	}
}
