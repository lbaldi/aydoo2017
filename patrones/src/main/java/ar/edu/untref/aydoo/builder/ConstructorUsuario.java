package ar.edu.untref.aydoo.builder;

public class ConstructorUsuario {

    private String nombre;

    private String apellido;

    private String correo;

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerApellido() {
        return this.apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerCorreo() {
        return this.correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public ConstructorUsuario nombre(String nombre) {
        this.asignarNombre(nombre);
        return this;
    }

    public ConstructorUsuario apellido(String apellido) {
        this.asignarApellido(apellido);
        return this;
    }

    public ConstructorUsuario correo(String correo) {
        this.asignarCorreo(correo);
        return this;
    }

    public Usuario construir() {
        return new Usuario(this);
    }

}
