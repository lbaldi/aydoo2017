package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CandidatoTest {

    @Test
    public void crearCandidatoCompararNombreCorrecto() {
        Partido partido  = new Partido("Cambiemos");
        String nombreCandidato = "Mauricio Macri";
        Candidato candidato = new Candidato(nombreCandidato, partido);

        Assert.assertEquals(nombreCandidato, candidato.obtenerNombre());
    }

    @Test
    public void crearCandidatoCompararNombreIncorrecto() {
        Partido partido  = new Partido("Cambiemos");
        String nombreCandidatoIncorrecto = "Nombre Incorrecto";
        String nombreCandidato = "Mauricio Macri";
        Candidato candidato = new Candidato(nombreCandidato, partido);

        Assert.assertNotEquals(nombreCandidatoIncorrecto, candidato.obtenerNombre());
    }

    @Test
    public void crearCandidatoCompararPartidoCorrecto(){
        Partido partido  = new Partido("Cambiemos");
        String nombreCandidato = "Mauricio Macri";
        Candidato candidato = new Candidato(nombreCandidato, partido);

        Assert.assertEquals(partido, candidato.obtenerPartido());
    }

    @Test
    public void crearCandidatoCompararPartidoIncorrecto(){
        Partido partidoIncorrecto  = new Partido("Partido Incorrecto");
        Partido partido  = new Partido("Cambiemos");
        String nombreCandidato = "Mauricio Macri";
        Candidato candidato = new Candidato(nombreCandidato, partido);

        Assert.assertNotEquals(partidoIncorrecto, candidato.obtenerPartido());
    }

}
