package ar.edu.untref.aydoo;

import java.util.Calendar;

/**
 * Created by Administrador on 04/04/2017.
 */
public class Venta {

    private int mes;
    private Producto producto;
    private Double valor;

    public Venta(int mes, Producto producto){

        this.mes = mes;
        this.producto = producto;

    }

    public int obtenerMes(){

        return this.mes;

    }

    public Producto obtenerProducto(){

        return this.producto;

    }

}
