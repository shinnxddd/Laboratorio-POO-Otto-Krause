package ejercitacion3;
	public class animal {
		private String nombre;
		private String tipo;
		public animal(String nombre, String tipo) {
			this.nombre = nombre;
			this.tipo = tipo;
		}
		public void mostrarInfo() {
			System.out.println(tipo + ": " + nombre);
		}
}
