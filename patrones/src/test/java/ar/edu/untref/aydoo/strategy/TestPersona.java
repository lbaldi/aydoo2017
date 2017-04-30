package ar.edu.untref.aydoo.strategy;

import org.junit.Test;

public class TestPersona {

    @Test
    public void crearPersonaYDialogarNormalmente() {
        Persona persona = new Persona();
        persona.DialogarNormalmente();
        persona.dialogar();
    }

    @Test
    public void crearPersonaYDialogarPacificamente() {
        Persona persona = new Persona();
        persona.DialogarPacificamente();
        persona.dialogar();
    }

    @Test
    public void crearPersonaDialogarPacificamenteYLuegoNormalmente() {
        Persona persona = new Persona();
        persona.DialogarPacificamente();
        persona.dialogar();
        persona.DialogarNormalmente();
        persona.dialogar();
    }

}
