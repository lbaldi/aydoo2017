import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCliente {

    private Mes mes;

    @Before
    public void configurarEscenario(){
        this.mes = new Mes("2017/04");
    }

    @Test
    public void crearClienteYObtenerNombreCorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(nombreCliente, clienteLeandro.obtenerNombre());
    }

    @Test
    public void crearClienteYObtenerNombreIncorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        String nombreIncorrecto = "Nombre Incorrecto";

        Assert.assertNotEquals(nombreIncorrecto, clienteLeandro.obtenerNombre());
    }

    @Test
    public void crearClienteYObtenerEmailCorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(emailCliente, clienteLeandro.obtenerMail());
    }

    @Test
    public void crearClienteYObtenerEmailIncorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        String emailIncorrecto = "Email Incorrecto";

        Assert.assertNotEquals(emailIncorrecto, clienteLeandro.obtenerMail());
    }

    @Test
    public void crearClienteYObtenerTarjetaBeneficioCorrecta() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(TARJETA_BENEFICIO.CLASSIC, clienteLeandro.obtenerTarjetaBeneficio());
    }

    @Test
    public void crearClienteYObtenerTarjetaBeneficioIncorrecta() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertNotEquals(TARJETA_BENEFICIO.PREMIUM, clienteLeandro.obtenerTarjetaBeneficio());
    }

    @Test
    public void crearClienteYObtenerBeneficiosCorrectos() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertEquals(0, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void crearClienteYObtenerBeneficiosIncorrectos() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);

        Assert.assertNotEquals(1, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void agregarBeneficioAClienteYComprobarCantidadBeneficios() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Establecimiento establecimiento = new Establecimiento("Est.", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);
        clienteLeandro.registrarBeneficio(beneficio);

        Assert.assertEquals(1, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void agregarBeneficiosAClienteYComprobarMontoAhorrado() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Establecimiento establecimiento = new Establecimiento("Est.", "mail@mail");
        Producto producto = new Producto("Producto", 100.0);
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio100 = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 100.0, this.mes);
        Beneficio beneficio200 = new Beneficio(establecimiento, clienteLeandro, producto, producto.obtenerValor(), 200.0, this.mes);
        clienteLeandro.registrarBeneficio(beneficio100);
        clienteLeandro.registrarBeneficio(beneficio200);
        Double montoAhorradoEsperado = 300.0;

        Assert.assertEquals(montoAhorradoEsperado, clienteLeandro.obtenerMontoAhorrado(this.mes));
    }

}
