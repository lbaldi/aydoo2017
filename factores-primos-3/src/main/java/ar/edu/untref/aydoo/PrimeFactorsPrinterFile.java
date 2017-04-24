package ar.edu.untref.aydoo;

import java.io.PrintWriter;

public class PrimeFactorsPrinterFile implements IPrimeFactorsPrinter {

    protected String filePath;

    protected String encoding;

    public PrimeFactorsPrinterFile(String parameterOutputFile, String encoding) {
        this.filePath = parameterOutputFile;
        this.encoding = encoding;
    }

    @Override
    public void print(String text) {
        try {
            PrintWriter writer = new PrintWriter(this.filePath, this.encoding);
            writer.println(text);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
