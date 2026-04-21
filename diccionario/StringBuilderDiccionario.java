public class StringBuilderDiccionario {
    // Para el resumen inicial
    public static String generarResumen(Palabra palabra) {
        StringBuilder sb = new StringBuilder();
        sb.append("Análisis de la palabra").append(palabra.getTexto().toUpperCase());

        if(palabra.getFonetica() != null) {
            sb.append("Contiene pronunciación y transcripción");
        } else {
            sb.append("No hay datos sobre la pronunciación");
        }

        if (palabra.getSignificados() != null && !palabra.getSignificados().isEmpty()) {
            sb.append("Contiene definiciones");
        } else {
            sb.append("No se encontraron definiciones");
        }
        return sb.toString();
    }

    public static String generarPalabraCompleta(Palabra p) {
        return construir(p, true, true);
    }
    public static String generarFonetica(Palabra p) {
        return construir(p, true, false)
    }
    public static String generarSoloSignificados(Palabra p) {
        return construir(p, false, true)
    }

    private static String construir(Palabra p, boolean conFonetica, boolean conSignificados) {
        StringBuilder sb = new StringBuilder();

        if (conFonetica) {
            sb.append(p.getFonetica() != null ? p.getFonetica() : "No hay fonética");
        }

        if(conSignificados && p.getSignificados() != null) {
            for (Significado sig : p.getSignificados()) {
                sb.append("(").append(sig.getCategoriaGramatical().toUpperCase()).append(")");
                sig.ordenarDefinicionesAlfabeticamente();
                for (Definicion def : sig.getDefiniciones()) {
                    sb.append(def);
                }
            }
        }
        return sb.toString();
    }
}