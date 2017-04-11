package ar.edu.untref.aydoo;

public class Voto {

    private PROVINCIA provincia;

    private Candidato candidato;

    public Voto(PROVINCIA provincia, Candidato candidato) {
        asignarProvincia(provincia);
        asignarCandidato(candidato);
    }

    private void asignarProvincia(PROVINCIA provincia){
        this.provincia = provincia;
    }

    public PROVINCIA obtenerProvincia(){
        return this.provincia;
    }

    private void asignarCandidato(Candidato candidato){
        this.candidato = candidato;
    }

    public Candidato obtenerCandidato(){
        return this.candidato;
    }

    public Partido obtenerPartido(){
        return this.obtenerCandidato().obtenerPartido();
    }

}
