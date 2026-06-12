import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> listaPacientes;

    public Hospital() {
        listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {

        listaPacientes.add(p);
    }

    public void listarlos() {

        for (Paciente p : listaPacientes) {

            p.mostrarPaciente();
        }
    }

    public int cantidadPacientes() {

        return listaPacientes.size();
    }
    
    public void obtenerPaciente(int indice){
    	listaPacientes.get(indice);
    }
}