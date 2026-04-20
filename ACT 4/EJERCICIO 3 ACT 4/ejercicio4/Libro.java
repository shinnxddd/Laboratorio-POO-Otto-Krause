package ejercicio4;

public class Libro extends Producto {

    private String autor;
    private String genero;

    public Libro(int codigo, float precio, String autor, String genero) {
        super(codigo, precio);
        this.autor = autor;
        this.genero = genero;
    }
    
    public String toString(){
    	return "Autor: "+ this.autor + " Genero: "+this.genero;
    }
}