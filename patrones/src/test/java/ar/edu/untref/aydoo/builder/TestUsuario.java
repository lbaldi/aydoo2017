package ar.edu.untref.aydoo.builder;


import org.junit.Assert;
import org.junit.Test;

public class TestUsuario {

    @Test
    public void crearUsuario() {

        String nombreUsuario = "Leandro";
        String apellidoUsuario = "Baldi";
        String correoUsuario = "baldileandro@gmai.com";

        Usuario leandroBaldi = new ConstructorUsuario()
                .nombre(nombreUsuario)
                .apellido(apellidoUsuario)
                .correo(correoUsuario)
                .construir();

        Assert.assertEquals(nombreUsuario, leandroBaldi.obtenerNombre());
        Assert.assertEquals(apellidoUsuario, leandroBaldi.obtenerApellido());
        Assert.assertEquals(correoUsuario, leandroBaldi.obtenerCorreo());
    }
}