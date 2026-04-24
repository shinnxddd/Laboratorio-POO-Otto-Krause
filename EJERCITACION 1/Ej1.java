import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sumaPositivos = 0;
        int cantNegativos = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = sc.nextInt();

            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                cantNegativos++;
            }

        } while (num != 0);

        System.out.println("Total positivos: " + sumaPositivos);
        System.out.println("Cantidad negativos: " + cantNegativos);
    }
}