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

        Revista revistaHobbit = new Revista();
        ArticuloLibreria lapicera = new ArticuloLibreria();
        Periodico elGrafico = new Periodico();
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

    public void calcularMontoACobrarIntegralCasoDos(){

        /**
         * Caso 2, en enero Maria compra:
         * 1 suscripción anual a la Revista Barcelona
         * un ejemplar del diario Página12
         * => Monto a cobrarle por enero: 32 + 12 = $44
         */

        Revista revistaBarcelona = new Revista();
        Periodico pagina12 = new Periodico();
        Cliente maria = new Cliente();
        Libreria libreria = new Libreria();
        libreria.adherirSuscripcion(Calendar.JANUARY, maria, revistaBarcelona, 12);
        libreria.registrarVenta(Calendar.JANUARY, maria, pagina12);

        Double montoACobrar = libreria.calcularMontoACobrar(Calendar.JANUARY, maria);
        Double montoEsperado = 44.0;

        Assert.assertEquals(montoEsperado, montoACobrar);

    }

}

