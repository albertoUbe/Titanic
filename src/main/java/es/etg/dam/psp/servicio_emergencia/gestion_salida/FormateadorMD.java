package es.etg.dam.psp.servicio_emergencia.gestion_salida;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormateadorMD implements Formateador{
    public static final String SEPARADOR = ":";
    public static final String SALT_LINEA = System.lineSeparator();

    public static final String TXT_TITULO = "# SERVICIO DE EMERGENCIAS";
    public static final String TXT_BOTE = "## Bote ";
    public static final String TXT_TOTAl = "## Total";

    public static final String[] TXT_DATOS = {"", "- Total Salvados ", "    - Mujeres ", "    - Varones ", "    - Niños "};
    public static final String TXT_FECHA_HORA = "Ejecución realizada el día ";

    public static final String FORMAT_FECHA_HORA = "dd/MM/yyyy HH:mm:ss";
    
    @Override
    public String formatear(List<String> datos)
    {
        StringBuilder ret = this.escribirTitulo();
        ret = this.escribirFecha(ret);
        ret = this.escribirCuerpo(ret, datos);
        ret = this.escribirTotal(ret, datos);
        return ret.toString();
    }

    @Override
    public StringBuilder escribirTitulo()
    {
        StringBuilder ret = new StringBuilder();
        ret.append(TXT_TITULO).append(SALT_LINEA);
        return ret;
    }

    @Override
    public StringBuilder escribirFecha(StringBuilder documento)
    {
        StringBuilder ret = documento;
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern(FORMAT_FECHA_HORA);
        String fechaHora = fechaHoraActual.format(formato);

        ret.append(SALT_LINEA).append(TXT_FECHA_HORA).append(fechaHora).append(SALT_LINEA);

        return ret;
    }

    @Override
    public StringBuilder escribirCuerpo(StringBuilder documento, List<String> datos)
    {
        StringBuilder ret = documento;
        for(int i = 0; i < datos.size(); i++){         

            String[] pasajeros = datos.get(i).split(SEPARADOR);
            for(int j = 0; j < pasajeros.length; j++)
            {
                if(j == 0)
                {
                    ret.append(SALT_LINEA).append(TXT_BOTE).append(pasajeros[j]).append(SALT_LINEA).append(SALT_LINEA);
                }
                else
                {
                    ret.append(TXT_DATOS[j]).append(pasajeros[j]).append(SALT_LINEA);
                }
            }
        }
        return ret;
    }

    @Override
    public StringBuilder escribirTotal(StringBuilder documento, List<String> datos)
    {
        StringBuilder ret = documento;

        ret.append(SALT_LINEA).append(TXT_TOTAl).append(SALT_LINEA).append(SALT_LINEA);

        for(int i = 1; i < TXT_DATOS.length; i++){
            int total = 0;
            for(String dato : datos)
            {
                String[] pasajeros = dato.split(SEPARADOR);
                total += Integer.parseInt(pasajeros[i]);
            }
            ret.append(TXT_DATOS[i]).append(total).append(SALT_LINEA);
        }
        return ret;
    }
}
