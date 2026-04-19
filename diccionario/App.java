import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuscadorDiccionario buscador = new BuscadorDiccionario();

        VisorResultados visor = VisorResultados.getInstance();

        System.out.println("Bienvenido a Dictionary App");

        while(true) {
            System.out.println("Escribe una palabra en inglés para buscar (o escribe 'salir' para terminar): ");
            String input = scanner.nextLine().trim(); // Para que se reconozca aún con espacios y se almacene

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Fin del programa");
                break;
            }

            if (input.isEmpty()) {
                visor.mostrarError("Escriba una palabra válida");
                continue;
            }
            Palabra resultado = buscador.buscar(input);

            if (resultado != null) {
                visor.mostrarResumenContenido(resultado);
                // Para que el usuario decida qué quiere ver
                System.out.println("Selecciona que información quieres ver en detalle");
                System.out.println("1. Mostrar todo");
                System.out.println("2. Solo la pronunciación");
                System.out.println("3. Solo los significados");
                System.out.println("Elige una opción (1/2/3)");
                String opcion = scanner.nextLine().trim();
                // Mostramos lo que se ha elegido
                switch (opcion) {
                    case "1":
                        visor.mostrarPalabra(resultado);
                        break;
                    case "2":
                        visor.mostrarFonetica(resultado);
                        break;
                    case "3":
                        visor.mostrarSignificados(resultado);
                        break;
                    default:
                        visor.mostrarError("Opción no válida. Mostrando toda la información por defecto");
                        visor.mostrarPalabra(resultado);
                        break;
                }
            } else {
                visor.mostrarError("La palabra '" + input + "`no se ha encontrado");
            }
        }
        scanner.close();
    }
}
