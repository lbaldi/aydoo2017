import ar.edu.untref.aydoo.Beneficio;
import ar.edu.untref.aydoo.Cliente;
import ar.edu.untref.aydoo.TarjetaBeneficio;
import ar.edu.untref.aydoo.TarjetaBeneficioClassic;
import org.junit.Assert;
import org.junit.Test;

public class TestCliente {

    @Test
    public void crearClienteYObtenerNombreCorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);

        Assert.assertEquals(nombreCliente, clienteLeandro.obtenerNombre());
    }

    @Test
    public void crearClienteYObtenerNombreIncorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);
        String nombreIncorrecto = "Nombre Incorrecto";

        Assert.assertNotEquals(nombreIncorrecto, clienteLeandro.obtenerNombre());
    }

    @Test
    public void crearClienteYObtenerEmailCorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);

        Assert.assertEquals(emailCliente, clienteLeandro.obtenerMail());
    }

    @Test
    public void crearClienteYObtenerEmailIncorrecto() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);
        String emailIncorrecto = "Email Incorrecto";

        Assert.assertNotEquals(emailIncorrecto, clienteLeandro.obtenerMail());
    }

    @Test
    public void crearClienteYObtenerTarjetaBeneficioCorrecta() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);

        Assert.assertEquals(tarjetaBeneficio, clienteLeandro.obtenerTarjetaBeneficio());
    }

    @Test
    public void crearClienteYObtenerTarjetaBeneficioIncorrecta() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);
        TarjetaBeneficio tarjetaBeneficioIncorrecta = new TarjetaBeneficioClassic();

        Assert.assertNotEquals(tarjetaBeneficioIncorrecta, clienteLeandro.obtenerTarjetaBeneficio());
    }

    @Test
    public void crearClienteYObtenerBeneficiosCorrectos() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);

        Assert.assertEquals(0, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void crearClienteYObtenerBeneficiosIncorrectos() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);

        Assert.assertNotEquals(1, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void agregarBeneficioAClienteYComprobarCantidadBeneficios() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        clienteLeandro.registrarBeneficio(beneficio);

        Assert.assertEquals(1, clienteLeandro.obtenerBeneficiosObtenidos().size());
    }

    @Test
    public void agregarBeneficiosAClienteYComprobarMontoAhorrado() {
        String nombreCliente = "Leandro";
        String emailCliente = "baldileandro@gmail.com";
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente(nombreCliente, emailCliente, tarjetaBeneficio);
        Beneficio beneficio100 = new Beneficio(clienteLeandro, 100.0);
        Beneficio beneficio200 = new Beneficio(clienteLeandro, 200.0);
        clienteLeandro.registrarBeneficio(beneficio100);
        clienteLeandro.registrarBeneficio(beneficio200);
        Double montoAhorradoEsperado = 300.0;

        Assert.assertEquals(montoAhorradoEsperado, clienteLeandro.obtenerMontoAhorrado());
    }

}
