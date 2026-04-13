package ejercicios2;
import java.util.*;
import java.util.Random;

public class lol {
	    public static void main(String[] args) {
	        Scanner num = new Scanner(System.in);
	        Random random = new Random();
	        int adivina = -1;
	        int victorias = 0;
	        int perdidas = 0;
	        int empate = 0;

	        while (adivina != 0) {
	            System.out.println("Ingresa un número entre estos (Piedra: 1, Papel: 2, Tijera: 3 o 0 para salir): ");
	            adivina = num.nextInt();

	            if (adivina == 0) break;

	            int numran = random.nextInt(3) + 1; 

	            if (numran == 1) System.out.println("Programa: Piedra");
	            else if (numran == 2) System.out.println("Programa: Papel");
	            else System.out.println("Programa: Tijera");

	            if (adivina == numran) {
	                System.out.println("Empate");
	                empate++;
	            } else if ((numran == 1 && adivina == 3) || (numran == 2 && adivina == 1) || (numran == 3 && adivina == 2)) {
	                perdidas++;
	                System.out.println("Ganó el programa. Perdidas: " + perdidas);
	            } else {
	                victorias++;
	                System.out.println("Ganaste vos. Victorias: " + victorias);
	            }
	        }
	        System.out.println("Chau");
	    }
	}
