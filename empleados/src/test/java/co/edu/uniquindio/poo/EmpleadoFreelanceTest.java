package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import Model.EmpleadoFreelance;
import Model.Empleado;

/**
 * Unit test for simple App.
 */
public class EmpleadoFreelanceTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcularSalarioFreelanceTest() {
        LOG.info("Iniciado test calcularSalarioFreelanceTest");
        
        Empleado empleado = new EmpleadoFreelance("Nicolas", "003", 6, 1500000);
        int salarioEsperado = 6 * 1500000;
        assertEquals(salarioEsperado, empleado.calcularSalario());

        LOG.info("Finalizando test calcularSalarioFreelanceTest");
    }
}
