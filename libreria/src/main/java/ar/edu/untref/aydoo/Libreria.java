package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Libreria {

    protected List<Venta> ventas;

    protected List<Suscripcion> suscripciones;

    public Libreria() {
        this.ventas = new ArrayList<>();
        this.suscripciones = new ArrayList<>();
    }

    protected List<Venta> obtenerVentasPorClienteYPorMes(Integer mes, Cliente cliente) {
        List<Venta> ventas = this.obtenerVentas().stream().filter(
                venta -> (venta.obtenerCliente() == cliente && venta.obtenerMes() == mes)).collect(Collectors.toList()
        );
        return ventas;
    }

    protected List<Suscripcion> obtenerSuscripcionesPorClienteYPorMes(Integer mes, Cliente cliente) {
        List<Suscripcion> suscripciones = this.obtenerSuscripciones().stream().filter(
                suscripcion -> (suscripcion.perteneAMes(mes) && suscripcion.obtenerCliente() == cliente)).collect(Collectors.toList()
        );
        return suscripciones;
    }

    protected List<Venta> obtenerVentas() {
        return this.ventas;
    }

    public Double calcularMontoACobrar(Integer mes, Cliente cliente) {
        Double montoACobrar = 0.0;
        for (Venta venta: this.obtenerVentasPorClienteYPorMes(mes, cliente)) {
            montoACobrar += venta.obtenerValor();
        }
        for (Suscripcion suscripcion: this.obtenerSuscripcionesPorClienteYPorMes(mes, cliente)) {
            montoACobrar += suscripcion.obtenerValorMensual();
        }
        return montoACobrar;
    }

    public void registrarSuscripcion(Integer mesInicio, Integer cantidadMeses, ProductoSuscripcion producto, Double descuento, Cliente cliente) {
        this.obtenerSuscripciones().add(new Suscripcion(mesInicio, cantidadMeses, producto, descuento, cliente));
    }

    public void registrarVenta(int mes, Cliente cliente, Producto producto) {
        this.obtenerVentas().add(new Venta(mes, producto,cliente));
    }

    protected List<Suscripcion> obtenerSuscripciones() {
        return this.suscripciones;
    }

}