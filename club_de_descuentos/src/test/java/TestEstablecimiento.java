import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Test;

public class TestEstablecimiento {

    @Test
    public void crearEstablecimientoYObtenerNombreCorrecto() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);

        Assert.assertEquals(nombreEstablecimiento, establecimiento.obtenerNombre());
    }

    @Test
    public void crearEstablecimientoYObtenerNombreIncorrecto() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        String nombreIncorrectoEstablecimiento = "Nombre Incorrecto";

        Assert.assertNotEquals(nombreIncorrectoEstablecimiento, establecimiento.obtenerNombre());
    }

    @Test
    public void crearEstablecimientoYObtenerMailCorrecto() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);

        Assert.assertEquals(emailEstabablecimiento, establecimiento.obtenerMail());
    }

    @Test
    public void crearEstablecimientoYObtenerMailIncorrecto() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        String mailIncorrectoEstablecimiento = "example@incorrecto.com";

        Assert.assertNotEquals(mailIncorrectoEstablecimiento, establecimiento.obtenerMail());
    }

    @Test
    public void crearEstablecimientoYObtenerSucursalesVacias() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);

        Assert.assertEquals(0, establecimiento.obtenerSucursales().size());
    }

    @Test
    public void adherirSucursalYObtenerSucursales() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        new Sucursal("Nombre Sucursal A", "Calle Falsa", establecimiento);
        new Sucursal("Nombre Sucursal B", "Calle Falsa", establecimiento);

        Assert.assertEquals(2, establecimiento.obtenerSucursales().size());
    }

    @Test
    public void crearEstablecimientoYObtenerTipoBeneficioVacio() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);

        Assert.assertEquals(0, establecimiento.obtenerTipoBeneficios().size());
    }

    @Test
    public void adherirTipoBeneficioYObtenerTipoBeneficio() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Double descuento = 20.0;
        establecimiento.adherirTipoBeneficio(descuento, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(1, establecimiento.obtenerTipoBeneficios().size());
    }

    @Test
    public void adherirDosTiposBeneficioConMismaTarjetaYObtenerTipoBeneficio() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Double descuento = 20.0;
        establecimiento.adherirTipoBeneficio(descuento, TARJETA_BENEFICIO.CLASSIC);
        establecimiento.adherirTipoBeneficio(descuento, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(1, establecimiento.obtenerTipoBeneficios().size());
    }

    @Test
    public void crearEstablecimientoYObtenerCantidadDeBeneficiosOtorgados() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Integer cantidadBeneficiosOtorgadoEsperado = 0;

        Assert.assertEquals(cantidadBeneficiosOtorgadoEsperado, establecimiento.obtenerCantidadDeBeneficiosOtorgados());
    }

    @Test
    public void crearEstableclientoYObtenerSucursalConMasBeneficiosOtorgados() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);

        Assert.assertNull(establecimiento.obtenerSucursalConMasBeneficiosOtorgados(new Mes("Un mes")));
    }

    @Test(expected = ExcepcionPorcentajeDescuentoEstablecimiento.class)
    public void adherirTipoBeneficioConDescuentoQueNoApliqueAPoliticaDescuento() {
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Double descuento = 4.9;

        establecimiento.adherirTipoBeneficio(descuento, TARJETA_BENEFICIO.CLASSIC);
    }

}
