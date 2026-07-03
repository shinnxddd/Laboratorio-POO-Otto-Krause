package ExcepcionesFutbol;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Mundial mundial = new Mundial();


        Seleccion s1 = new Seleccion("Argentina", "America del Sur", 10, 26, "Clasificó");
        Seleccion s2 = new Seleccion("Francia", "Europa", 1, 7, "No clasificó");
        Seleccion s3 = new Seleccion("Japón", "Asia", 12, 23, "Clasificó");


        s1.setDirectorTecnico(new DirectorTecnico("Lionel Scaloni"));

        mundial.agregarSeleccion(s1); 
        mundial.agregarSeleccion(s2); 
        mundial.agregarSeleccion(s3); 


        try {
            mundial.consultarPorPosicion(0);
        } catch(IndexOutOfBoundsException e) { // indices fuera d rango bro, cuando intentas acceder algo q no existe
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            mundial.consultarPorPosicion(56);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            Scanner sc = new Scanner(System.in);
String entradaTeclado = sc.nextLine();
            int puntoscambiados = Integer.parseInt(entradaTeclado); 
            mundial.actualizarPuntos(0, puntoscambiados);

        } catch(Exception e)  {
            System.out.println("El valor no es numérico");
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            mundial.consultarDirectorTecnico(0);
        } catch (NullPointerException e) { //esta cuando se usa algo q esta vaciooo, como el dt al inicio
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            mundial.consultarDirectorTecnico(1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            System.out.println("Intentando registrar selección inválida (40 jugadores)...");
            Seleccion seleinvalida = new Seleccion("China", "Asia", 0, 50, "Clasificado");
        } catch (IllegalArgumentException e) {  //dato invalido
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            System.out.println("Partido para Francia...");
            s2.jugarPartido();
        } catch (JugadoresInsuficientesException e) {
            System.out.println("Excepción del torneo: " + e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }


        try {
            System.out.println("PARtido para Japón...");
            s3.jugarPartido();
        } catch (JugadoresInsuficientesException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Excepcion finalizada");
        }

    }
}
