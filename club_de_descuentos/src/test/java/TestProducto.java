import ar.edu.untref.aydoo.ExcepcionValorProducto;
import ar.edu.untref.aydoo.Producto;
import org.junit.Assert;
import org.junit.Test;

public class TestProducto {

    @Test
    public void crearProductoYObtenerNombreCorrecto() {
        String nombreProducto = "Nombre Producto";
        Double valorProducto = 1000.0;
        Producto producto = new Producto(nombreProducto, valorProducto);

        Assert.assertEquals(nombreProducto, producto.obtenerNombre());
    }

    @Test
    public void crearProductoYObtenerNombreIncorrecto() {
        String nombreProducto = "Nombre Producto";
        Double valorProducto = 1000.0;
        Producto producto = new Producto(nombreProducto, valorProducto);
        String nombreProductoIncorrecto = "Nombre Producto Incorrecto";

        Assert.assertNotEquals(nombreProductoIncorrecto, producto.obtenerNombre());
    }

    @Test
    public void crearProductoYObtenerValorCorrecto() {
        String nombreProducto = "Nombre Producto";
        Double valorProducto = 1000.0;
        Producto producto = new Producto(nombreProducto, valorProducto);

        Assert.assertEquals(valorProducto, producto.obtenerValor());
    }

    @Test
    public void crearProductoYObtenerValorIncorrecto() {
        String nombreProducto = "Nombre Producto";
        Double valorProducto = 1000.0;
        Producto producto = new Producto(nombreProducto, valorProducto);
        Double valorProductoIncorrecto = 99.9;

        Assert.assertNotEquals(valorProductoIncorrecto, producto.obtenerValor());
    }

    @Test(expected = ExcepcionValorProducto.class)
    public void errorAlCrearProductConValorNegativo() {
        new Producto("Prueba", -10.0);
    }

    @Test(expected = ExcepcionValorProducto.class)
    public void errorAlCrearProductoConValorCero() {
        new Producto("Prueba", 0.0);
    }

    @Test
    public void obtenerProductoMayorValorEntreProductoDiezYProductoCinco() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto productoValorCinco = new Producto("Producto con valor cinco", 5.0);

        Producto productoObtenido = Producto.obtenerProductoMayorValor(productoValorDiez, productoValorCinco);
        Assert.assertEquals(productoValorDiez, productoObtenido);
    }

    @Test
    public void obtenerProductoMayorValorEntreProductoDiezYOtroProductoDiez() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto otroProductoValorDiez = new Producto("Producto con valor diez", 10.0);

        Producto productoObtenido = Producto.obtenerProductoMayorValor(productoValorDiez, otroProductoValorDiez);
        Assert.assertEquals(otroProductoValorDiez, productoObtenido);
    }

    @Test
    public void obtenerProductoMayorValorEntreProductoCincoYProductoDiez() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto ProductoValorCinco = new Producto("Producto con valor cinco", 10.0);

        Producto productoObtenido = Producto.obtenerProductoMayorValor(ProductoValorCinco, productoValorDiez);
        Assert.assertEquals(productoValorDiez, productoObtenido);
    }

    @Test
    public void obtenerProductoMenorValorEntreProductoDiezYProductoCinco() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto productoValorCinco = new Producto("Producto con valor cinco", 5.0);

        Producto productoObtenido = Producto.obtenerProductoMenorValor(productoValorDiez, productoValorCinco);
        Assert.assertEquals(productoValorCinco, productoObtenido);
    }

    @Test
    public void obtenerProductoMenorValorEntreProductoCincoYProductoDiez() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto productoValorCinco = new Producto("Producto con valor cinco", 5.0);

        Producto productoObtenido = Producto.obtenerProductoMenorValor(productoValorCinco, productoValorDiez);
        Assert.assertEquals(productoValorCinco, productoObtenido);
    }

    @Test
    public void obtenerProductoMenorValorEntreProductoDiezYOtroProductoDiez() {
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);
        Producto otroProductoValorDiez = new Producto("Producto con valor diez", 10.0);

        Producto productoObtenido = Producto.obtenerProductoMenorValor(productoValorDiez, otroProductoValorDiez);
        Assert.assertEquals(otroProductoValorDiez, productoObtenido);
    }

}
