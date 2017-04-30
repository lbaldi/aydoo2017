package ar.edu.untref.aydoo.abstractFactory;

public class Tunica extends Armadura {

    public static Double VALOR_RESISTENCIA = 10.0;

    @Override
    public Double obtenerValorResistencia() {
        return VALOR_RESISTENCIA;
    }
}
