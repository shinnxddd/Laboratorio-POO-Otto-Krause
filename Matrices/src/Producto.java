import java.util.*;
public class Producto {
	private String nombre;
	private String codigo;
	private int precio;
	
	public Producto(String nombre, String codigo, int precio) {      
	       this.nombre = nombre;
	       this.codigo = codigo;
	       this.precio = precio;
	       }
	
	  public String getnombre() {
		   	return nombre;
		   }
	  
	  public String codigo() {
		   	return codigo;
		   }
	  
	  
	  public int precio() {
		   	return precio;
		   }
	  
	  public void mostrarProdu() {
		  System.out.println("Nombre del producto: " + nombre);
		  System.out.println("Codigo del producto: " + codigo);
		  System.out.println("Precio del producto: " + precio);
	  }
}
