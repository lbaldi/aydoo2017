import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Test;

public class TestCliente {

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
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        clienteLeandro.registrarBeneficio(beneficio);

        Assert.assertEquals(1, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void agregarBeneficiosAClienteYComprobarMontoAhorrado() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio100 = new Beneficio(clienteLeandro, 100.0);
        Beneficio beneficio200 = new Beneficio(clienteLeandro, 200.0);
        clienteLeandro.registrarBeneficio(beneficio100);
        clienteLeandro.registrarBeneficio(beneficio200);
        Double montoAhorradoEsperado = 300.0;

        Assert.assertEquals(montoAhorradoEsperado, clienteLeandro.obtenerMontoAhorrado());
    }

}
