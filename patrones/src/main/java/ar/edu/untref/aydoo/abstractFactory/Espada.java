package ar.edu.untref.aydoo.abstractFactory;

public class Espada extends Arma {

    public static Double VALOR_ATAQUE = 20.0;

    @Override
    public Double obtenerValorAtaque() {
        return VALOR_ATAQUE;
    }
}
