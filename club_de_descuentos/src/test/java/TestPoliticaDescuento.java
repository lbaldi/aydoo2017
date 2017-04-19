import ar.edu.untref.aydoo.ExcepcionPorcentajeDescuentoEstablecimiento;
import ar.edu.untref.aydoo.PoliticaDescuento;
import org.junit.Test;

public class TestPoliticaDescuento {

    @Test
    public void crearPoliticaDescuento() {
        new PoliticaDescuento();
    }

    @Test
    public void comprobarPorcentajeDescuentoCorrecto() {
        PoliticaDescuento.comprobarPorcentajeDescuento(5.0);
    }

    @Test(expected = ExcepcionPorcentajeDescuentoEstablecimiento.class)
    public void erroAlComprobarPorcentajeDescuentoIncorrecto() {
        PoliticaDescuento.comprobarPorcentajeDescuento(4.9);
    }
}
