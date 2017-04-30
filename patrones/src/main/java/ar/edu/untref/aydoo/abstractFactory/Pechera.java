package ar.edu.untref.aydoo.abstractFactory;

public class Pechera extends Armadura {

    public static Double VALOR_RESISTENCIA = 15.0;

    @Override
    public Double obtenerValorResistencia() {
        return VALOR_RESISTENCIA;
    }
}
