package ejercicio4;

public abstract class Producto {
    
    protected int codigo;
    private float precio;

    public Producto(int codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public void calcularPrecioFinal() {
        System.out.println("Calculando el precio final.");
    }
}
