package ejercicios2;
import java.util.*;
import java.util.Random;

public class lol {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero: ");
            nums[i] = num.nextInt();
        }

        System.out.println("Numeros invertidos:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}

