package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;
import java.util.Calendar;

public class TestIntegracionLibreria {

    @Test
    public void calcularMontoACobrarIntegralCasoUno(){

        /**
         * Caso 1, en agosto Juan compra:
         * 1 ejemplar del Hobbit,
         * 2 lapiceras
         * un ejemplar del gráfico (ejemplar suelto, no suscripción)
         * => Monto a cobrarle por agosto: 50 + 12,1 + 30 = $90
         */

        Revista revistaHobbit = new Revista(50.0);
        ArticuloLibreria lapicera = new ArticuloLibreria(5.0);
        Periodico elGrafico = new Periodico(30.0);
        Cliente juan = new Cliente();
        Libreria libreria = new Libreria();
        libreria.registrarVenta(Calendar.AUGUST, juan, revistaHobbit);
        libreria.registrarVenta(Calendar.AUGUST, juan, lapicera);
        libreria.registrarVenta(Calendar.AUGUST, juan, lapicera);
        libreria.registrarVenta(Calendar.AUGUST, juan, elGrafico);

        Double montoACobrar = libreria.calcularMontoACobrar(Calendar.AUGUST, juan);
        Double montoEsperado = 90.0;

        Assert.assertEquals(montoEsperado, montoACobrar);

    }

    @Test
    public void calcularMontoACobrarIntegralCasoDos(){

        /**
         * Caso 2, en enero Maria compra:
         * 1 suscripción anual a la Revista Barcelona
         * un ejemplar del diario Página12
         * => Monto a cobrarle por enero: 32 + 12 = $44
         */

        Revista revistaBarcelona = new Revista(20.0);
        Periodico pagina12 = new Periodico(12.0);
        Cliente maria = new Cliente();
        Libreria libreria = new Libreria();
        // @TODO FALTA ADHERIR SUSCRIPCION
        // libreria.adherirSuscripcion(maria, revistaBarcelona, 20.0);
        libreria.registrarVenta(Calendar.JANUARY, maria, pagina12);

        Double montoACobrar = libreria.calcularMontoACobrar(Calendar.JANUARY, maria);
        Double montoEsperado = 12.0;

        Assert.assertEquals(montoEsperado, montoACobrar);

    }

}

