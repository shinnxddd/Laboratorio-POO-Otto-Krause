public class Libro {
	private String titulo;
	private String ISBN;
	private int cantidadPaginas;
	
	public Libro(String nombre, String ISBN, int cantidadPaginas) {      
	       this.titulo = titulo;
	       this.ISBN = ISBN;
	       this.cantidadPaginas = cantidadPaginas;
	       }
	
	  public String gettitulo() {
		   	return titulo;
		   }
	  
	  public String ISBN() {
		   	return ISBN;
		   }
	  
	  
	  public int cantidadPaginas() {
		   	return cantidadPaginas;
		   }
	  
	  public void mostrarProdu() {
		  System.out.println("Titulo del libro: " + titulo);
		  System.out.println("Codigo ISBN del libro: " + ISBN);
		  System.out.println("Cantidad de paginas del libro: " + cantidadPaginas);
	  }
}
