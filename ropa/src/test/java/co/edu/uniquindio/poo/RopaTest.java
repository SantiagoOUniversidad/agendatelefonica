package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import Model.Color;
import Model.Ropa;

/**
 * Unit test for simple App.
 */
public class RopaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void RecordColorTest() {
        LOG.info("Iniciado test RecordColorTest");
        
        Color gris = new Color("gris", "F0808");
        Ropa camiseta = new Ropa("Arturo Calle", "s", gris);

        System.out.println(camiseta);

        LOG.info("Finalizando test RecordColorTest");
    }
}
