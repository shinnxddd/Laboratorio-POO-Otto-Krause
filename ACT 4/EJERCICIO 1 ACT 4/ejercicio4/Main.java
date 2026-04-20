package ejercicio4;

public class Main {
	  public static void main(String[] args) {
		  
		  Socio s1 = new Socio("Shotaro", 1);
	      Socio s2 = new Socio("Olivia", 2);
	      Socio s3 = new Socio("Leon", 3);
	      
	      Reserva reserva1 = new Reserva(1, 127, "Voley");
	      Reserva reserva2 = new Reserva(2, 444, "Futbol");
	      Reserva reserva3 = new Reserva(3, 888, "Patin");


	      s1.agregarReserva();
	      
	      s2.agregarReserva();
	      
	      s3.agregarReserva();
	      
	      System.out.println("Reserva reservada");

		
	  }

}
