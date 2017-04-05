package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrador on 04/04/2017.
 */
public class Libreria {

    private HashMap<Cliente, ArrayList<Venta>> ventasPorCliente;
    private HashMap<Cliente, ArrayList<Suscripcion>> suscripcionesPorCliente;


    public Libreria() {

        ventasPorCliente = new HashMap();

    }

    private HashMap<Cliente,  ArrayList<Venta>> obtenerVentas(){

        return this.ventasPorCliente;

    }

    private HashMap<Cliente, ArrayList<Suscripcion>> obtenerSuscripciones(){

        return this.suscripcionesPorCliente;

    }

    private ArrayList<Venta> obtenerVentasPorCliente(Cliente cliente){

        return this.obtenerVentas().get(cliente);

    }

    public Double calcularMontoACobrar(int mes, Cliente cliente) {

        Double montoACobrar = 0.0;

        for(Venta venta: this.obtenerVentasPorCliente(cliente)){

            if(venta.obtenerMes() == mes){

                montoACobrar += venta.obtenerProducto().obtenerValor();

            }

        }

        return montoACobrar;
    }

    public void registrarVenta(int mes, Cliente cliente, Producto producto) {

        if(!this.ventasPorCliente.containsKey(cliente)){

            this.ventasPorCliente.put(cliente, new ArrayList<Venta>());

        }

        this.ventasPorCliente.get(cliente).add(new Venta(mes, producto));

    }

    public void adherirSuscripcion(Cliente cliente, Producto producto, Double descuento) {

        if(!this.suscripcionesPorCliente.containsKey(cliente)){

            this.suscripcionesPorCliente.put(cliente, new ArrayList<Suscripcion>());

        }

        this.suscripcionesPorCliente.get(cliente).add(new Suscripcion(producto, descuento));

    }

}