package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Feriado> feriados = new ArrayList<Feriado>();

    public void agregarFeriado(Feriado feriado) {
        feriados.add(feriado);
    }

    public boolean esLaborable(int dia, int mes, int anio) {
        Boolean esLaborable = false;
        for (Feriado f : feriados) {
            if (f.obtenerDia() == dia && f.obtenerMes() == mes) {
                esLaborable = true;
            }
        }
        return esLaborable;
    }
}
