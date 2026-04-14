public class VisorResultados {
    public void mostrarPalabra(Palabra palabra){
        System.out.println("--------------------------------");
        System.out.println("RESULTADOS PARA: " + palabra.getTexto().toUpperCase());
        System.out.println("--------------------------------");

        // Primero compruebo si la palabra tiene fonética
        if (palabra.getFonetica() != null) {
            System.out.println(palabra.getFonetica());
        }

        System.out.println("----- SIGNIFICADOS -----");
        for (Significado sig : palabra.getSignificados()) {
            System.out.println("Tipo: " + sig.getCategoriaGramatical().toUpperCase());
            sig.ordenarDefinicionesAlfabeticamente();
            for (Definicion def : sig.getDefiniciones()) {
                System.out.println(def);
            }
        }
    }

    public void mostrarError(String mensaje) {
        System.out.println("ERROR: " + mensaje)
    }
}
