package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegracionTest {

    protected Eleccion eleccion;

    protected Partido partidoJ;

    protected Partido partidoM;

    protected Candidato candidatoJuan;

    protected Candidato candidatoJose;

    protected Candidato candidatoMartin;

    protected Candidato candidatoMauro;

    @Before
    public void armadoEleccion(){
        this.eleccion = new Eleccion();
        this.partidoJ = new Partido("J");
        this.partidoM = new Partido("M");
        this.candidatoJuan = new Candidato("Juan", this.partidoJ);
        this.candidatoJose = new Candidato("Jose", this.partidoJ);
        this.candidatoMartin = new Candidato("Martin", this.partidoM);
        this.candidatoMauro = new Candidato("Mauro", this.partidoM);
        // Juan saca 6 votos en Buenos Aires
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoJuan));
        // Jose saca 4 voto en Jujuy
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoJose));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoJose));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoJose));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoJose));
        // Martin saca 7 votos en Jujuy
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.JUJUY, this.candidatoMartin));
        // Mauro saca 1 voto en Buenos Aires
        this.eleccion.registrarVoto(new Voto(PROVINCIA.BUENOS_AIRES, this.candidatoMauro));
        // Juan saca 5 votos en Salta
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoJuan));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoJuan));
        // Mauro saca 2 votos en Salta
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoMauro));
        this.eleccion.registrarVoto(new Voto(PROVINCIA.SALTA, this.candidatoMauro));
    }

    @Test
    public void emisionDeVoto(){
        Assert.assertEquals(25, this.eleccion.obtenerVotos().size());
    }

    @Test
    public void calculoCandidatoConMasVotosCorrecto(){
        // El candidato más votado a nivel nacional es Juan
        Assert.assertEquals(this.candidatoJuan, this.eleccion.obtenerCandidatoMasVotadoNacionalmente());
    }

    @Test
    public void calculoCandidatoConMasVotosIncorrecto(){
        // El candidato más votado a nivel nacional es Juan
        Assert.assertNotEquals(this.candidatoMartin, this.eleccion.obtenerCandidatoMasVotadoNacionalmente());
    }

    @Test
    public void calculoPartidoConMasVotosEnProvinciaDadaCorrecto(){
        // El partido con más votos en Jujuy es M
        // El partido con más votos en Buenos Aires es J
        // El partido con más vostos en Salta es J
        Assert.assertEquals(this.partidoM, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.JUJUY));
        Assert.assertEquals(this.partidoJ, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.BUENOS_AIRES));
        Assert.assertEquals(this.partidoJ, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.SALTA));
    }

    @Test
    public void calculoPartidoConMasVotosEnProvinciaDadaIncorrecto(){
        // El partido con más votos en Jujuy es M
        // El partido con más votos en Buenos Aires es J
        // El partido con más vostos en Salta es J
        Assert.assertNotEquals(this.partidoJ, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.JUJUY));
        Assert.assertNotEquals(this.partidoM, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.BUENOS_AIRES));
        Assert.assertNotEquals(this.partidoM, this.eleccion.obtenerPartidoMasVotadoSegunProvincia(PROVINCIA.SALTA));
    }

}