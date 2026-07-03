package ExcepcionesFutbol;

public class Seleccion {
    private String nombre;
    private String continente;
    private int puntos;
    private int cantJugadores;
    private String estadoClasificacion;
    private DirectorTecnico directorTecnico;  // como lo de paciente de la prueba

    public Seleccion(String nombre, String continente, int puntos, int cantJugadores, String estadoClasificacion) 
        throws IllegalArgumentException {
        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        
        if (cantJugadores < 1 || cantJugadores > 26) {
            throw new IllegalArgumentException("Error: La cantidad de jugadores convocados (" 
                    + cantJugadores + ") debe estar entre 1 y 26.");
        } 
        
        this.cantJugadores = cantJugadores;
        this.estadoClasificacion = estadoClasificacion;
        this.directorTecnico = null; 
    }

    public void jugarPartido() throws JugadoresInsuficientesException {
        if (this.cantJugadores < 11) {
            throw new JugadoresInsuficientesException("La selección" + nombre 
                    + " no puede jugar porque le faltan jugadores");
        }
        System.out.println("La selección" + nombre + " puede jugar porque estan bien de jugadores.");
    }

    public String getnombre() { 
        return nombre; 
    }

    public String getcontinente() { 
        return continente; 
    }    

    public int getpuntos() { 
        return puntos; 
    }

    public void setpuntos(int puntos) { 
        this.puntos = puntos; 
    }

    public int getcantidadJugadores() { 
    return cantJugadores; 
   }


    public String getestadoClasificacion() { 
        return estadoClasificacion; 
    }
    
    public DirectorTecnico getdirectorTecnico() { 
        return directorTecnico; 
    }
    
    public void setDirectorTecnico(DirectorTecnico directorTecnico) { 
        this.directorTecnico = directorTecnico; 
    }

    @Override

    public String toString() {
        return "Selección: " + nombre + 
               "Continente de la seleccion: " + continente + 
               "Puntos que tienen: " + puntos  + 
               "Jugadores que hay: " + cantJugadores + 
               "Estado: " + estadoClasificacion;
    }
}
