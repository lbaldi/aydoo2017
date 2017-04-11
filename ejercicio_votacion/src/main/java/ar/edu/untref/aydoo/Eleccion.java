package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;

public class Eleccion {

    private ArrayList<Voto> votos;

    public Eleccion(){
        this.votos = new ArrayList<>();
    }

    public ArrayList<Voto> obtenerVotos() {
        return this.votos;
    }

    public void registrarVoto(Voto voto){
        this.obtenerVotos().add(voto);
    }

    public Candidato obtenerCandidatoMasVotadoNacionalmente() {
        HashMap<Candidato, Integer> contadorVotos = new HashMap<>();
        // Se recorren todos los votos para contabilizar
        // los pertenecientes a cada candidato
        for (Voto voto : this.obtenerVotos()) {
            Candidato candidato = voto.obtenerCandidato();
            // Se consulta si el candidato ya  tiene votos
            if (contadorVotos.containsKey(candidato)) {
                // Se agrega un voto al candidato
                contadorVotos.put(candidato, contadorVotos.get(candidato) + 1);
            }
            else {
                // Se agrega al candidato al contador dado que es su primer voto
                // y se inicia con un voto el contador
                contadorVotos.put(candidato, 1);
            }

        }
        // Se busca el candidato con mayor cantidad de votos
        // en caso de que haya mas de uno con la misma cantidad
        // el resultante sera el primero
        HashMap.Entry<Candidato, Integer> candidatoMasVotado = null;
        for (HashMap.Entry<Candidato, Integer> registro : contadorVotos.entrySet()) {
            if (candidatoMasVotado == null || registro.getValue().compareTo(candidatoMasVotado.getValue()) > 0) {
                candidatoMasVotado = registro;
            }
        }
        return candidatoMasVotado != null ? candidatoMasVotado.getKey() : null;
    }

    public Partido obtenerPartidoMasVotadoSegunProvincia(PROVINCIA provincia) {
        HashMap<Partido, Integer> contadorVotos = new HashMap<>();
        // Se recorren todos los votos para contabilizar
        // los pertenecientes a cada partido en la provincia dada
        for (Voto voto : this.obtenerVotos()) {
            // Se saltea voto que no coincida con la pronvincia dada
            if(voto.obtenerProvincia() != provincia){
                continue;
            }
            Partido partido = voto.obtenerPartido();
            // Se consulta si el partido ya  tiene votos
            if(contadorVotos.containsKey(partido)) {
                // Se agrega un voto al partido
                contadorVotos.put(partido, contadorVotos.get(partido) + 1);
            }
            else {
                // Se agrega partido al contador dado que es su primer voto
                // y se inicia con un voto el contador
                contadorVotos.put(partido, 1);
            }
        }
        // Se busca el partido con mayor cantidad de votos
        // en caso de que haya mas de uno con la misma cantidad
        // el resultante sera el primero
        HashMap.Entry<Partido, Integer> partidoMasVotado = null;
        for (HashMap.Entry<Partido, Integer> registro : contadorVotos.entrySet()) {
            if (partidoMasVotado == null || registro.getValue().compareTo(partidoMasVotado.getValue()) > 0) {
                partidoMasVotado = registro;
            }
        }
        return partidoMasVotado != null ? partidoMasVotado.getKey() : null;
    }

}
