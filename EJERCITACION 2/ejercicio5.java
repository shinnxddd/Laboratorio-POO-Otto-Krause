package ejerciciospoo;
import java.util.*;

public class ejercicios { 
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int[] nums = new int[10]; 
		int pares=0;

		for (int i = 0; i < 10; i++) {	
			System.out.println("Ingrese un numero: ");
			nums[i] = num.nextInt();
			
			if (nums[i] % 2 == 0) {
				pares=pares+1;
			}
			
		}
	
		
		System.out.println("La cantidad de pares que hay es " + pares);
	}
}
