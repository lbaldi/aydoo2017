package ar.edu.untref.aydoo.state;

public class AlarmaInactiva implements EstadoAlarma {

    private Alarma alarma;

    public AlarmaInactiva(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public void activar() {
        this.alarma.asignarEstado(new AlarmaActiva(this.alarma));
        System.out.println("LA ALARMA HA SIDO ACTIVADA.");
    }

    @Override
    public void desactivar() {
        System.out.println("LA ALARMA YA SE ENCUENTRA INACTIVA.");
    }

    @Override
    public void accionar() {
        System.out.println("NO SE PUEDE ACCIONAR UNA ALARMA INACTIVA.");
    }
}
