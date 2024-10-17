package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import Model.Empleado;
import Model.EmpleadoTiempoCompleto;

/**
 * Unit test for simple App.
 */
public class EmpleadoTiempoCompletoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcularSalarioTest() {
        LOG.info("Iniciado test calcularSalarioTest");
        
        Empleado empleado = new EmpleadoTiempoCompleto("Carlos", "001", 1300000);
        int salarioEsperado = 1300000;
        assertEquals(salarioEsperado, empleado.calcularSalario());

        LOG.info("Finalizando test calcularSalarioTest");
    }
}
