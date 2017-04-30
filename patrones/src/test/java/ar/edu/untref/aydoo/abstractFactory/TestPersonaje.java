package ar.edu.untref.aydoo.abstractFactory;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonaje {

    @Test
    public void crearPersonajeMagoObtenerValorAtaqueYResistencia() {
        Personaje mago = new Personaje(new FabricaPersonajeMago());

        Assert.assertEquals(Baculo.VALOR_ATAQUE, mago.obtenerValorAtaque());
        Assert.assertEquals(Tunica.VALOR_RESISTENCIA, mago.obtenerValorResistencia());
    }

    @Test
    public void crearPersonajeGuerreroObtenerValorAtaqueYResistencia() {
        Personaje guerrero = new Personaje(new FabricaPersonajeGuerrero());

        Assert.assertEquals(Espada.VALOR_ATAQUE, guerrero.obtenerValorAtaque());
        Assert.assertEquals(Pechera.VALOR_RESISTENCIA, guerrero.obtenerValorResistencia());
    }

}
