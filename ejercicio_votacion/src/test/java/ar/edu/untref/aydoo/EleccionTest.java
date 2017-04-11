package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class EleccionTest {

    @Test
    public void ComprobarVotosVacios(){
        Eleccion eleccion = new Eleccion();

        Assert.assertEquals(0, eleccion.obtenerVotos().size());
    }

    @Test
    public void ComprobarRegistroVoto(){
        Eleccion eleccion = new Eleccion();
        String nombreCandidato = "Mauricio Macri";
        String nombrePartido = "Cambiemos";
        Partido partido = new Partido(nombrePartido);
        Candidato candidato = new Candidato(nombreCandidato, partido);
        Voto primerVoto = new Voto(PROVINCIA.BUENOS_AIRES, candidato);
        eleccion.registrarVoto(primerVoto);
        Voto segundoVoto = new Voto(PROVINCIA.JUJUY, candidato);
        eleccion.registrarVoto(segundoVoto);

        Assert.assertEquals(2, eleccion.obtenerVotos().size());
    }

}
