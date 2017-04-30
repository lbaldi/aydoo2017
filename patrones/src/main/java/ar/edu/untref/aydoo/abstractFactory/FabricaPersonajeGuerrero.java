package ar.edu.untref.aydoo.abstractFactory;

public class FabricaPersonajeGuerrero extends FabricaPersonaje {

    @Override
    public Armadura obtenerArmadura() {
        return new Pechera();
    }

    @Override
    public Arma obtenerArma() {
        return new Espada();
    }
}
