package pollofrito;

public class Main {

    public static void main(String[] args) {

        
    	Libro l1 = new Libro(1, "El principito", "Ficción");
    	Libro l2 = new Libro(2, "Harry Potter", "Fantasía");
    	Libro l3 = new Libro(3, "1984", "Distopía");
    	Libro l4 = new Libro(4, "Don Quijote de la Mancha", "Clásico");
    	Libro l5 = new Libro(5, "Cien años de soledad", "Realismo mágico");
    	Libro l6 = new Libro(6, "Crónica de una muerte anunciada", "Drama");
    	Libro l7 = new Libro(7, "El Hobbit", "Fantasía");
    	Libro l8 = new Libro(8, "Los juegos del hambre", "Ciencia ficción");
    	Libro l9 = new Libro(9, "Orgullo y prejuicio", "Romance");
    	Libro l10 = new Libro(10, "Una Voz en la Noche", "Suspenso");
       
    	Socio s1 = new Socio("Shotaro", 1);
        Socio s2 = new Socio("Leon Kennedy ", 2);
        Socio s3 = new Socio("TEN", 3);

        
        s1.agregarLibro(l1);
        s1.agregarLibro(l6);

        s2.agregarLibro(l10);

        s3.agregarLibro(l8);
        s3.agregarLibro(l5);

        
        s1.mostrarLibro();
        s2.mostrarLibro();
        s3.mostrarLibro();
    }
}

