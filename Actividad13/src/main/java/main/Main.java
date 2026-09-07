package main;

import empleadoService.Service;
import model.Empleado;
import Excepciones.CargoInvalidoException;
import Excepciones.DniDuplicadoException;
import Excepciones.DniInvalidoException;
import Excepciones.EmpleadoNoEncontradoException;
import Excepciones.EmpleadoYaInactivoException;
import Excepciones.SalarioInvalidoException;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        System.out.println("pruebas a ver si sirve");

        try {
            service.createbro("Nagi", "Seishiro", 10101010, "T/N", 127000.0);
            System.out.println("Se registro bien wuuu");
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }


        //la excepciomn delm ismo dni (con reo pq es una copia jiij)
        
        try {
            service.createbro("Reo", "Mikage", 40101010, "CEO", 800000.0);
        } catch (DniDuplicadoException e) {
            System.out.println("TENES EL DNI COPIADOOOO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // el dni invalido (con menos de 7 u 8 letras) con isagi pq nos cae mal
        
        try {
            service.createbro("Isagi", "Yoichi", 12345, "Desarrollador", 600000.0);
        } catch (DniInvalidoException e) {
            System.out.println("EL DNI ES INVALIDO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // el coso con cargo inválido
        try {
            service.createbro("Bachira", "Meguru", 30303030, "Delantero", 500000.0);
        } catch (CargoInvalidoException e) {
            System.out.println("EL CARGO ES INVALIDO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // el coso con salario inválido (micha pq es ppbre jjaj)
        try {
            service.createbro("Michael", "Kaiser", 40404040, "Analista", -100.0);
        } catch (SalarioInvalidoException e) {
            System.out.println("EL SALARIO ES INVALIDO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // wl actualizar el id q no existe
        try {
            service.updatebro(9999, "Chigiri", "Hyoma", 50505050, "Tester", 900000.0);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("NO SE ENCONTRO AL EMPLEADO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // eliminar dos veces al mismo empleado
        try {
            service.deletebro(1);
            System.out.println("Empleado con ID 1 eliminado.");

            service.deletebro(1);
        } catch (EmpleadoYaInactivoException e) {
            System.out.println("EL EMPLEADO NO EXISTE: " + e.getMessage());
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("EL EMPLADO NO EXISTEEE: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // consulta de una persona y ver su estado
        try {
            Empleado empleadolol = service.ListarPorId(1);
            String estadoStr = empleadolol.isActivo() ? "Activo" : "Inactivo";
            System.out.println("Empleado ID 1 encontrado: " + empleadolol.getNombre() + " | Estado: " + estadoStr);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Erorr al buscare: " + e.getMessage());
        }

        System.out.println("TODOS LOS EmPLEADoS Y SU EStADO");
        for (Empleado emp : service.ListarTodo()) {
            String estadoStr = emp.isActivo() ? "Activo" : "Inactivo";
            System.out.println(emp + " | Estado actual: " + estadoStr);
        }
    }
}