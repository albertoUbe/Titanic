package es.etg.dam.psp.servicio_emergencia.gestion_botes;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EmbarcadorTest {
    
    @Test
    void testEmbarcadorComando() throws Exception {
        Embarcador embarcador = new Embarcador();

        String[] comando = {"echo", "B01:10:4:3:3"};
        String resultado = embarcador.ejecutar(comando);

        assertTrue(resultado.contains("B01:10:4:3:3"));
    }

}
