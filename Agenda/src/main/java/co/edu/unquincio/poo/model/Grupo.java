package co.edu.unquincio.poo.model;

import java.util.Arrays;

public class Grupo{

// Atributos para almacenar la información del grupo

    private String nombre;
    private String categoria;
    private Contacto[] listaContactos;
    private int numeroDeContactos;

// Constructor para inicializar un objeto "grupo"

    public Grupo(String nombre, String categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.numeroDeContactos = 0;
        this.listaContactos = new Contacto[5];
    }

// Metodo que verifica si el grupo no este lleno y así permitir el registro de contactos.

    public String agregarContacto(Contacto nuevoContacto) {
        if (numeroDeContactos >= 5) {
            return "El grupo ya tiene 5 contactos.";
        }
        for (Contacto contacto : listaContactos) {
            if (contacto != null && contacto.equals(nuevoContacto)) {
                return "El contacto ya está en el grupo.";
            }
        }
        listaContactos[numeroDeContactos++] = nuevoContacto;
        return "Contacto añadido correctamente.";
    }

// getters

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }


    public int getNumeroDeContactos() {
        return numeroDeContactos;
    }

// setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void setNumeroDeContactos(int numeroDeContactos) {
        this.numeroDeContactos = numeroDeContactos;
    }

// Metodo para eliminar un contacto

    public String eliminarContacto(String telefono){
        String mensaje = "El contacto no existe";

        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if(contactoAux.getTelefono().equals(telefono)){
                listaContactos [i] = null;
                mensaje = "El contacto se ha eliminado";
                return mensaje;
            }
        }
        return mensaje;
    }

// metodo String para mostrar la información del grupo

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", listaContactos=" + Arrays.toString(listaContactos) + ", numeroContactos="
                + numeroDeContactos + "]";
    }

}

    

     

