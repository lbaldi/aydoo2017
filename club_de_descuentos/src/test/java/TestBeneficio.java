import ar.edu.untref.aydoo.Beneficio;
import ar.edu.untref.aydoo.Cliente;
import ar.edu.untref.aydoo.TarjetaBeneficio;
import ar.edu.untref.aydoo.TarjetaBeneficioClassic;
import org.junit.Assert;
import org.junit.Test;

public class TestBeneficio {

    @Test
    public void crearBeneficioYObtenerClienteCorrecto() {
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", tarjetaBeneficio);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);

        Assert.assertEquals(clienteLeandro, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerClienteIncorrecto() {
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", tarjetaBeneficio);
        Cliente clienteAnonimo = new Cliente("Anonimo","anonimo@gmail.com", tarjetaBeneficio);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);

        Assert.assertNotEquals(clienteAnonimo, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerValorCorrecto() {
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", tarjetaBeneficio);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        Double valorEsperado = 100.0;

        Assert.assertEquals(valorEsperado, beneficio.obtenerValor());
    }

    @Test
    public void crearBeneficioYObtenerValorIncorrecto() {
        TarjetaBeneficio tarjetaBeneficio = new TarjetaBeneficioClassic();
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", tarjetaBeneficio);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        Double valorEsperado = 0.0;

        Assert.assertNotEquals(valorEsperado, beneficio.obtenerValor());
    }

}
