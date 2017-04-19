package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClubDeDescuento {

    protected Set<Establecimiento> establecimientos;

    protected Set<Cliente> clientes;

    public ClubDeDescuento() {
        this.establecimientos = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    protected Set<Establecimiento> obtenerEstablecimientos() {
        return this.establecimientos;
    }

    public void adherirEstablecimiento(Establecimiento establecimiento) {
        this.obtenerEstablecimientos().add(establecimiento);
    }

    public Cliente adherirCliente(String nombreCliente, String mailCliente, TARJETA_BENEFICIO tarjetaBeneficio) {
        Cliente nuevoCliente = new Cliente(nombreCliente, mailCliente, tarjetaBeneficio);
        this.obtenerClientes().add(nuevoCliente);
        return nuevoCliente;
    }

    protected Set<Cliente> obtenerClientes() {
        return this.clientes;
    }

    public Establecimiento obtenerEstablecimientoConMasBeneficiosOtorgados() {
        Establecimiento establecimientoConMasCantidadDeBeneficios = null;
        Integer cantidadMayorDeBeneficios = 0;
        for (Establecimiento establecimiento : this.obtenerEstablecimientos()) {
            Integer cantidadDeBeneficios = establecimiento.obtenerCantidadDeBeneficiosOtorgados();
            if (cantidadDeBeneficios > cantidadMayorDeBeneficios) {
                cantidadMayorDeBeneficios = cantidadDeBeneficios;
                establecimientoConMasCantidadDeBeneficios = establecimiento;
            }
        }
        return establecimientoConMasCantidadDeBeneficios;
    }

    public Sucursal obtenerSucursalConMasBeneficiosOtorgados(Mes mes) {
        Sucursal sucursalConMasBeneficiosOtorgados = null;
        Integer cantidadMayorDeBeneficios = 0;
        for (Establecimiento establecimiento : this.obtenerEstablecimientos()) {
            Sucursal sucursalConMasBeneficiosOtorgadosEnEstablecimiento = establecimiento.obtenerSucursalConMasBeneficiosOtorgados(mes);
            Integer cantidadDeBeneficios = sucursalConMasBeneficiosOtorgadosEnEstablecimiento.obtenerCantidadDeBeneficiosOtorgadosPorMes(mes);
            if (cantidadDeBeneficios > cantidadMayorDeBeneficios) {
                sucursalConMasBeneficiosOtorgados = sucursalConMasBeneficiosOtorgadosEnEstablecimiento;
                cantidadMayorDeBeneficios = cantidadDeBeneficios;
            }
        }
        return sucursalConMasBeneficiosOtorgados;
    }

    /**
     * @return Diccionario que contiene para cada cliente el monto ahorrado.
     * Se obvian aquellos clientes que no tuvieron ahorros.
     */
    public Map<Cliente, Double> obtenerTotalDeAhorroPorCliente(Mes mes) {

        Map<Cliente, Double> clienteYMontoObtenido = new HashMap<>();
        for (Cliente cliente : this.obtenerClientes()) {
            Double montoAhorrado = cliente.obtenerMontoAhorrado(mes);
            if (montoAhorrado > 0.0) {
                clienteYMontoObtenido.put(cliente, montoAhorrado);
            }
        }
        return clienteYMontoObtenido;
    }
}
