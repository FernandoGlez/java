
import java.util.*;
 
public class cad {
    
    public static void main(String[] args) {
    

    Scanner entrada =  new Scanner(System.in);
    
    String nombre;
    String nombre1;
    String apellido;
    String apellido1;
    
    System.out.println("¿cual es tu primer nombre?");
    	nombre = entrada.nextLine();
   	System.out.println("¿Cual es su segundo nombre?");
    	nombre1 = entrada.nextLine();
   	System.out.println("¿Cual es su Primer apellido?");
    	apellido = entrada.nextLine ();
    System.out.println("¿Cual es su Segundo apellido?");
    	apellido1 = entrada.nextLine ();
    	
   System.out.println("Su nombre completo es:"+ nombre +" "+ nombre1 +" "+ apellido +" "+ apellido1);

    }
}