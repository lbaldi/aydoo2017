package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestVenta {

    @Test
    public void crearVentaYComprarValor(){

        Venta venta = new Venta(
                Calendar.JANUARY,
                new Revista(10.0, 2),
                new Cliente()
        );

        Double valorEsperado = 10.0;
        Double valorObtenido = venta.obtenerValor();

        Assert.assertEquals(valorEsperado, valorObtenido);
    }

}
