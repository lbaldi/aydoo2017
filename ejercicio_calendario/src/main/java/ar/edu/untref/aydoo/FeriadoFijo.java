package ar.edu.untref.aydoo;

public class FeriadoFijo extends Feriado {

    public FeriadoFijo(int dia, int mes) {
        super(dia, mes);
    }

    public Feriado obtenerDiaEnQueCae(int anio) {
        return this;
    }

}
