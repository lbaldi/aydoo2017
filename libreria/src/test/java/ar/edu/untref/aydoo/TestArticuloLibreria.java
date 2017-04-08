package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestArticuloLibreria {

    @Test
    public void pruebaObtenerValorYComprarConProductoCreado(){

        Producto producto = new ArticuloLibreria(10.0, 21.0);

        Double valorEsperado = 12.1;
        Double valorObtenido = producto.obtenerValor();

        Assert.assertEquals(valorEsperado, valorObtenido);

    }

}
