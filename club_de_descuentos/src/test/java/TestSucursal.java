import ar.edu.untref.aydoo.Establecimiento;
import ar.edu.untref.aydoo.Sucursal;
import org.junit.Assert;
import org.junit.Test;

public class TestSucursal {

    @Test
    public void crearSucursalYObtenerNombreCorrecto(){
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(nombreSucursal, sucursal.obtenerNombre());
    }

    @Test
    public void crearSucursalYObtenerDireccionCorrecto(){
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(direccionSucursal, sucursal.obtenerDireccion());
    }

    @Test
    public void crearSucursalYObtenerEstablecimiento(){
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);

        Assert.assertEquals(establecimiento, sucursal.obtenerEstablecimiento());
    }

    @Test
    public void crearSucursarYObtenerBeneficiosOtorgados(){
        String nombreSucursal = "Nombre Sucursal";
        String direccionSucursal = "Calle Falsa";
        String nombreEstablecimiento = "Nombre Establecimiento";
        String emailEstabablecimiento = "example@example.com";
        Establecimiento establecimiento = new Establecimiento(nombreEstablecimiento, emailEstabablecimiento);
        Sucursal sucursal = new Sucursal(nombreSucursal, direccionSucursal, establecimiento);
        Integer cantidadBeneficiosOtorgados = 0;

        Assert.assertEquals(cantidadBeneficiosOtorgados, sucursal.obtenerCantidadDeBeneficiosOtorgados());
    }

}