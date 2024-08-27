package co.edu.unquincio.poo.model;

import java.util.Objects;

public class Contacto{

// Atributos para almacenar la información del contacto
   
    private String nombre; 
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

// Constructor para inicializar un objeto "Contacto"

    public Contacto(String nombre, String alias, String direccion, String telefono,
    String email) {
    this.nombre = nombre;
    this.alias = alias;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    }

//getters

    public String getNombres() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

//Setters

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

// Metodo que comprueba si un contacto esta repetido
 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono);
    }


    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }

// Mostrar informacion del contacto

    @Override
    public String toString() {
        return "Contacto [nombres=" + nombre + ", alias=" + alias + ", direccion=" + direccion + ", telefono="
                + telefono + ", email=" + email + "]";
    } 
}
