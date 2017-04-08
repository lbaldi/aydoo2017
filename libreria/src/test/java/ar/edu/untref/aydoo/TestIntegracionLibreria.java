package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Calendar;

public class TestIntegracionLibreria {

    Libreria libreria;
    Libro libroElHobbit;
    ArticuloLibreria articuloLapicera;
    Revista revistaElGrafico;
    Revista revistaBarcelona;
    Periodico diarioPagina12;
    Periodico diarioClarin;

    @Before
    public void configuracionDeDatosIniciales(){

        libreria = new Libreria();
        revistaBarcelona = new Revista(20.0, 2);
        revistaElGrafico = new Revista(30.0, 1);
        libroElHobbit = new Libro(50.0);
        articuloLapicera = new ArticuloLibreria(5.0, 21.0);
        diarioPagina12 = new Periodico(12.0, 30);
        diarioClarin = new Periodico(13.0, 30);

    }

    @Test
    public void calcularMontoACobrarIntegralCasoUno(){

        Cliente juan = new Cliente();
        libreria.registrarVenta(Calendar.AUGUST, juan, libroElHobbit);
        libreria.registrarVenta(Calendar.AUGUST, juan, articuloLapicera);
        libreria.registrarVenta(Calendar.AUGUST, juan, articuloLapicera);
        libreria.registrarVenta(Calendar.AUGUST, juan, revistaElGrafico);

        Double montoACobrar = libreria.calcularMontoACobrar(Calendar.AUGUST, juan);
        Double montoEsperado = 92.1;

        Assert.assertEquals(montoEsperado, montoACobrar);

    }

    @Test
    public void calcularMontoACobrarIntegralCasoDos(){

        Cliente maria = new Cliente();
        libreria.registrarVenta(Calendar.JANUARY, maria, diarioPagina12);
        libreria.registrarSuscripcion(Calendar.JANUARY, 12, revistaBarcelona, 20.0, maria);

        Double montoACobrar = libreria.calcularMontoACobrar(Calendar.JANUARY, maria);
        Double montoEsperado = 44.0;

        Assert.assertEquals(montoEsperado, montoACobrar);

    }

}

