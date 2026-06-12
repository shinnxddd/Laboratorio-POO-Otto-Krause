public class Main {

    public static void main(String[] args) {

        String[][] datos = {

            {"Aaron", "40111222", "22", "72.5", "true"},
            {"Samuel", "47999111", "19", "58.0", "false"},
            {"Valentino", "56222333", "12", "81.3", "true"},
            {"Sasha", "48888777", "19", "64.7", "false"},
            {"Jazmin", "50000555", "17", "90.1", "true"},
            {"Sophia", "96777111", "17", "55.9", "false"},
            {"Octavio", "51333999", "17", "70.4", "true"},
            {"Julieta", "36666444", "15", "62.2", "false"},
            {"Benjamin", "38555111", "35", "85.0", "true"},
            {"Daniel", "50111999", "17", "59.6", "false"},
            {"Kim", "51888222", "16", "77.8", "true"},
            {"Eric", "51222666", "16", "54.3", "false"},
            {"Benito", "51999444", "16", "88.5", "true"},
            {"Gustavo", "26444777", "43", "61.1", "false"},
            {"Jose", "23777888", "54", "92.4", "true"}
        };

        Hospital hospital = new Hospital ();
        Paciente[] pacienteslol = new Paciente[datos.length];
        
        for (int i = 0; i < datos.length; i++) {

            String nombre = datos[i][0];
            int dni = Integer.parseInt(datos[i][1]);
            int edad = Integer.parseInt(datos[i][2]);
            double peso = Double.parseDouble(datos[i][3]);
            boolean estaHospitalizado = Boolean.parseBoolean(datos[i][4]);

            pacienteslol[i]= new Paciente (nombre, dni, edad, peso, estaHospitalizado);
        	}
        
        for (Paciente p : pacienteslol){
        	hospital.agregarPaciente(p);
        }
        hospital.listarlos();

        System.out.println("Cantidad de pacientes: " + hospital.cantidadPacientes());
        System.out.println("----------------");
        hospital.obtenerPaciente(4);
       	hospital.obtenerPaciente(12);
    }
}
