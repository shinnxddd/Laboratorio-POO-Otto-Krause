package ejercitacion3;
	public class main {
		public static void main(String[] args) {
			animal a1 = new animal("ruli", "Perro");
			animal a2 = new animal("eunseok", "Gato");
			animal a3 = new animal("rubio", "Perro");
			animal a4 = new animal("chipa", "Gato");
			veterinario vet1 = new veterinario("sasa");
			veterinario vet2 = new veterinario("shotaro");
			veterinario vet3 = new veterinario("bruno");
			vet1.agregarAnimal(a1);
			vet1.agregarAnimal(a2);
			vet1.agregarAnimal(a3);
			vet2.agregarAnimal(a1);
			vet2.agregarAnimal(a4);
			vet3.agregarAnimal(a2);
			vet3.agregarAnimal(a3);
			vet1.mostrarAnimales();
			vet2.mostrarAnimales();
			vet3.mostrarAnimales();
		}
}
