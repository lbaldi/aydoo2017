package ar.edu.untref.aydoo.strategy;

public class Persona {

    private EstrategiaDialogo estrategiaDialogo;

    public Persona() {
        this.DialogarNormalmente();
    }

    public void dialogar() {
        this.obtenerEstrategiaDialogo().dialogar();
    }

    private void asignarEstrategiaDialogo(EstrategiaDialogo estrategiaDialogo) {
        this.estrategiaDialogo = estrategiaDialogo;
    }

    public void DialogarNormalmente() {
        this.asignarEstrategiaDialogo(new EstrategiaDialogoNormal());
    }

    public void DialogarPacificamente() {
        this.asignarEstrategiaDialogo(new EstrategiaDialogoPacifico());
    }

    private EstrategiaDialogo obtenerEstrategiaDialogo() {
        return estrategiaDialogo;
    }
}
