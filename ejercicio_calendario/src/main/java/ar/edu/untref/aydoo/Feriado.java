package ar.edu.untref.aydoo;

public abstract class Feriado {

    private int dia;

    private int mes;

    Feriado(final int dia, final int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int obtenerDia() {
        return dia;
    }

    public int obtenerMes() {
        return mes;
    }

    public abstract Feriado obtenerDiaEnQueCae(int i);

}
