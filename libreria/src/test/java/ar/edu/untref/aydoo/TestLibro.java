package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestLibro {

    @Test
    public void pruebaObtenerValorYComprarConProductoCreado(){
        Producto producto = new Libro(10.0);
        Double valorEsperado = 10.0;
        Double valorObtenido = producto.obtenerValor();

        Assert.assertEquals(valorEsperado, valorObtenido);
    }

}
