package ar.edu.untref.aydoo;

public class ArticuloLibreria extends Producto {

    /**
     *
     * @param valor Valor de producto sin IVA
     * @param iva Porcentual de IVA que aplicara al valor de producto
     */
    public ArticuloLibreria(Double valor, Double iva){

        super(valor * obtenerIvaCoeficiente(iva));

    }

    private static Double obtenerIvaCoeficiente(Double iva){

        return 1 + (iva / 100);

    }

}