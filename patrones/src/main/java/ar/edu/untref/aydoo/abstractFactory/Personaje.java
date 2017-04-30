package ar.edu.untref.aydoo.abstractFactory;

public class Personaje {

    private Armadura armadura;

    private Arma arma;

    public Personaje(FabricaPersonaje fabricaPersonaje) {
        this.asignarArmadura(fabricaPersonaje.obtenerArmadura());
        this.asignarArma(fabricaPersonaje.obtenerArma());
    }

    public Armadura obtenerArmadura() {
        return armadura;
    }

    private void asignarArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma obtenerArma() {
        return this.arma = arma;
    }

    private void asignarArma(Arma arma) {
        this.arma = arma;
    }

    public Double obtenerValorAtaque() {
        return this.obtenerArma().obtenerValorAtaque();
    }

    public Double obtenerValorResistencia() {
        return this.obtenerArmadura().obtenerValorResistencia();
    }
}
