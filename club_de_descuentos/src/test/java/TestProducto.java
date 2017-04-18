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
    public void errorAlCrearProductConValorNegativo(){
        new Producto("Prueba", -10.0);
    }

    @Test(expected = ExcepcionValorProducto.class)
    public void errorAlCrearProductoConValorCero(){
        new Producto("Prueba", 0.0);
    }

}
