package Model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class biblioteca {
    private String nombre;
    public LinkedList <libro> listaLibros = new LinkedList<libro>();
    public HashSet<estudiante> listaEstudiantes = new HashSet<estudiante>();
    public ArrayList <prestamo> listaPrestamos = new ArrayList<prestamo>();
    public ArrayList <bibliotecario> listaBibliotecarios = new ArrayList<bibliotecario>();

    public biblioteca(String nombre, LinkedList<libro> listaLibros, HashSet<estudiante> listaEstudiantes,
            ArrayList<prestamo> listaPrestamos, ArrayList<bibliotecario> listaBibliotecarios, Scanner ingresoDatos) {
        this.nombre = nombre;
        this.listaLibros = new LinkedList<>();
        this.listaEstudiantes = new HashSet<>();
        this.listaPrestamos = new ArrayList<>();
        this.listaBibliotecarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(LinkedList<libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public HashSet<estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(HashSet<estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public ArrayList<bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(ArrayList<bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    @Override
    public String toString() {
        return "biblioteca [nombre=" + nombre + ", listaLibros=" + listaLibros + ", listaEstudiantes="
                + listaEstudiantes + ", listaPrestamos=" + listaPrestamos + ", listaBibliotecarios="
                + listaBibliotecarios + "]";
    }

    public String crearEstudiante(estudiante nuevoEstudiante){
        listaEstudiantes.add(nuevoEstudiante);
        String mensaje = "Estudiante registrado exitosamente";
        return mensaje;
    }

    public String crearBibliotecario(bibliotecario nuevoBibliotecario){
        listaBibliotecarios.add(nuevoBibliotecario);
        String mensaje = "Bibliotecario registrado exitosamente";
        return mensaje;
    }
    
    public String crearLibro(libro nuevoLibro){
        listaLibros.add(nuevoLibro);
        String mensaje = "Libro registrado exitosamente";
        return mensaje;
    }

    public String crearPrestamo(prestamo nuevoPrestamo){
        listaPrestamos.add(nuevoPrestamo);
        String mensaje = "Prestamo registrado exitosamente";
        return mensaje;
    }
}
