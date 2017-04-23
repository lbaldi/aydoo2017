import ar.edu.untref.aydoo.Calendario;
import ar.edu.untref.aydoo.FeriadoFijo;
import org.junit.Assert;
import org.junit.Test;

public class CalendarioTest {

    @Test
    public void debeAgregarPrimeroDeMayo() {
        Calendario c = new Calendario();
        c.agregarFeriado(new FeriadoFijo(1, 5));

        Assert.assertEquals(true, c.esLaborable(1, 5, 2017));
    }
}
