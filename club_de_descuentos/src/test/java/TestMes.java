import ar.edu.untref.aydoo.Mes;
import org.junit.Assert;
import org.junit.Test;

public class TestMes {

    @Test
    public void crearMesYObtenerNombreCorrecto() {
        String nombreMes = "2017/01";
        Mes enero2017 = new Mes(nombreMes);

        Assert.assertEquals(nombreMes, enero2017.obtenerNombre());
    }

    @Test
    public void crearMesYObtenerNombreIncorrecto() {
        String nombreMes = "2017/01";
        String nombreMesIncorrecto = "2017/02";
        Mes enero2017 = new Mes(nombreMes);

        Assert.assertNotEquals(nombreMesIncorrecto, enero2017.obtenerNombre());
    }

}
