package co.edu.uniquindio.poo.Model;

import java.util.Date;

public class Alquiler {
    private Date fechaInicio;
    private String fechaFin;
    private Persona cliente;
    private Vehiculo vehiculo;
    
    public Alquiler(Date fechaInicio, String fechaFin, Persona cliente, Vehiculo vehiculo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Alquiler [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cliente=" + cliente
                + ", vehiculo=" + vehiculo + "]";
    }

    

    
}
