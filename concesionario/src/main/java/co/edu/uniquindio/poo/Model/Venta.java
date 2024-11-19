package co.edu.uniquindio.poo.Model;

import java.util.Date;

public class Venta {
    private Date fecha;
    private Persona cliente;
    private Vehiculo vehiculo;
    
    public Venta(Date fecha, Persona cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

}
