package EstudianteService;

public class ServiceEstudiante() {
	private final EstudianteDao estudiantedao;
		public EstudianteService () {
			this.estudiantedao = new EstudianteDaoImpl();
		}
	public void registrarEstudiante (String nombre, String apellido, int dni, String curso) {
		EstudianteDao.createbro(e);
	}
}
