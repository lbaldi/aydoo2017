import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestIntegracion {

    @Test
    public void testObtenerEstablecimientoConMasBeneficiosOtorgados() {
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
        s1.registrarBeneficioCompraProducto(carlos, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(juan, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s3.registrarBeneficioCompraProducto(carlos, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);

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
        clubDeDescuento.adherirEstablecimiento(heladeriaA);
        clubDeDescuento.adherirEstablecimiento(restaurantB);
        // Clientes que realizaran las operaciones
        Cliente carlos = clubDeDescuento.adherirCliente("Carlos", "carlos@aydoo.edu.ar", TARJETA_BENEFICIO.CLASSIC);
        Cliente juan = clubDeDescuento.adherirCliente("Juan", "juan@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clientePremium = clubDeDescuento.adherirCliente("Cliente Anonimo Premium", "premium@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);
        Cliente clienteClassic = clubDeDescuento.adherirCliente("Cliente Anonimo Classic", "classic@aydoo.edu.ar", TARJETA_BENEFICIO.PREMIUM);

        Producto producto = new Producto("Producto Prueba", 100.0);

        s1.registrarBeneficioCompraProducto(carlos, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(juan, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s3.registrarBeneficioCompraProducto(carlos, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);

        Sucursal sucursalConMasBeneficiosOtorgados = clubDeDescuento.obtenerSucursalConMasBeneficiosOtorgados();

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

        s1.registrarBeneficioCompraProducto(carlos, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(clienteClassic, producto);
        s1.registrarBeneficioCompraProducto(juan, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s1.registrarBeneficioCompraProducto(clientePremium, producto);
        s3.registrarBeneficioCompraProducto(carlos, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);
        s3.registrarBeneficioCompraProducto(clienteClassic, producto);

        Map<Cliente, Double> totalDeAhorroPorClienteEsperado = new HashMap<>();
        totalDeAhorroPorClienteEsperado.put(juan, 200.0);
        totalDeAhorroPorClienteEsperado.put(carlos, 300.0);
        totalDeAhorroPorClienteEsperado.put(clienteClassic, 1600.0);
        totalDeAhorroPorClienteEsperado.put(clientePremium, 400.0);
        Map<Cliente, Double> totalDeAhorroPorCliente = clubDeDescuento.obtenerTotalDeAhorroPorCliente();

        Assert.assertEquals(totalDeAhorroPorClienteEsperado, totalDeAhorroPorCliente);
    }

}
