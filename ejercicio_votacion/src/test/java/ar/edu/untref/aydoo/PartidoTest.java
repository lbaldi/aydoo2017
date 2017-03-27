package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {

    @Test
    public void crearPartidoCompararNombreCorrecto(){

        String nombrePartido = "Cambiemos";
        Partido partido = new Partido(nombrePartido);
        Assert.assertEquals(nombrePartido, partido.obtenerNombre());

    }

    @Test
    public void crearPartidoCompararNombreIncorrecto(){

        String nombrePartidoIncorrecto = "Nombre Incorrecto";
        String nombrePartido = "Cambiemos";
        Partido partido = new Partido(nombrePartido);
        Assert.assertNotEquals(nombrePartidoIncorrecto, partido.obtenerNombre());

    }

}
