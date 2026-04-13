package ejercicios2;

public class lol {
    public static void main(String[] args) {

        String[] nombres = {"Shotaro", "Sungchan", "Anton", "Eunseok"};
        double[] notas = {8, 4, 9, 5};

        for (int i = 0; i < nombres.length; i++) {

            if (notas[i] >= 6) {
                System.out.println(nombres[i] + " esta aprobado");
            } else {
                System.out.println(nombres[i] + " esta reprobado");
            }
        }
    }
}
