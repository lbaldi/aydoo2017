import ar.edu.untref.aydoo.Feriado;
import ar.edu.untref.aydoo.FeriadoFijo;
import ar.edu.untref.aydoo.FeriadoMovible;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FeriadoMovibleTest {

    @Ignore
    @Test
    public void debeMover9DeJulio() {
        Feriado f = new FeriadoMovible(9, 7);
        Feriado feriadoActual = f.obtenerDiaEnQueCae(2017);

        Assert.assertEquals(10, feriadoActual.obtenerDiaEnQueCae(2017));
    }
}
