package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestRevista {

    @Test
    public void pruebaObtenerValorYComprarConProductoCreado(){

        Producto producto = new Revista(10.0, 1);

        Double valorEsperado = 10.0;
        Double valorObtenido = producto.obtenerValor();

        Assert.assertEquals(valorEsperado, valorObtenido);

    }

    @Test
    public void pruebaObtenerPeriodicidadYComprarConProductoCreado(){

        Revista producto = new Revista(10.0, 1);

        Integer PeriodicidadEsperada = 1;
        Integer PeriodicidadObtenida = producto.obtenerPeriodicidadMensual();

        Assert.assertEquals(PeriodicidadEsperada, PeriodicidadObtenida);

    }

}
