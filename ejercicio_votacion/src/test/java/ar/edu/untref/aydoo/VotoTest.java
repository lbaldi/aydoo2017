package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class VotoTest {

    @Test
    public void crearVotoCompararProvinciaCorrecta(){

        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertEquals(provincia, voto.obtenerProvincia());

    }

    @Test
    public void crearVotoCompararProvinciaIncorrecta(){

        PROVINCIA provinciaIncorrecto = PROVINCIA.JUJUY;
        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertNotEquals(provinciaIncorrecto, voto.obtenerProvincia());

    }

    @Test
    public void crearVotoCompararCandidatoCorrecto(){

        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertEquals(candidato, voto.obtenerCandidato());

    }

    @Test
    public void crearVotoCompararCandidatoIncorrecto(){

        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Candidato candidatoIncorrecto = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertNotEquals(candidatoIncorrecto, voto.obtenerCandidato());

    }

    @Test
    public void crearVotoCompararPartidoCorrecto(){

        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertEquals(partido, voto.obtenerPartido());

    }

    @Test
    public void crearVotoCompararPartidoIncorrecto(){

        PROVINCIA provincia = PROVINCIA.BUENOS_AIRES;
        Partido partido = new Partido("Cambiemos");
        Partido partidoIncorrecto = new Partido("Partido Incorrecto");
        String nombre = "Mauricio Macri";
        Candidato candidato = new Candidato(nombre, partido);
        Voto voto = new Voto(provincia, candidato);
        Assert.assertNotEquals(partidoIncorrecto, voto.obtenerPartido());

    }

}