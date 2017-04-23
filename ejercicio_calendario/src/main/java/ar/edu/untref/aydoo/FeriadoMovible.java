package ar.edu.untref.aydoo;

import java.util.Calendar;

public class FeriadoMovible extends Feriado {

    public FeriadoMovible(final int dia, final int mes) {
        super(dia, mes);
    }

    public Feriado obtenerDiaEnQueCae(int anio) {
        Feriado diaEnQueCae = null;
        Calendar c = Calendar.getInstance();
        c.set(anio, obtenerMes(), obtenerDia());
        int diaDeLaSemana = c.get(Calendar.DAY_OF_WEEK);
        if (diaDeLaSemana != Calendar.SATURDAY && diaDeLaSemana != Calendar.SUNDAY) {
            diaEnQueCae = this;
        } else {
            while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                c.add(Calendar.DATE, 1);
            }
            diaEnQueCae = new FeriadoFijo(c.DAY_OF_MONTH, c.MONTH + 1);
        }
        return diaEnQueCae;
    }

}
