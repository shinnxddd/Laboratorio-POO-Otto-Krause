package nuevoproyecto;

public class Main {
    public static void main(String[] args) {

        Vendedor ven1 = new Vendedor("Shotaro", "Osaki", "Kawasaki", 777);
        Vendedor ven2 = new Vendedor("Jungkook", "Jeon", "Ferrari", 80);
        Vendedor ven3 = new Vendedor("Leon", "Kennedy", "Porshche", 789);

        Vehiculo au1 = new Autos(1, "DeLorean", 4, "comun", 120, 4, "manual");
        Vehiculo au2 = new Autos(2, "Bugatti", 4, "comun", 140, 4, "automatico");
        Vehiculo au3 = new Autos(3, "Volkswagen", 4, "comun", 150, 4, "manual");

        Moto mo1 = new Moto(4, "Yamaha", 2, "recto", 50, "150cc");
        Vehiculo mo2 = new Moto(5, "Honda", 2, "recto", 60, "200cc");
        Vehiculo mo3 = new Moto(6, "Suzuki", 2, "recto", 70, "250cc");

        Vehiculo au4 = new Autos(7, "Ford", 4, "comun", 130, 4, "manual");
        Vehiculo au5 = new Autos(8, "Gol", 4, "comun", 100, 4, "manual");

        Vehiculo mo4 = new Moto(9, "Kawasaki", 2, "recto", 90, "300cc");
        Vehiculo mo5 = new Moto(10, "BMW", 2, "recto", 100, "400cc");

        ven1.agregarVehiculo(au1);
        ven1.agregarVehiculo(mo1);
        ven1.agregarVehiculo(au2);

        ven2.agregarVehiculo(mo2);
        ven2.agregarVehiculo(au3);
        ven2.agregarVehiculo(mo3);

        ven3.agregarVehiculo(au4);
        ven3.agregarVehiculo(au5);
        ven3.agregarVehiculo(mo4);
        ven3.agregarVehiculo(mo5);

        ven1.mostrarVehiculos();
        ven2.mostrarVehiculos();
        ven3.mostrarVehiculos();
        
        mo1.hacerwilly();
    }
    
}