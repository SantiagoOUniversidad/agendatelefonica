package co.edu.uniquindio.poo;
import Model.Bibliotecario;
import Model.Estudiante;
import Model.Libro;
import Model.Biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    Biblioteca biblioteca = new Biblioteca();

    @Test
    public void crearBibliotecarioTest(){
        LOG.info("Iniciado test crearBibliotecarioTest");
        Bibliotecario bibliotecario = new Bibliotecario("Andres", "123456", "3136203318", "andres@hotmail.com", 0);
        assertEquals("Bibliotecario creado", biblioteca.crearBibliotecario(bibliotecario));
        assertEquals("Error al crear bibliotecario", biblioteca.crearBibliotecario(null));
        LOG.info("Finalizdo test crearBibliotecarioTest");
    }

    @Test
    public void crearPrestamoTest(){
        LOG.info("Iniciado test crearPrestamoTest");
        Estudiante estudiante = new Estudiante("Santiago", "98765", "3112417691", "santiago@gmail.com");
        biblioteca.crearEstudiante(estudiante);
        Bibliotecario bibliotecario = new Bibliotecario("Andres", "123456", "3136203318", "andres@hotmail.com", 0);
        biblioteca.crearBibliotecario(bibliotecario);
        Libro libro = new Libro("123", "001", "Gabriel", "Titulo", "Editorial", null, 3);
        biblioteca.libros.add(libro);
        String codigoPrestamo = "009";
        Date fechaPrestamo = null;
        ArrayList<String> librosPrestar = new ArrayList<>();
        librosPrestar.add("123");
        assertEquals("Prestamo creado", biblioteca.crearPrestamo(codigoPrestamo, "98765", "123456", fechaPrestamo, librosPrestar));
        LOG.info("Finalizado test crearPrestamoTest");
    }
}
