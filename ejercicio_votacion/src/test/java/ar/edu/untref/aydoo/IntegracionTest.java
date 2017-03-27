package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegracionTest {

    Eleccion eleccion;
    Partido partidoJ;
    Partido partidoM;
    Candidato candidatoJuan;
    Candidato candidatoJose;
    Candidato candidatoMartin;
    Candidato candidatoMauro;

    @Before
    public void armadoEleccion(){

        eleccion = new Eleccion();
        partidoJ = new Partido("J");
        partidoM = new Partido("M");
        candidatoJuan = new Candidato("Juan", partidoJ);
        candidatoJose = new Candidato("Jose", partidoJ);
        candidatoMartin = new Candidato("Martin", partidoM);
        candidatoMauro = new Candidato("Mauro", partidoM);

        // Juan saca 6 votos en Buenos Aires
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoJuan));

        // Jose saca 4 voto en Jujuy
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoJose));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoJose));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoJose));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoJose));

        // Martin saca 7 votos en Jujuy
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));
        eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, candidatoMartin));

        // Mauro saca 1 voto en Buenos Aires
        eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, candidatoMauro));

        // Juan saca 5 votos en Salta
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoJuan));
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoJuan));

        // Mauro saca 2 votos en Salta
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoMauro));
        eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, candidatoMauro));

    }

    @Test
    public void emisionDeVoto(){

        Assert.assertEquals(25, eleccion.obtenerVotos().size());

    }

    @Test
    public void calculoCandidatoConMasVotosCorrecto(){

        // El candidato más votado a nivel nacional es Juan
        Assert.assertEquals(candidatoJuan, eleccion.obtenerCandidatoMasVotadoNacionalmente());

    }

    @Test
    public void calculoCandidatoConMasVotosIncorrecto(){

        // El candidato más votado a nivel nacional es Juan
        Assert.assertNotEquals(candidatoMartin, eleccion.obtenerCandidatoMasVotadoNacionalmente());

    }

    @Test
    public void calculoPartidoConMasVotosEnProvinciaDadaCorrecto(){

        // El partido con más votos en Jujuy es M
        // El partido con más votos en Buenos Aires es J
        // El partido con más vostos en Salta es J
        Assert.assertEquals(partidoM, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.JUJUY));
        Assert.assertEquals(partidoJ, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.BUENOS_AIRES));
        Assert.assertEquals(partidoJ, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.SALTA));

    }

    @Test
    public void calculoPartidoConMasVotosEnProvinciaDadaIncorrecto(){

        // El partido con más votos en Jujuy es M
        // El partido con más votos en Buenos Aires es J
        // El partido con más vostos en Salta es J
        Assert.assertNotEquals(partidoJ, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.JUJUY));
        Assert.assertNotEquals(partidoM, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.BUENOS_AIRES));
        Assert.assertNotEquals(partidoM, eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.SALTA));

    }

}
