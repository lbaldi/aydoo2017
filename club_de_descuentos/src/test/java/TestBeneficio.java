import ar.edu.untref.aydoo.*;
import org.junit.Assert;
import org.junit.Test;

public class TestBeneficio {

    @Test
    public void crearBeneficioYObtenerClienteCorrecto() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);

        Assert.assertEquals(clienteLeandro, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerClienteIncorrecto() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Cliente clienteAnonimo = new Cliente("Anonimo","anonimo@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);

        Assert.assertNotEquals(clienteAnonimo, beneficio.obtenerCliente());
    }

    @Test
    public void crearBeneficioYObtenerValorCorrecto() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        Double valorEsperado = 100.0;

        Assert.assertEquals(valorEsperado, beneficio.obtenerValor());
    }

    @Test
    public void crearBeneficioYObtenerValorIncorrecto() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 100.0);
        Double valorEsperado = 0.0;

        Assert.assertNotEquals(valorEsperado, beneficio.obtenerValor());
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void crearBeneficioConValorCero() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        Beneficio beneficio = new Beneficio(clienteLeandro, 0.0);
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void errorAlCrearBeneficioConValorNegativo() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        new Beneficio(clienteLeandro, -10.0);
    }

    @Test(expected = ExcepcionValorBeneficio.class)
    public void errorAlCrearBeneficioConValorCero() {
        Cliente clienteLeandro = new Cliente("Leandro","baldileandro@gmail.com", TARJETA_BENEFICIO.CLASSIC);
        new Beneficio(clienteLeandro, 0.0);
    }

}
