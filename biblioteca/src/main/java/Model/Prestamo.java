package Model;
import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private ArrayList<Libro> libros;
    private Date fechaPrestamo;
    private Date fechaEntrega;

    // Constructor de Prestamo con los parámetros correctos
    public Prestamo(String codigo, Estudiante estudiante, Bibliotecario bibliotecario, Date fechaPrestamo) {
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.fechaPrestamo = fechaPrestamo;
        this.libros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario
                + ", libros=" + libros + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega + "]";
    }

    // Método para adicionar un libro al préstamo
    public String agregarLibro(Libro libro) {
        String mensaje = "No hay unidades disponibles";
        if (libro.getUnidadesDisponibles() > 0) {
            libros.add(libro);
            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - 1);
            mensaje = "El libro esta en stock";
            return mensaje;
        }
        return mensaje;
    }

    // Método para entregar el préstamo
    public double entregarPrestamo(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        long diferenciaDias = (fechaEntrega.getTime() - fechaPrestamo.getTime()) / (1000 * 60 * 60 * 24);
        double costo = diferenciaDias * 5000;
        for (Libro libro : libros) {
            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() + 1);
        }
        return costo;
    }
}
