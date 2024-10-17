package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import Model.Empleado;
import Model.EmpleadoPorHora;

/**
 * Unit test for simple App.
 */
public class EmpleadoPorHoraTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcularSalarioHoraTest() {
        LOG.info("Iniciado test calcularSalarioHoraTest");
        
        Empleado empleado = new EmpleadoPorHora("Monica", "002", 12, 600000);
        int salarioEsperado = 12 * 600000;
        assertEquals(salarioEsperado, empleado.calcularSalario());

        LOG.info("Finalizando test calcularSalarioHoraTest");
    }
}
