public class Main {
	
	public static void Main(String[] args) {
		
		String[][] datos = {
				{"El Principito", "9789504000044", "3200"},
				{"Donde viven los monstruos", "9789877381501", "2800"},
				{"Matilda", "9788420432885", "4500"},
				{"Charlie y la fábrica de chocolate", "9788420432878", "4500"},
				{"El árbol generoso", "9789877380125", "2600"},
				{"Harriet, la espía", "9788420401164", "5100"},
				{"El ratón que se comió la luna", "9788416648931", "2200"},
				{"Las aventuras de Pippi Mediaslargas", "9788420400891", "3900"},
				{"El mago de Oz", "9789504000815", "3500"},
				{"El hobbit", "9788445000687", "6200"}
				};
	 
	 Biblioteca biblioteca = new Biblioteca();
	 
	 for (int i=0; i<datos.length; i++) {

         String titulo = datos[i][0];
         String ISBN = datos[i][1];
         int cantidadPaginas = Integer.parseInt (datos[i][2]);
         
         Libro l = new Libro(titulo, ISBN, cantidadPaginas);
         
         biblioteca.agregarLibro(l);
     }
	 
	 biblioteca.listarlos();
	 
	 System.out.println("Cantidad de productos: " + biblioteca.cantidadLibros());
	 
	 System.out.println("Cantidad de páginas que tiene el libro de indice 5: " + datos[5][2]);

         
	}
}
