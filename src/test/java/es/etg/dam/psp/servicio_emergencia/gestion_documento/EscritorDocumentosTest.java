package es.etg.dam.psp.servicio_emergencia.gestion_documento;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class EscritorDocumentosTest {

    @Test
    void testEscritor() throws IOException {
        EscritorDocumentos escritor = new EscritorDocumentos();
        String ruta = "pruebaTest.txt";
        String texto = "Documento creado";

        escritor.escribir(ruta, texto);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());

        archivo.delete();
    }
}
