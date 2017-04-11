package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Calendar;

public class TestIntegracionLibreria {

    protected Libreria libreria;

    protected Libro libroElHobbit;

    protected ArticuloLibreria articuloLapicera;

    protected Revista revistaElGrafico;

    protected Revista revistaBarcelona;protected Periodico diarioPagina12;

    protected Periodico diarioClarin;

    @Before
    public void configuracionDeDatosIniciales(){
        this.libreria = new Libreria();
        this.revistaBarcelona = new Revista(20.0, 2);
        this.revistaElGrafico = new Revista(30.0, 1);
        this.libroElHobbit = new Libro(50.0);
        this.articuloLapicera = new ArticuloLibreria(5.0, 21.0);
        this.diarioPagina12 = new Periodico(12.0, 30);
        this.diarioClarin = new Periodico(13.0, 30);
    }

    @Test
    public void calcularMontoACobrarIntegralCasoUno(){
        Cliente juan = new Cliente("Leandro", "Calle Falsa");
        this.libreria.registrarVenta(Calendar.AUGUST, juan, this.libroElHobbit);
        this.libreria.registrarVenta(Calendar.AUGUST, juan, this.articuloLapicera);
        this.libreria.registrarVenta(Calendar.AUGUST, juan, this.articuloLapicera);
        this.libreria.registrarVenta(Calendar.AUGUST, juan, this.revistaElGrafico);
        Double montoACobrar = this.libreria.calcularMontoACobrar(Calendar.AUGUST, juan);
        Double montoEsperado = 92.1;

        Assert.assertEquals(montoEsperado, montoACobrar);
    }

    @Test
    public void calcularMontoACobrarIntegralCasoDos(){
        Cliente maria = new Cliente("Leandro", "Calle Falsa");
        this.libreria.registrarVenta(Calendar.JANUARY, maria, this.diarioPagina12);
        this.libreria.registrarSuscripcion(Calendar.JANUARY, 12, this.revistaBarcelona, 20.0, maria);
        Double montoACobrar = this.libreria.calcularMontoACobrar(Calendar.JANUARY, maria);
        Double montoEsperado = 44.0;

        Assert.assertEquals(montoEsperado, montoACobrar);
    }

}