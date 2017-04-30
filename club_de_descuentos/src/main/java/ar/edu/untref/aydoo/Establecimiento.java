package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Establecimiento {

    protected String nombre;

    protected String mail;

    protected Map<TarjetaBeneficio, Double> tipoBeneficios;

    protected Set<Sucursal> sucursales;

    public Establecimiento(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
        this.tipoBeneficios = new HashMap<>();
        this.sucursales = new HashSet<>();
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerMail() {
        return this.mail;
    }

    public Map<TarjetaBeneficio, Double> obtenerTipoBeneficios() {
        return this.tipoBeneficios;
    }

    public void adherirTipoBeneficio(double descuento, TarjetaBeneficio tarjetaBeneficio) {
        PoliticaDescuento.comprobarPorcentajeDescuento(descuento);
        this.obtenerTipoBeneficios().put(tarjetaBeneficio, descuento);
    }

    public Integer obtenerCantidadDeBeneficiosOtorgados(Mes mes) {
        Integer cantidadBeneficiosOtorgados = 0;
        for (Sucursal sucursales : this.obtenerSucursales()) {
            cantidadBeneficiosOtorgados += sucursales.obtenerCantidadDeBeneficiosOtorgadosPorMes(mes);
        }
        return cantidadBeneficiosOtorgados;
    }

    public Set<Sucursal> obtenerSucursales() {
        return this.sucursales;
    }

    void adherirSucursal(Sucursal sucursal) {
        this.obtenerSucursales().add(sucursal);
    }

    public Sucursal obtenerSucursalConMasBeneficiosOtorgados(Mes mes) {
        Sucursal sucursalConMasBeneficiosOtorgados = null;
        Integer cantidadMayorBeneficiosOtorgados = 0;
        for (Sucursal sucursal : this.obtenerSucursales()) {
            Integer cantidadBeneficiosOtorgados = sucursal.obtenerCantidadDeBeneficiosOtorgadosPorMes(mes);
            if (cantidadBeneficiosOtorgados > cantidadMayorBeneficiosOtorgados) {
                sucursalConMasBeneficiosOtorgados = sucursal;
                cantidadMayorBeneficiosOtorgados = cantidadBeneficiosOtorgados;
            }
        }
        return sucursalConMasBeneficiosOtorgados;
    }
}
