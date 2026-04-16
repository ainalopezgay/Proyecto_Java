public class VisorResultados {y
    public void mostrarResumenContenido(Palabra palabra) {
        System.out.println("Análisis de la palabra " + palabra.getTexto().tuUpperCase())

        if(palabra.getFonetica() != null) {
            System.out.println("Contiene pronunciación y transcripción");
        } else {
            System.out.println("No hay datos de pronunciación");
        }
        
        // Para que aparezcan todas las categorias gramaticales
        if (palabra.getSignificados() != null && !palabra.getSignificados().isEmpty()) {
            System.out.print("Contiene definiciones para: ");
            for (int i=0; i<palabra.getSignificados().size(); i++) {
                System.out.print(palabra.getSignificados().get(i).getCategoriaGramatical());
                if (i < palabra.getSignificados().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No se han encontrado definiciones.");
        }
    }

    public void mostrarPalabra(Palabra palabra){
        imprimirCabecera("RESULTADO COMPLETO: " + palabra.getTexto());
        imprimirSeccionFonetica(palabra);
        imprimirSeccionSignificados(palabra);
        imprimirPieDePagina();

        // Solo muestra la parte de pronunciación
        public void mostrarFonetica(Palabra palabra){
            imprimirCabecera("SOLO PRONUNCIACIÓN: " + palabra.getTexto());
            imprimirSeccionFonetica(palabra);
            imprimirPieDePagina();
        }

        // Solo muestra los significados
        public void mostrarSignificados(Palabra palabra) {
             imprimirCabecera("SOLO SIGNIFICADOS: " + palabra.getTexto());
            imprimirSeccionSignificados(palabra);
            imprimirPieDePagina();
        }

        // Solo muestra la fonética
        public void imprimirSeccionFonetica(Palabra palabra){
            if (palabra.getFonetica() != null) {
                System.out.println(palabra.getFonetica());
            } else {
                System.out.println("No hay datos de fonética disponibles.");
            }
        }

        private void imprimirSeccionSignificados(Palabra palabra) {
            System.out.println("Categorías y definiciones");
            for (Significado sig : palabra.getSignificados()) {
                System.out.println("(" + sig.getCategoriaGramatical().toUpperCase() + ")");
                sig.ordenarDefinicionesAlfabeticamente();

                for(Definicion def : sig.getDefiniciones()) {
                    System.out.println(def);
                }
            }
        }

        private void imprimirCabecera(String titulo) {
            System.out.println(" " + titulo.toUpperCase());
        }

        private void imprimirPiedePagina() {
            System.out.println("===================================================");
        }

        peivate void mostrarError(String mensaje) {
            System.out.println("Error: " + mensaje);
        }
    }
}