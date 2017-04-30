package ar.edu.untref.aydoo.state;

public class AlarmaActiva implements EstadoAlarma {

    private Alarma alarma;

    public AlarmaActiva(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public void activar() {
        System.out.println("LA ALARMA YA SE ENCUENTRA ACTIVA.");
    }

    @Override
    public void desactivar() {
        this.alarma.asignarEstado(new AlarmaInactiva(this.alarma));
        System.out.println("LA ALARMA HA SIDO DESACTIVADA.");
    }

    @Override
    public void accionar() {
        this.alarma.asignarEstado(new AlarmaAccionada(this.alarma));
        System.out.println("LA ALARMA HA SIDO ACCIONADA.");
    }
}
