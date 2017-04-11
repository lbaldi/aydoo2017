package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestLibreria {

    @Test
    public void crearLibreriaYComprobarQueNoTengaVentas(){
        Libreria libreria = new Libreria();
        List<Venta> ventasEsperadas = new ArrayList<>();
        List<Venta> ventasObtenidas = libreria.obtenerVentas();

        Assert.assertEquals(ventasEsperadas, ventasObtenidas);
    }

    @Test
    public void crearLibreriaYComprobarQueNoTengaSuscripciones(){
        Libreria libreria = new Libreria();
        List<Suscripcion> suscripcionesEsperadas = new ArrayList<>();
        List<Suscripcion> suscripcionesObtenidas = libreria.obtenerSuscripciones();

        Assert.assertEquals(suscripcionesEsperadas, suscripcionesObtenidas);
    }

    @Test
    public void registrarVentaYComprobarListadoDeVentas(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarVenta(Calendar.JULY, leandro,  producto);
        int cantidadVentasObtenidas = libreria.obtenerVentas().size();

        Assert.assertEquals(1, cantidadVentasObtenidas);
    }

    @Test
    public void registrarSuscripcionYComprobarListadoDeSuscripciones(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarSuscripcion(Calendar.JULY, 1, producto, 10.0, leandro);
        int cantidadSuscripcionesObtenidas = libreria.obtenerSuscripciones().size();

        Assert.assertEquals(1, cantidadSuscripcionesObtenidas);
    }

    @Test
    public void registrarVentaYComprobarObtenerVentaPorClienteYPorMes(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarVenta(Calendar.JULY, leandro, producto);
        int cantidadVentasObtenidas = libreria.obtenerVentasPorClienteYPorMes(Calendar.JULY, leandro).size();

        Assert.assertEquals(1, cantidadVentasObtenidas);
    }

    @Test
    public void registrarSuscripcionYComprobarObtenerSuscripcionPorClienteYPorMes(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarSuscripcion(Calendar.JULY, 5, producto, 10.0, leandro);
        int cantidadSuscripcionesObtenidas = libreria.obtenerSuscripcionesPorClienteYPorMes(Calendar.DECEMBER, leandro).size();

        Assert.assertEquals(1, cantidadSuscripcionesObtenidas);
    }

    @Test
    public void registrarVentaYComprobarObtenerVentaPorClienteYPorMesIncorrecto(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarVenta(Calendar.JULY, leandro, producto);
        int cantidadVentasObtenidas = libreria.obtenerVentasPorClienteYPorMes(Calendar.JUNE, leandro).size();

        Assert.assertEquals(0, cantidadVentasObtenidas);
    }

    @Test
    public void registrarSuscripcionYComprobarObtenerSuscripcionPorClienteYPorMesIncorrecto(){
        Libreria libreria = new Libreria();
        Cliente leandro = new Cliente("Leandro", "Calle Falsa");
        ProductoSuscripcion producto = new Periodico(1.0, 1);
        libreria.registrarSuscripcion(Calendar.JULY, 1, producto, 10.0, leandro);
        int cantidadSuscripcionesObtenidas = libreria.obtenerSuscripcionesPorClienteYPorMes(Calendar.DECEMBER, leandro).size();

        Assert.assertEquals(0, cantidadSuscripcionesObtenidas);
    }

}