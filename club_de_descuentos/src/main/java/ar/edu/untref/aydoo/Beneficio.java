package ar.edu.untref.aydoo;

public class Beneficio {

    protected Establecimiento establecimiento;

    protected Cliente cliente;

    protected Producto producto;

    protected Double valorHabitual;

    protected Double valor;


    public Beneficio(Establecimiento establecimiento, Cliente cliente, Producto producto, Double valorHabitual, Double valor) {
        this.establecimiento = establecimiento;
        this.cliente = cliente;
        this.producto = producto;
        this.asignarValorHabitual(valorHabitual);
        this.asignarValor(valor);
    }

    public Cliente obtenerCliente() {
        return this.cliente;
    }

    public Double obtenerValor() {
        return this.valor;
    }

    public Establecimiento obtenerEstablecimiento() {
        return this.establecimiento;
    }

    public Double obtenerValorHabitual() {
        return this.valorHabitual;
    }

    public Producto obtenerProducto() {
        return this.producto;
    }

    protected void asignarValor(Double valor) {
        if (valor <= 0.0) {
            throw new ExcepcionValorBeneficio();
        }
        this.valor = valor;
    }

    protected void asignarValorHabitual(Double valor) {
        if (valor <= 0.0) {
            throw new ExcepcionValorBeneficio();
        }
        this.valorHabitual = valor;
    }

}
