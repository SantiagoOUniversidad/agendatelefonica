package co.edu.unquincio.poo.model;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
import java.util.List;

// Atributos para almacenar la información de la reunión

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private List<Contacto> contactosAsistentes;

// Constructor para inicializar un objeto "Reunión"

    public Reunion(String descripcion, Date fecha, Time hora){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactosAsistentes = new ArrayList<>();
    }

//Getters

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public List<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

//Setters

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setContactosAsistentes(List<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }

// Metodo que permite añadir contactos a la reunión

    public String agregarAsistente(Contacto contacto) {
        if (contacto == null) {
            return "El contacto no puede ser nulo.";
        }
        if (contactosAsistentes.contains(contacto)) {
            return "El contacto ya está en la lista de asistentes.";
        }
        contactosAsistentes.add(contacto);
        return "Contacto añadido a la reunión.";
    }
    
// Metodo que permite eliminar contacto de la asistencia

    public String eliminarAsistente(Contacto contacto) {
        if (contactosAsistentes.remove(contacto)) {
            return "Contacto eliminado de la reunión.";
        } else {
            return "El contacto no estaba en la lista de asistentes.";
        }
    }

// Metodo que muestrar la información de la reunión

    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", contactosAsistentes="
                + contactosAsistentes + "]";
    }
 }
