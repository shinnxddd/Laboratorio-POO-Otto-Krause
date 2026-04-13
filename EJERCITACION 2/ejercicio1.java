package ejerciciospoo;
import java.util.*;

public class ejercicios { 
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int[] nums = new int[10];
		int suma= 0;
		
		 for (int i = 0; i<10; i++) {	
			 System.out.println("Ingrese un numero: ");
			 nums[i]=num.nextInt();
		 }
		 
		 for (int i = 0; i<10; i++) {
			 suma=suma+nums[i];
		 }
		 
		 System.out.println("La suma da " + suma);
	}

}

