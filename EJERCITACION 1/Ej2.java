import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int clave = 1234;
        int intento;
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Ingrese la clave: ");
            intento = sc.nextInt();

            if (intento == clave) {
                System.out.println("Bienvenido al sistema");
                return;
            } else {
                System.out.println("Acceso denegado");
                intentos++;
            }
        }

        System.out.println("Sistema bloqueado");
    }
}