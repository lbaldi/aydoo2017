package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void ProgramPrint1(){
        String expectedResponse = "Factores primos 1:";
        Assert.assertEquals(expectedResponse, Program.print(1, null));
    }

    @Test
    public void ProgramPrint360(){
        String expectedResponse = "Factores primos 360: 2 2 2 3 3 5";
        Assert.assertEquals(expectedResponse, Program.print(360, null));
    }

    @Test
    public void ProgramPrint360Pretty(){
        String expectedResponse = "Factores primos 360: 2 2 2 3 3 5";
        Assert.assertEquals(expectedResponse, Program.print(360, "pretty"));
    }

    @Test
    public void ProgramPrint360Quiet(){
        String expectedResponse =   "5" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "2" + System.lineSeparator();
        Assert.assertEquals(expectedResponse, Program.print(360, "quiet"));
    }

    @Test
    public void ProgramPrint360InvalidFormat(){
        String expectedResponse =   "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
        Assert.assertEquals(expectedResponse, Program.print(360, "invalidFormat"));
    }

    @Test
    public void ProgramPrint90(){
        String expectedResponse = "Factores primos 90: 2 3 3 5";
        Assert.assertEquals(expectedResponse, Program.print(90, null));
    }

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
    public void executeProgramWithoutParameters(){

        String[] args = {};
        Program.main(args);

    }

    @Test
    public void executeProgram0(){

        String[] args = {"0"};
        Program.main(args);

    }

    @Test
    public void executeProgramWithTwoArgs(){

        String[] args = {"31", "A"};
        Program.main(args);

    }

    @Test
    public void executeProgramWithMultiplesArgs(){

        String[] args = {"360", "--format=quiet", "A", "b"};
        Program.main(args);

    }

    @Test
    public void executeProgramWithValidFormatArg(){

        String[] args = {"7", "--format=pretty"};
        Program.main(args);

    }

    @Test(expected=NumberFormatException.class)
    public void executeProgramWithInvalidArgumentFormat() throws NumberFormatException {

         String[] args = {"as2"};
         Program.main(args);

    }

}
