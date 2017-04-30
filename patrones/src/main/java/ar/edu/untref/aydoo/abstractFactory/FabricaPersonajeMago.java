package ar.edu.untref.aydoo.abstractFactory;

public class FabricaPersonajeMago extends FabricaPersonaje {

    @Override
    public Armadura obtenerArmadura() {
        return new Tunica();
    }

    @Override
    public Arma obtenerArma() {
        return new Baculo();
    }
}
