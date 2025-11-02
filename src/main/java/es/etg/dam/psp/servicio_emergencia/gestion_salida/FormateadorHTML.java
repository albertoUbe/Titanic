package es.etg.dam.psp.servicio_emergencia.gestion_salida;

import java.util.List;

public class FormateadorHTML implements Formateador{

    @Override
    public String formatear(List<String> datos) {
        
        throw new UnsupportedOperationException("Unimplemented method 'formatear'");
    }

    @Override
    public StringBuilder escribirTitulo() {

        throw new UnsupportedOperationException("Unimplemented method 'escribirTitulo'");
    }

    @Override
    public StringBuilder escribirFecha(StringBuilder doc) {
        
        throw new UnsupportedOperationException("Unimplemented method 'escribirFecha'");
    }

    @Override
    public StringBuilder escribirCuerpo(StringBuilder doc, List<String> datos) {
       
        throw new UnsupportedOperationException("Unimplemented method 'escribirCuerpo'");
    }

    @Override
    public StringBuilder escribirTotal(StringBuilder doc, List<String> datos) {
        
        throw new UnsupportedOperationException("Unimplemented method 'escribirTotal'");
    }
    
}
