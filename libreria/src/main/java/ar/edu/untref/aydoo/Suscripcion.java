package ar.edu.untref.aydoo;

public class Suscripcion {

    protected Integer mesInicio;
    protected Integer cantidadMeses;
    protected ProductoSuscripcion producto;
    protected Double descuento;
    protected Cliente cliente;

    public Suscripcion(Integer mesInicio, Integer cantidadMeses, ProductoSuscripcion producto, Double descuento, Cliente cliente){

        this.mesInicio = mesInicio;
        this.cantidadMeses = cantidadMeses;
        this.producto = producto;
        this.descuento = descuento;
        this.cliente = cliente;

    }

    public Integer obtenerMesInicio(){

        return this.mesInicio;

    }

    public Integer obtenerCantidadMeses(){

        return this.cantidadMeses;

    }

    public ProductoSuscripcion obtenerProducto(){

        return this.producto;

    }

    public Double obtenerDescuento(){

        return this.descuento;

    }

    public Cliente obtenerCliente(){

        return cliente;

    }

    private static Double obtenerCoeficienteDescuento(Double descuento){

        return 1 - (descuento / 100);

    }

    public boolean perteneAMes(Integer mes) {

        if(mes >= this.obtenerMesInicio() && mes <= (this.obtenerMesInicio() + this.obtenerCantidadMeses())){

            return true;

        } else {

            return false;

        }

    }

    public Double obtenerValorMensual() {

        return this.obtenerProducto().obtenerPeriodicidadMensual() * this.obtenerProducto().obtenerValor() * obtenerCoeficienteDescuento(this.obtenerDescuento());
    }

}
