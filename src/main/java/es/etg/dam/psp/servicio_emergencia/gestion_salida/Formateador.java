package es.etg.dam.psp.servicio_emergencia.gestion_salida;

import java.util.List;

public interface Formateador {
    
    String formatear(List<String> datos);

    StringBuilder escribirTitulo();

    StringBuilder escribirFecha(StringBuilder doc);

    StringBuilder escribirCuerpo(StringBuilder doc, List<String> datos);

    StringBuilder escribirTotal(StringBuilder doc, List<String> datos);
}
