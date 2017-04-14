package ar.edu.untref.aydoo;

/**
 * Entity
 */
public class Cliente {

    protected String nombre;

    protected String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerDireccion() {
        return this.direccion;
    }

}
