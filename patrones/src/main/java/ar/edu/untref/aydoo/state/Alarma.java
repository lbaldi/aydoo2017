package ar.edu.untref.aydoo.state;

public class Alarma {

    private EstadoAlarma estado;

    public Alarma() {
        this.asignarEstado(new AlarmaInactiva(this));
    }

    public EstadoAlarma obtenerEstado() {
        return this.estado;
    }

    public void asignarEstado(EstadoAlarma estado) {
        this.estado = estado;
    }

    public void activar() {
        this.obtenerEstado().activar();
    }

    public void desactivar() {
        this.obtenerEstado().desactivar();
    }

    public void accionar() {
        this.obtenerEstado().accionar();
    }

}

