package ar.edu.untref.aydoo;

import org.junit.Test;

public class TestProgram {

    @Test
    public void createProgram() {
        new Program();
    }

    @Test
    public void executeProgramWithInvalidParameters() {
        String[] args = {"a"};
        Program.main(args);
    }

    @Test
    public void executeProgramWithoutParameters() {
        String[] args = {};
        Program.main(args);
    }

    @Test
    public void executeProgramWith360FormatPrettySortedDescAndOutputFile() {
        String[] args = {"360", "--format=pretty", "--sort=desc", "--output-file=target/prueba.txt"};
        Program.main(args);
    }

    @Test
    public void executeProgramWith360FormatPrettySortedAscAndOutputFile() {
        String[] args = {"360", "--format=pretty", "--sort=asc", "--output-file=target/prueba.txt"};
        Program.main(args);
    }

    @Test
    public void executeProgramWith360FormatPrettySortedDesc() {
        String[] args = {"360", "--format=pretty", "--sort=desc"};
        Program.main(args);
    }

    @Test
    public void getFormatterWithParameterPRETTY() {
        Program.getFormatter("PRETTY");
    }

    @Test
    public void getFormatterWithParameterQUIET() {
        Program.getFormatter("QUIET");
    }

    @Test
    public void getFormatterWithParameterNull() {
        Program.getFormatter(null);
    }

    @Test(expected = ExceptionInvalidParameterFormat.class)
    public void getFormatterWithParameterInvalid() {
        Program.getFormatter("pretty");
    }

    @Test
    public void getSorterWithParameterASC() {
        Program.getSorter("ASC");
    }

    @Test
    public void getSorterWithParameterDESC() {
        Program.getSorter("DESC");
    }

    @Test
    public void getSorterWithParameterNull() {
        Program.getSorter(null);
    }

    @Test(expected = ExceptionInvalidParameterSorter.class)
    public void getSorterWithParameterInvalid() {
        Program.getSorter("invalid");
    }

    @Test
    public void getPrinterWithParameterOutputFile() {
        Program.getPrinter("prueba.txt");
    }

    @Test
    public void getPrinterWithParameterNull() {
        Program.getPrinter(null);
    }

}
