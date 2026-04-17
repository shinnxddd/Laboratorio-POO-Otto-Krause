package ejercitacion3;
	import java.util.ArrayList;
	public class veterinario {
		private String nombre;
		private ArrayList<animal> animales;
		public veterinario(String nombre) {
			this.nombre = nombre;
			this.animales = new ArrayList<>();
		}
		public void agregarAnimal(animal a) {
		    int cantidad = animales.size();
		    if (cantidad < 3) {
		        animales.add(a);
		    } else {
		        System.out.println("El veterinario " + nombre + " ya tiene 3 animales.");
		    }
		}
		public void mostrarAnimales() {
			System.out.println("Veterinario: " + nombre);
			for (animal a : animales) {
				a.mostrarInfo();
		}
	}	
}
	
