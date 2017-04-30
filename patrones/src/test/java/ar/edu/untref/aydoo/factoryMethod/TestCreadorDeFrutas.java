package ar.edu.untref.aydoo.factoryMethod;

import org.junit.Test;

public class TestCreadorDeFrutas {

    @Test
    public void crearManzana() {
        CreadorDeFrutas creadorDeManzanas = new CreadorDeManzanas();
        Fruta manzana = creadorDeManzanas.crearFruta();
    }

    @Test
    public void crearPera() {
        CreadorDeFrutas creadorDePeras = new CreadorDePeras();
        Fruta peras = creadorDePeras.crearFruta();
    }
}

