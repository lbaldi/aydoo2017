package ar.edu.untref.aydoo;

import org.junit.Test;

public class ProgramTest {

    @Test
    public void executeProgram360(){

        String[] args = {"360"};
        Program.main(args);

    }

    @Test
    public void executeProgram90(){

        String[] args = {"90"};
        Program.main(args);

    }

    @Test
    public void executeProgram0(){

        String[] args = {"0"};
        Program.main(args);

    }

}
