package EstudianteDao;
interface EstudianteDao {
	
	void createbro(Estudiante e);
	Estudiante ListarporId(int id);
	List<Estudiante> ListarTodo();
	void deletebro(Estudiante e);
	void updatebro(Estudiante e);
}
