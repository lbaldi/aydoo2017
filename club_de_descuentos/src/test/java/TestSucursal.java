import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSucursal {

    @Test
    public void crearSucursalYObtenerNombreCorrecto() {
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(nombreSucursal, sucursal.obtenerNombre());
    }

    @Test
    public void crearSucursalYObtenerDireccionCorrecto() {
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(direccionSucursal, sucursal.obtenerDireccion());
    }

    @Test
    public void crearSucursalYObtenerEstablecimiento() {
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(establecimiento, sucursal.obtenerEstablecimiento());
    }

    @Test(expected = ExcepcionValorMinimoDosPorUno.class)
    public void errorAlRegistrarProductoDosPorUnoConDosProductosDeValorMenorACien() {
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);
        Cliente cliente = new Cliente("Leandro", "baldileandro@gmail.com", TarjetaBeneficio.PREMIUM);
        Producto productoValorDiez = new Producto("Producto con valor diez", 10.0);

        sucursal.registrarBeneficioCompraDosPorUno(cliente, productoValorDiez, productoValorDiez, new Mes("2017/04"));
    }

}
