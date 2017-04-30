package ar.edu.untref.aydoo.factoryMethod;

public class CreadorDePeras implements CreadorDeFrutas {

    @Override
    public Fruta crearFruta() {
        return new Pera();
    }
}
