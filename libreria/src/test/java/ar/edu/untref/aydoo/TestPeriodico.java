package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestPeriodico {

    @Test
    public void pruebaObtenerValorYComprarConProductoCreado(){

        Producto producto = new Periodico(10.0, 1);

        Double valorEsperado = 10.0;
        Double valorObtenido = producto.obtenerValor();

        Assert.assertEquals(valorEsperado, valorObtenido);

    }

    @Test
    public void pruebaObtenerPeriodicidadYComprarConProductoCreado(){

        Periodico producto = new Periodico(10.0, 1);

        Integer PeriodicidadEsperada = 1;
        Integer PeriodicidadObtenida = producto.obtenerPeriodicidadMensual();

        Assert.assertEquals(PeriodicidadEsperada, PeriodicidadObtenida);

    }

}
