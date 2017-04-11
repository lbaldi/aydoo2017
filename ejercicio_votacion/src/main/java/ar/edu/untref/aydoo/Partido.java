package ar.edu.untref.aydoo;

public class Partido {

    private String nombre;

    public Partido(String nombre) {
        this.asignarNombre(nombre);
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    private void asignarNombre(String nombre){
        this.nombre = nombre;
    }

}
