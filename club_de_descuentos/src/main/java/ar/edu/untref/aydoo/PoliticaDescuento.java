package ar.edu.untref.aydoo;

public class PoliticaDescuento {

    public static Double PORCENTAJE_MINIMO_DE_DESCUENTO = 5.0;

    public static Double VALOR_MINIMO_DOS_POR_UNO = 100.0;

    public static void comprobarPorcentajeDescuento(Double porcentaje) {
        if (porcentaje < PORCENTAJE_MINIMO_DE_DESCUENTO) throw new ExcepcionPorcentajeDescuentoEstablecimiento();
    }

    public static void comprobarValorMinimoDosPorUno(Double valor) {
        if (valor < VALOR_MINIMO_DOS_POR_UNO) throw new ExcepcionValorMinimoDosPorUno();
    }

}
