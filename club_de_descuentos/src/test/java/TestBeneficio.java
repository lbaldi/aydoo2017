import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBeneficio {

    private Mes mes;

    @Before
    public void configurarEscenario() {
        this.mes = new Mes("2017/04");
    }

    @Test
    public void crearBeneficioYObtenerClienteCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 10.0, this.mes);

        Assert.assertEquals(clienteLeandro, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerClienteIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Cliente clienteAnonimo = new Cliente("Anonimo", "anonimo@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertNotEquals(clienteAnonimo, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerValorCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);
        Double valorEsperado = 100.0;

        Assert.assertEquals(valorEsperado, beneficio.obtenerValor());
    }

    @Test
    public void crearBeneficioYObtenerValorIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);
        Double valorEsperado = 0.0;

        Assert.assertNotEquals(valorEsperado, beneficio.obtenerValor());
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void errorAlCrearBeneficioConValorNegativo() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), -10.0, this.mes);
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void errorAlCrearBeneficioConValorCero() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 0.0, this.mes);
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void errorAlCrearBeneficioConValorHabitualCero() {
        Establecimiento establecimiento = new Establecimiento("Nombre Est.", "mail@mail");
        Producto producto = new Producto("Prueba", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        new Beneficio(establecimiento, clienteLeandro, producto, 0.0, 10.0, this.mes);
    }

    @Test
    public void crearBeneficioYObtenerEstablecimientoCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertEquals(establecimiento, beneficio.obtenerEstablecimiento());
    }

    @Test
    public void crearBeneficioYObtenerEstablecimientoIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Establecimiento establecimientoIncorrecto = new Establecimiento("Establecimiento Incorrecto", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertNotEquals(establecimientoIncorrecto, beneficio.obtenerEstablecimiento());
    }

    @Test
    public void crearBeneficioYObtenerProductoCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertEquals(producto, beneficio.obtenerProducto());
    }

    @Test
    public void crearBeneficioYObtenerProductoIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Producto productoIncorrecto = new Producto("Producto Incorrecto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertNotEquals(productoIncorrecto, beneficio.obtenerEstablecimiento());
    }

    @Test
    public void crearBeneficioYObtenerValorHabitualCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Double valorHabitual = 99.0;
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, valorHabitual, 100.0, this.mes);

        Assert.assertEquals(valorHabitual, beneficio.obtenerValorHabitual());
    }

    @Test
    public void crearBeneficioYObtenerValorHabitualIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Double valorHabitualIncorrecto = 89.0;

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertNotEquals(valorHabitualIncorrecto, beneficio.obtenerValorHabitual());
    }

    @Test
    public void crearBeneficioYObtenerMesCorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Double valorHabitual = 99.0;
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, valorHabitual, 100.0, this.mes);

        Assert.assertEquals(this.mes, beneficio.obtenerMes());
    }

    @Test
    public void crearBeneficioYObtenerMesIncorrecto() {
        Establecimiento establecimiento = new Establecimiento("Establecimiento", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente("Leandro", "baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Mes mesIncorrecto = new Mes("2017/04");

        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);

        Assert.assertNotEquals(mesIncorrecto, beneficio.obtenerValorHabitual());
    }

}
