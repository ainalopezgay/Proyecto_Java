public class VisorResultados {
    private static VisorResultados instanciaUnica;
    private VisorResultados() {
    }
    // Para tener la única pantalla disponible
    public static VisorResultados getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new VisorResultados();
        }
        return instanciaUnica;
    }

    public void mostrarResumenContenido(Palabra palabra) {
        System.out.println(StringBuilderDiccionario.generarResumen(palabra));
    }

    public void mostrarPalabra(Palabra palabra) {
        System.out.println(StringBuilderDiccionario.generarPalabraCompleta(palabra));
    }

    public void mostrarFonetica(Palabra palabra) {
        System.out.println(StringBuilderDiccionario.generarFonetica(palabra));
    }

    public void mostrarSignificados(Palabra palabra) {
        System.out.println(StringBuilderDiccionario.generarSoloSignificados(palabra));
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}