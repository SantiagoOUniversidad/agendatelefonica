package co.edu.uniquindio.poo.Model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Date;

public class Concesionario {
    private String nombre;
    private Collection<Persona> listaPersonas = new LinkedList<>();
    private Collection<Vehiculo> listaVehiculos = new LinkedList<>();
    private Collection<Alquiler> listaAlquileres = new LinkedList<>();
    private Collection<Compra> listaCompras = new LinkedList<>();
    private Collection<Venta> listaVentas = new LinkedList<>();
    
    public Concesionario(String nombre, Collection<Persona> listaPersonas, Collection<Vehiculo> listaVehiculos, Collection<Alquiler> listaAlquileres, Collection<Compra> listaCompras, Collection<Venta> listaVentas) {
        this.nombre = nombre;
        this.listaPersonas = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
        this.listaAlquileres = new LinkedList<>();
        this.listaCompras = new LinkedList<>();
        this.listaVentas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Collection<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Collection<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Collection<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(Collection<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public Collection<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(Collection<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public Collection<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(Collection<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    

    //CRUD Vehiculo

    public String crearVehiculo(Vehiculo nuevoVehiculo){
        String mensaje = "";
        Vehiculo revisionVehiculo = buscarVehiculo(nuevoVehiculo.getPlaca());
        if (revisionVehiculo == null) {
            listaVehiculos.add(nuevoVehiculo);
            mensaje = "Vehiculo creado exitosamente";
        } else {
            mensaje = "El vehiculo ya existe";
        }
        return mensaje;
    }
    
    public Vehiculo buscarVehiculo(String placa){
        return listaVehiculos.stream().filter(vehiculo->vehiculo.getPlaca().equals(placa)).findAny().orElse(null);
    }

    public String eliminarVehiculo(String placa){
        String mensaje = "";
        Vehiculo revisionVehiculo = buscarVehiculo(placa);
        if (revisionVehiculo != null) {
            listaVehiculos.remove(revisionVehiculo);
            mensaje = "Vehiculo eliminado";
        } else {
            mensaje = "Vehiculo no encontrado";
        }
        return mensaje;
    }

    public String actualizarVehiculo(Vehiculo vehiculoActualizado){
        String mensaje = "";
        Vehiculo revisionVehiculo = buscarVehiculo(vehiculoActualizado.getPlaca());
        if (revisionVehiculo != null) {
            listaVehiculos.remove(revisionVehiculo);
            listaVehiculos.add(vehiculoActualizado);
            mensaje = "Vehiculo actualizado";
        } else {
            mensaje = "Vehiculo no encontrado";
        }
        return mensaje;
    }

    //CRUD Persona

    public String crearPersona(Persona nuevaPersona){
        String mensaje = "";
        Persona revisionPersona = buscarPersona(nuevaPersona.getCedula());
        if (revisionPersona == null) {
            listaPersonas.add(nuevaPersona);
            mensaje = "Persona creada exitosamente";
        } else {
            mensaje = "La persona ya existe";
        }
        return mensaje;
    }

    public Persona buscarPersona(String Cedula){
        return listaPersonas.stream().filter(Persona->Persona.getCedula().equals(Cedula)).findAny().orElse(null);
    }

    public String eliminarPersona(String cedula){
        String mensaje = "";
        Persona revisionPersona = buscarPersona(cedula);
        if (revisionPersona != null) {
            listaPersonas.remove(revisionPersona);
            mensaje = "Persona eliminado";
        } else {
            mensaje = "Persona no encontrado";
        }
        return mensaje;
    }

    public String actualizarPersona(Persona personaActualizado){
        String mensaje = "";
        Persona revisionPersona = buscarPersona(personaActualizado.getCedula());
        if (revisionPersona != null) {
            listaPersonas.remove(revisionPersona);
            listaPersonas.add(personaActualizado);
            mensaje = "Persona actualizado";
        } else {
            mensaje = "Persona no encontrado";
        }
        return mensaje;
    }

    //CRUD Alquiler

    public String crearAlquiler(Date fechaInicio, String fechaFin, String cedula, String placa){
        String mensaje = "";
        if (fechaInicio != null & fechaFin != null & cedula != null & placa != null) {
            Persona cliente = buscarPersona(cedula);
            Vehiculo vehiculo = buscarVehiculo(placa);
            Alquiler alquiler = new Alquiler(fechaInicio, fechaFin, cliente, vehiculo);
            listaAlquileres.add(alquiler);
            mensaje = "Alquiler creado";
        } else {
            mensaje = "Debe llenar todos los campos";
        }
        return mensaje;
    }

    public Alquiler buscarAlquiler(String cedula){
        if (cedula != null) {
            for (Alquiler alquiler : listaAlquileres) {
                Persona cliente = alquiler.getCliente();
                String buscarCliente = cliente.getCedula();
                if (buscarCliente.equals(cedula)) {
                    return alquiler;
                }
            }
        }
        return null;
    }

    //CRUD Venta

    public String crearVenta(Date fecha, String cedula, String placa){
        String mensaje = "";
        if (fecha != null && cedula != null && placa != null) {
            Persona cliente = buscarPersona(cedula);
            Vehiculo vehiculo = buscarVehiculo(placa);
            Venta venta = new Venta(fecha, cliente, vehiculo);
            listaVentas.add(venta);
            listaVehiculos.remove(vehiculo);
            mensaje = "Venta creada";
        } else {
            mensaje = "Debe llenar todos los campos";
        }
        return mensaje;
    }

    public Venta buscarVenta(String cedula){
        if (cedula != null) {
            for (Venta venta : listaVentas) {
                Persona cliente = venta.getCliente();
                String buscarCliente = cliente.getCedula();
                if (buscarCliente.equals(cedula)) {
                    return venta;
                }
            }
        }
        return null;
    }

    //Claves de administrador

    public Boolean verificarClave(String cedula){
        Persona administrador = buscarPersona(cedula);
        if (administrador.getCedula().equals(cedula) && administrador != null) {
            return true;
        } else {
            return false;
        }
    }
    

    //Gestionar compra

    public String crearCompra(Date fecha, String cedula, String placa){
        String mensaje = "";
        if (fecha != null && cedula != null && placa != null) {
            Persona cliente = buscarPersona(cedula);
            Vehiculo vehiculo = buscarVehiculo(placa);
            Compra compra = new Compra(fecha, cliente, vehiculo);
            listaCompras.add(compra);
            listaVehiculos.remove(vehiculo);
            mensaje = "Compra creada";
        } else {
            mensaje = "Debe llenar todos los campos";
        }
        return mensaje;
    }

}
