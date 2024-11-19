package co.edu.uniquindio.poo.Model;

public class Compra {
    private String fecha;
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    public Compra(String fecha, Cliente cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
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
