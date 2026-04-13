
package ejercicios2;
import java.util.*;
import java.util.Random;

public class lol {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        String[] palabras = {"lol", "cortis", "taller", "objetos", "java", "ruli", "rubio"};
	        Random random = new Random();
	        String palabra = palabras[random.nextInt(palabras.length)];
	        char[] letra = new char[palabra.length()];
	        
	        for (int i = 0; i < letra.length; i++) {
	            letra[i] = '_';
	        }

	        int acertadas = 0;
	        while (acertadas < palabra.length()) {
	            System.out.println("Palabra: " + String.valueOf(letra));
	            System.out.print("Ingresa una letra: ");
	            char ulet = sc.next().charAt(0);
	            
	            boolean error = true;
	            for (int i = 0; i < palabra.length(); i++) {
	                if (palabra.charAt(i) == ulet && letra[i] == '_') {
	                    letra[i] = ulet;
	                    acertadas++;
	                    error = false;
	                }
	            }

	            if (error) {
	                System.out.println("La letra es incorrecta :(");
	            }
	        }

	        System.out.println("Ganaste, la palabra era: " + palabra);
	    }
	}
