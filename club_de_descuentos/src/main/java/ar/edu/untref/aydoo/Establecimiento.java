package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Establecimiento {

    protected String nombre;

    protected String mail;

    protected Map<TARJETA_BENEFICIO, Double> tipoBeneficios;

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

    public Map<TARJETA_BENEFICIO, Double> obtenerTipoBeneficios() {
        return this.tipoBeneficios;
    }

    public void adherirTipoBeneficio(double descuento, TARJETA_BENEFICIO tarjetaBeneficio) {
        if (!PoliticaDescuento.comprobarPorcentajeDescuento(descuento)) throw new ExcepcionPorcentajeDescuentoEstablecimiento();
        this.obtenerTipoBeneficios().put(tarjetaBeneficio, descuento);
    }

    public Integer obtenerCantidadDeBeneficiosOtorgados() {
        Integer cantidadBeneficiosOtorgados = 0;
        for (Sucursal sucursales : this.obtenerSucursales()) {
            cantidadBeneficiosOtorgados += sucursales.obtenerCantidadDeBeneficiosOtorgados();
        }
        return cantidadBeneficiosOtorgados;
    }

    public Set<Sucursal> obtenerSucursales() {
        return this.sucursales;
    }

    void adherirSucursal(Sucursal sucursal) {
        this.obtenerSucursales().add(sucursal);
    }

    public Sucursal obtenerSucursalConMasBeneficiosOtorgados() {
        Sucursal sucursalConMasBeneficiosOtorgados = null;
        Integer cantidadMayorBeneficiosOtorgados = 0;
        for (Sucursal sucursal : this.obtenerSucursales()) {
            Integer cantidadBeneficiosOtorgados = sucursal.obtenerCantidadDeBeneficiosOtorgados();
            if (cantidadBeneficiosOtorgados > cantidadMayorBeneficiosOtorgados) {
                sucursalConMasBeneficiosOtorgados = sucursal;
                cantidadMayorBeneficiosOtorgados = cantidadBeneficiosOtorgados;
            }
        }
        return sucursalConMasBeneficiosOtorgados;
    }
}
