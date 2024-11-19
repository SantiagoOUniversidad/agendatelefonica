package co.edu.uniquindio.poo.Model;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private Collection<Persona> listaPersonas = new LinkedList<>();
    private Collection<Vehiculo> listaVehiculos = new LinkedList<>();
    
    public Concesionario(String nombre, Collection<Persona> listaPersonas, Collection<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.listaPersonas = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
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

    //CRUD Cliente

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

    //Claves de administrador
    public Boolean verificarClave(String cedula){
        Persona administrador = buscarPersona(cedula);
        if (administrador.getCedula().equals(cedula) && administrador != null) {
            return true;
        } else {
            return false;
        }
    }

}
