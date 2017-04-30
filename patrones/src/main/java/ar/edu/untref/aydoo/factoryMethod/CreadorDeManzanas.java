package ar.edu.untref.aydoo.factoryMethod;

public class CreadorDeManzanas implements CreadorDeFrutas {

    @Override
    public Fruta crearFruta() {
        return new Manzana();
    }
}
