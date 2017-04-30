package ar.edu.untref.aydoo.state;

import org.junit.Before;
import org.junit.Test;

public class TestAlarma {

    private Alarma alarma;

    @Before
    public void crearAlarma() {
        this.alarma = new Alarma();
    }

    @Test
    public void ActivarAlarmaInactiva() {
        this.alarma.activar();
    }

    @Test
    public void DesactivarAlarmaInactiva() {
        this.alarma.desactivar();
    }

    @Test
    public void AccionarAlarmaInactiva() {
        this.alarma.accionar();
    }

    @Test
    public void ActivarAlarmaActiva() {
        this.alarma.activar();
        this.alarma.activar();
    }

    @Test
    public void DesactivarAlarmaActiva() {
        this.alarma.activar();
        this.alarma.desactivar();
    }

    @Test
    public void AccionarAlarmaActiva() {
        this.alarma.activar();
        this.alarma.accionar();
        this.alarma.accionar();
    }

    @Test
    public void ActivarAlarmaAccionada() {
        this.alarma.activar();
        this.alarma.accionar();
        this.alarma.activar();
    }

    @Test
    public void DesactivarAlarmaAccionada() {
        this.alarma.activar();
        this.alarma.accionar();
        this.alarma.desactivar();
    }

    @Test
    public void AccionarAlarmaAccionada() {
        this.alarma.activar();
        this.alarma.accionar();
        this.alarma.accionar();
    }

}
