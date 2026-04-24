import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de alumnos: ");
        int cantidad = sc.nextInt();

        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nota (1-10): ");
            int nota = sc.nextInt();

            suma += nota;

            if (nota >= 1 && nota <= 3) {
                System.out.println("Insuficiente");
            } else if (nota <= 5) {
                System.out.println("Regular");
            } else if (nota <= 7) {
                System.out.println("Bueno");
            } else if (nota <= 9) {
                System.out.println("Muy Bueno");
            } else if (nota == 10) {
                System.out.println("Excelente");
            }
        }

        double promedio = (double) suma / cantidad;

        System.out.println("Promedio general: " + promedio);
    }
}
