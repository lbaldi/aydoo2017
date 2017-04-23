import ar.edu.untref.aydoo.FeriadoFijo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeriadoFijoTest {

    @Test
    public void debeCrearFeriadoPara1roDeMayo() {
        int diaUno = 1;
        int mayo = 5;
        FeriadoFijo primeroDeMayo = new FeriadoFijo(diaUno, mayo);

        assertEquals(diaUno, primeroDeMayo.obtenerDia());
        assertEquals(mayo, primeroDeMayo.obtenerMes());
    }
}
