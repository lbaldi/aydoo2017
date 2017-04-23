package ar.edu.untref.aydoo;

public class PoliticaDescuento {

    public static void comprobarPorcentajeDescuento(Double porcentaje) {
        if (porcentaje < 5.0) throw new ExcepcionPorcentajeDescuentoEstablecimiento();
    }

    public static void comprobarValorMinimoDosPorUno(Double valor){
        if (valor < 100.0) throw new ExcepcionValorMinimoDosPorUno();
    }

}
