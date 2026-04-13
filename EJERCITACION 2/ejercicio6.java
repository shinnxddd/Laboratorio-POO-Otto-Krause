package ejerciciospoo;
import java.util.*;
import java.util.Random;

public class ejercicios { 
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		Random random = new Random();
		
		int numran = random.nextInt(100); 
		int adivina=0;
		
		System.out.println(numran);

		while (adivina != numran) {
			System.out.println("Ingrese un numero: ");
			adivina= num.nextInt();
			
			if (adivina>numran) {
				System.out.println("Tu numero es muy alto, el numero es menor");
			} else {
				System.out.println("Tu numero es muy bajo, el numero es mayor");
			}
			
		}
		
		System.out.println("Adivinaste el numero, era: " + numran);
	}
}
