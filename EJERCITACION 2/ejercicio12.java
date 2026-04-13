package ejercicios2;

public class lol {
    public static void main(String[] args) {

        int[] nums = {127, 4, 404, 444, 777, 808, 99, 211};

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("El numero mas grande es: " + max);
        System.out.println("El numero mas pequeño es: " + min);
    }
}
