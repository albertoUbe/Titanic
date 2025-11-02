package es.etg.dam.psp.bote;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoteTest {
    
    @Test
    void testContar() {
        List<String> pasajeros = Arrays.asList("m", "h", "n", "m", "h", "m");
        assertEquals(3, Bote.contar(pasajeros, Bote.MUJER));
        assertEquals(2, Bote.contar(pasajeros, Bote.HOMBRE));
        assertEquals(1, Bote.contar(pasajeros, Bote.NINIO));
    }

    @Test
    void testObtenerTipo() {
        assertEquals(Bote.MUJER, Bote.obtenerTipo(0));
        assertEquals(Bote.MUJER, Bote.obtenerTipo(1));
        assertEquals(Bote.NINIO, Bote.obtenerTipo(2));
        assertEquals(Bote.HOMBRE, Bote.obtenerTipo(3));
        assertEquals(Bote.HOMBRE, Bote.obtenerTipo(4));
    }
}