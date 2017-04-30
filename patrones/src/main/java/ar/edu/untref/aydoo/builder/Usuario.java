package ar.edu.untref.aydoo.builder;

public class Usuario {

    private String nombre;

    private String apellido;

    private String correo;

    public Usuario(ConstructorUsuario constructorUsuario) {
        this.asignarNombre(constructorUsuario.obtenerNombre());
        this.asignarCorreo(constructorUsuario.obtenerCorreo());
        this.asignarApellido(constructorUsuario.obtenerApellido());
    }

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
}