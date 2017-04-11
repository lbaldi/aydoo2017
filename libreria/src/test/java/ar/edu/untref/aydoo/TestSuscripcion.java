package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestSuscripcion {

    @Test
    public void crearSuscripcionYComprarValorMensual(){
        Suscripcion suscripcion = new Suscripcion(
                Calendar.JANUARY,
                2,
                new Revista(10.0, 2),
                20.0,
                new Cliente("Leandro", "Calle Falsa")
        );
        Double valorMensualEsperado = 16.0;
        Double valorMensualObtenido = suscripcion.obtenerValorMensual();

        Assert.assertEquals(valorMensualEsperado, valorMensualObtenido);
    }

    @Test
    public void crearSuscripcionYComprarValorMensualConDescuentoCienPorciento(){
        Suscripcion suscripcion = new Suscripcion(
                Calendar.JANUARY,
                2,
                new Revista(10.0, 2),
                100.0,
                new Cliente("Leandro", "Calle Falsa")
        );
        Double valorMensualEsperado = 0.0;
        Double valorMensualObtenido = suscripcion.obtenerValorMensual();

        Assert.assertEquals(valorMensualEsperado, valorMensualObtenido);
    }

    @Test
    public void crearSuscripcionYComprobarPertenenciaAMesCorrecto(){
        Suscripcion suscripcion = new Suscripcion(
                Calendar.JANUARY,
                2,
                new Revista(10.0, 2),
                100.0,
                new Cliente("Leandro", "Calle Falsa")
        );

        Assert.assertTrue(suscripcion.perteneAMes(Calendar.MARCH));
    }

    @Test
    public void crearSuscripcionYComprobarPertenenciaAMesIncorrecto(){
        Suscripcion suscripcion = new Suscripcion(
                Calendar.JANUARY,
                2,
                new Revista(10.0, 2),
                100.0,
                new Cliente("Leandro", "Calle Falsa")
        );

        Assert.assertFalse(suscripcion.perteneAMes(Calendar.DECEMBER));
    }

}