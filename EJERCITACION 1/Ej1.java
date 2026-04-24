import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sumap = 0;
        int cantn = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = sc.nextInt();

            if (num > 0) {
                sumap += num;
            } else if (num < 0) {
                cantn++;
            }

        } while (num != 0);

        System.out.println("Total positivos: " + sumap);
        System.out.println("Cantidad negativos: " + cantn);
    }
}
