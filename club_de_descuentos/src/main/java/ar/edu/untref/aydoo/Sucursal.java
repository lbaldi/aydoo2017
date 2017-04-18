package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

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

    public String obtenerNombre(){
        return this.nombre;
    }

    public String obtenerDireccion(){
        return this.direccion;
    }

    public Establecimiento obtenerEstablecimiento() {
        return this.establecimiento;
    }

    public List<Beneficio> obtenerBeneficiosOtorgados() {
        return this.beneficiosOtorgados;
    }

    // @TODO Test
    public void registrarBeneficio(Cliente cliente, double valorCompra) {
        Double descuento = this.obtenerDescuentoSegunTarjeta(cliente.obtenerTarjetaBeneficio());
        Double valorBeneficio = this.computarValorBeneficio(descuento, valorCompra);
        Beneficio beneficioOtorgado = new Beneficio(cliente, valorBeneficio);
        this.obtenerBeneficiosOtorgados().add(beneficioOtorgado);
        cliente.registrarBeneficio(beneficioOtorgado);
    }

    // @TODO Test
    protected Double computarValorBeneficio(Double descuento, double valorCompra) {
        return valorCompra * (descuento / 100);
    }

    // @TODO Test
    protected Double obtenerDescuentoSegunTarjeta(TARJETA_BENEFICIO tarjetaBeneficio) {
        return this.obtenerEstablecimiento().obtenerTipoBeneficios().get(tarjetaBeneficio);
    }

    // @TODO Test
    public Integer obtenerCantidadDeBeneficiosOtorgados() {
        return this.obtenerBeneficiosOtorgados().size();
    }

}
