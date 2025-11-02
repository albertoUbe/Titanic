package es.etg.dam.psp.servicio_emergencia.gestion_salida;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FormateadorMdTest {
    
    @Test
    void testFormatearGeneraInformeCorrecto() {
        FormateadorMD formateador = new FormateadorMD();

        List<String> datos = List.of("B01:10:4:3:3");
        String resultado = formateador.formatear(datos);

        assertNotNull(resultado);
        assertTrue(resultado.contains("# SERVICIO DE EMERGENCIAS"));
        assertTrue(resultado.contains("## Bote B01"));
        assertTrue(resultado.contains("- Total Salvados 10"));
        assertTrue(resultado.contains("    - Mujeres 4"));
        assertTrue(resultado.contains("    - Varones 3"));
        assertTrue(resultado.contains("    - Niños 3"));
        assertTrue(resultado.contains("## Total"));
        assertTrue(resultado.contains("Ejecución realizada el día"));
    }
}
