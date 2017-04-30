package ar.edu.untref.aydoo.state;

public class AlarmaAccionada implements EstadoAlarma {

    private Alarma alarma;

    public AlarmaAccionada(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public void activar() {
        System.out.println("NO SE PUEDE ACTIVAR UNA ALARMA ACCIONADA.");
    }

    @Override
    public void desactivar() {
        this.alarma.asignarEstado(new AlarmaInactiva(this.alarma));
        System.out.println("LA ALARMA HA SIDO DESACTIVADA.");
    }

    @Override
    public void accionar() {
        System.out.println("LA ALARMA YA SE ENCUENTRA ACCIONADA.");
    }
}
