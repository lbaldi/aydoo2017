package ar.edu.untref.aydoo;

public class Partido {

    private String nombre;

    public Partido(String nombre) {

        asignarNombre(nombre);

    }

    public String obtenerNombre() {

        return this.nombre;

    }

    private void asignarNombre(String nombre){

        this.nombre = nombre;

    }
}
