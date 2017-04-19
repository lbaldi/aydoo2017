package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sucursal {

    protected String nombre;

    protected String direccion;

    protected Establecimiento establecimiento;

    protected List<Beneficio> beneficiosOtorgados;

    public Sucursal(String nombre, String direccion, Establecimiento establecimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.establecimiento = establecimiento;
        this.establecimiento.adherirSucursal(this);
        this.beneficiosOtorgados = new ArrayList<>();
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerDireccion() {
        return this.direccion;
    }

    public Establecimiento obtenerEstablecimiento() {
        return this.establecimiento;
    }

    public List<Beneficio> obtenerBeneficiosOtorgados() {
        return this.beneficiosOtorgados;
    }

    public void registrarBeneficioCompraProducto(Cliente cliente, Producto producto, Mes mes) {
        Double descuento = this.obtenerDescuentoSegunTarjeta(cliente.obtenerTarjetaBeneficio());
        Double valorBeneficio = this.computarValorBeneficio(descuento, producto.obtenerValor());
        Beneficio beneficioOtorgado = new Beneficio(this.obtenerEstablecimiento(), cliente, producto, producto.obtenerValor(), valorBeneficio, mes);
        this.obtenerBeneficiosOtorgados().add(beneficioOtorgado);
        cliente.registrarBeneficio(beneficioOtorgado);
    }

    protected Double computarValorBeneficio(Double descuento, double valorCompra) {
        return valorCompra * (descuento / 100);
    }

    protected Double obtenerDescuentoSegunTarjeta(TARJETA_BENEFICIO tarjetaBeneficio) {
        return this.obtenerEstablecimiento().obtenerTipoBeneficios().get(tarjetaBeneficio);
    }

    public Integer obtenerCantidadDeBeneficiosOtorgados() {
        return this.obtenerBeneficiosOtorgados().size();
    }

    public Integer obtenerCantidadDeBeneficiosOtorgadosPorMes(Mes mes) {
        return this.obtenerBeneficiosOtorgados().stream().filter(
                beneficio -> (beneficio.obtenerMes() == mes)
        ).collect(Collectors.toList()).size();
    }

}
