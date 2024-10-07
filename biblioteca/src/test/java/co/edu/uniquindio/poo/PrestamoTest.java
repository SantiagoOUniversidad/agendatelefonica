package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import Model.Libro;
import Model.Prestamo;

public class PrestamoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    Prestamo prestamo = new Prestamo(null, null, null, null);

    @Test
    public void agregarLibroSinStockTest() {
        LOG.info("Iniciado test agregarLibroTest");
        Libro libro = new Libro("123", "001", "Gabriel", "Titulo", "Editorial", null, 0);
        assertEquals("No hay unidades disponibles", prestamo.agregarLibro(libro));
        LOG.info("Finalizando test agregarLibroTest");
    }

    @Test
    public void agregarLibroConStockTest() {
        LOG.info("Iniciado test entregarPrestamoTest");
        Libro libro = new Libro("123", "001", "Gabriel", "Titulo", "Editorial", null, 0);
        libro.setUnidadesDisponibles(3);
        assertEquals("El libro esta en stock", prestamo.agregarLibro(libro));
        LOG.info("Finalizando test entregarPrestamoTest");
    }
}
