import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestIntegracion {

    private Mes mes;

    @Before
    public void configurarEscenario() {
        this.mes = new Mes("2017/04");
    }

    @Test
    public void testObtenerEstablecimientoConMasBeneficiosOtorgados() {
        Mes abril2017 = new Mes("2017/04");
        ClubDeDescuento clubDeDescuento = new ClubDeDescuento();
        // Estableclimiento Heladeria A , sucursales y tipos de beneficio segun tarjeta
        Establecimiento heladeriaA = new Establecimiento("Heladeria A", "heladeria@restaurantB.edu.ar");
        heladeriaA.adherirTipoBeneficio(10.0, TARJETA_BENEFICIO.CLASSIC);
        heladeriaA.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s1 = new Sucursal("s1", "Direccion s1", heladeriaA);
        Sucursal s2 = new Sucursal("s2", "Direccion s2", heladeriaA);
        // Establecimiento Restaurant B, sucursales y tipo de beneficios segun tarjeta
        Establecimiento restaurantB = new Establecimiento("Restaurant B", "establecimiento@restaurantB.edu.ar");
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.CLASSIC);
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s3 = new Sucursal("s3", "Direccion s3", restaurantB);
        // Registro de establecimiento al club de descuento
        clubDeDescuento.adherirEstablecimiento(heladeriaA);
        clubDeDescuento.adherirEstablecimiento(restaurantB);
        // Clientes que realizaran las operaciones
        Cliente carlos = clubDeDescuento.adherirCliente("Carlos", "carlos@aydoo.edu.ar", TARJETA_BENEFICIO.CLASSIC);
        Cliente juan = clubDeDescuento.adherirCliente("Juan", "juan@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clientePremium = clubDeDescuento.adherirCliente("Cliente Anonimo Premium", "premium@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clienteClassic = clubDeDescuento.adherirCliente("Cliente Anonimo Classic", "classic@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Producto producto = new Producto("Producto Prueba", 1000.0);
        s1.registrarBeneficioCompraProducto(carlos, producto, abril2017);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s1.registrarBeneficioCompraProducto(juan, producto, abril2017);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, abril2017);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, abril2017);
        s3.registrarBeneficioCompraProducto(carlos, producto, abril2017);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, abril2017);

        Establecimiento establecimientoConMasBeneficiosOtorgados = clubDeDescuento.obtenerEstablecimientoConMasBeneficiosOtorgados();

        Assert.assertEquals(heladeriaA, establecimientoConMasBeneficiosOtorgados);
    }

    @Test
    public void testObtenerSucursalConMasBeneficiosOtorgados() {
        ClubDeDescuento clubDeDescuento = new ClubDeDescuento();
        // Estableclimiento Heladeria A , sucursales y tipos de beneficio segun tarjeta
        Establecimiento heladeriaA = new Establecimiento("Heladeria A", "heladeria@restaurantB.edu.ar");
        heladeriaA.adherirTipoBeneficio(10.0, TARJETA_BENEFICIO.CLASSIC);
        heladeriaA.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s1 = new Sucursal("s1", "Direccion s1", heladeriaA);
        Sucursal s2 = new Sucursal("s2", "Direccion s2", heladeriaA);
        // Establecimiento Restaurant B, sucursales y tipo de beneficios segun tarjeta
        Establecimiento restaurantB = new Establecimiento("Restaurant B", "establecimiento@restaurantB.edu.ar");
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.CLASSIC);
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s3 = new Sucursal("s3", "Direccion s3", restaurantB);
        // Registro de establecimiento al club de descuento
        clubDeDescuento.adherirEstablecimiento(restaurantB);
        clubDeDescuento.adherirEstablecimiento(heladeriaA);
        // Clientes que realizaran las operaciones
        Cliente carlos = clubDeDescuento.adherirCliente("Carlos", "carlos@aydoo.edu.ar", TARJETA_BENEFICIO.CLASSIC);
        Cliente juan = clubDeDescuento.adherirCliente("Juan", "juan@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clientePremium = clubDeDescuento.adherirCliente("Cliente Anonimo Premium", "premium@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clienteClassic = clubDeDescuento.adherirCliente("Cliente Anonimo Classic", "classic@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);

        Producto producto = new Producto("Producto Prueba", 100.0);

        s1.registrarBeneficioCompraProducto(carlos, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(juan, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, this.mes);
        s3.registrarBeneficioCompraProducto(carlos, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, new Mes("Otro Mes"));
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, new Mes("Otro Mes"));
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, new Mes("Otro Mes"));

        Sucursal sucursalConMasBeneficiosOtorgados = clubDeDescuento.obtenerSucursalConMasBeneficiosOtorgados(this.mes);

        Assert.assertEquals(s1, sucursalConMasBeneficiosOtorgados);
    }

    @Test
    public void testObtenerTotalDeAhorroPorCliente() {
        ClubDeDescuento clubDeDescuento = new ClubDeDescuento();
        // Estableclimiento Heladeria A , sucursales y tipos de beneficio segun tarjeta
        Establecimiento heladeriaA = new Establecimiento("Heladeria A", "heladeria@restaurantB.edu.ar");
        heladeriaA.adherirTipoBeneficio(10.0, TARJETA_BENEFICIO.CLASSIC);
        heladeriaA.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s1 = new Sucursal("s1", "Direccion s1", heladeriaA);
        Sucursal s2 = new Sucursal("s2", "Direccion s2", heladeriaA);
        // Establecimiento Restaurant B, sucursales y tipo de beneficios segun tarjeta
        Establecimiento restaurantB = new Establecimiento("Restaurant B", "establecimiento@restaurantB.edu.ar");
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.CLASSIC);
        restaurantB.adherirTipoBeneficio(20.0, TARJETA_BENEFICIO.PREMIUM);
        Sucursal s3 = new Sucursal("s3", "Direccion s3", restaurantB);
        // Registro de establecimiento al club de descuento
        clubDeDescuento.adherirEstablecimiento(heladeriaA);
        clubDeDescuento.adherirEstablecimiento(restaurantB);
        // Clientes que realizaran las operaciones
        Cliente carlos = clubDeDescuento.adherirCliente("Carlos", "carlos@aydoo.edu.ar", TARJETA_BENEFICIO.CLASSIC);
        Cliente juan = clubDeDescuento.adherirCliente("Juan", "juan@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clientePremium = clubDeDescuento.adherirCliente("Cliente Anonimo Premium", "premium@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clienteClassic = clubDeDescuento.adherirCliente("Cliente Anonimo Classic", "classic@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);

        Producto producto = new Producto("Producto Prueba", 1000.0);

        s1.registrarBeneficioCompraProducto(carlos, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s1.registrarBeneficioCompraProducto(juan, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, this.mes);
        s1.registrarBeneficioCompraProducto(clientePremium, producto, this.mes);
        s3.registrarBeneficioCompraProducto(carlos, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto, this.mes);

        s3.registrarBeneficioCompraProducto(clienteClassic, producto, new Mes("Otro Mes"));

        Map<Cliente, Double> totalDeAhorroPorClienteEsperado = new HashMap<>();
        totalDeAhorroPorClienteEsperado.put(juan, 200.0);
        totalDeAhorroPorClienteEsperado.put(carlos, 300.0);
        totalDeAhorroPorClienteEsperado.put(clienteClassic, 1600.0);
        totalDeAhorroPorClienteEsperado.put(clientePremium, 400.0);
        Map<Cliente, Double> totalDeAhorroPorCliente = clubDeDescuento.obtenerTotalDeAhorroPorCliente(this.mes);

        Assert.assertEquals(totalDeAhorroPorClienteEsperado, totalDeAhorroPorCliente);
    }

    @Test
    public void obtenerTotalDeAhorroPorClienteEnUnaCompraDosPorUno() {
        ClubDeDescuento clubDeDescuento = new ClubDeDescuento();
        // Estableclimiento El altillo , sucursales y tipos de beneficio segun tarjeta
        Establecimiento elAltillo = new Establecimiento("El Altillo", "libreria@elaltillo.edu.ar");
        Sucursal s4 = new Sucursal("s4", "Direccion s4", elAltillo);
        // Adhesion cliente
        Cliente mateo = clubDeDescuento.adherirCliente("Mateo", "mateo@aydoo.edu.ar", TARJETA_BENEFICIO.CLASSIC);
        Producto libroMartinFierro = new Producto("Martin Fierro", 100.0);
        Producto libroElCantarDelCid = new Producto("El Cantar del Cid", 80.0);
        s4.registrarBeneficioCompraDosPorUno(mateo, libroMartinFierro, libroElCantarDelCid, this.mes);

        Map<Cliente, Double> totalDeAhorroPorClienteEsperado = new HashMap<>();
        totalDeAhorroPorClienteEsperado.put(mateo, 80.0);
        Map<Cliente, Double> totalDeAhorroPorCliente = clubDeDescuento.obtenerTotalDeAhorroPorCliente(this.mes);

        Assert.assertEquals(totalDeAhorroPorClienteEsperado, totalDeAhorroPorCliente);
    }

}
