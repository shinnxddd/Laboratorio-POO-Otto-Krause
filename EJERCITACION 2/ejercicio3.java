package ejerciciospoo;
import java.util.*;

public class ejercicios { 
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {	
			System.out.println("Ingrese un numero: ");
			nums[i] = num.nextInt();
		}

		int min = nums[0];

		for (int i=1;i<10;i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}

		System.out.println("El numero minimo es " + min);
	}
}

