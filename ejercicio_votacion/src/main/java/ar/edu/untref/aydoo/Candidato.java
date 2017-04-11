package ar.edu.untref.aydoo;

public class Candidato {

    private String nombre;

    private Partido partido;

    public Candidato(String nombre, Partido partido) {
        this.asignarNombre(nombre);
        this.asignarPartido(partido);
    }

    private void asignarPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido obtenerPartido(){
        return this.partido;
    }

    private void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

}
