import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class BuscadorDiccionario {
    public Palabra buscar(String palabraDada) {
        String palabraLimpia = palabraDada.toLowerCase().trim();
        String url = "https://api.dictionaryapi.dev/api/v2/entries/en/" + palabraLimpia;

        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest peticion = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());

            // Vemos si la palabra existe
            if (respuesta.statusCode() == 200) {
                String json = respuesta.body();
                String transcripcion = "/.../";
                if (json.contains("\"phonetic\":\"")) {
                    transcripcion = json.split("\"phonetic\":\"")[1].split("\"")[0];
                }

                // Enlace del Audio
                String audioUrl = "Sin audio en la API";
                if (json.contains("\"audio\":\"")) {
                    String[] trozosAudio = json.split("\"audio\":\"");
                    // A veces la API manda audios vacíos, buscamos el primero que tenga texto
                }
                
                Fonetica foneticaReal = new Fonetica(transcripcion, audioUrl);

                // Categoría Gramatical
                String categoria = "Desconocido";
                if (json.contains("\"partOfSpeech\":\"")) {
                    categoria = json.split("\"partOfSpeech\":\"")[1].split("\"")[0];
                }

                // Definición Principal
                String definicionTexto = "Definición no disponible";
                if (json.contains("\"definition\":\"")) {
                    definicionTexto = json.split("\"definition\":\"")[1].split("\"")[0];
                }
                
                List<String> sinonimos = new ArrayList<>(); 
                Definicion definicionReal = new Definicion(definicionTexto, sinonimos);
                List<Definicion> listaDefiniciones = new ArrayList<>();
                listaDefiniciones.add(definicionReal);
                
                Significado significadoReal = new Significado(categoria, listaDefiniciones);
                List<Significado> listaSignificados = new ArrayList<>();
                listaSignificados.add(significadoReal);

                // Devolvemos la Palabra con todos los datos
                return new Palabra(palabraLimpia, listaSignificados, foneticaReal);

            } else {
                // Si la API da error
                System.out.println("La palabra no se encontró en el diccionario.");
                return null; 
            }
        } catch (Exception e) {
            System.out.println("Hubo un error al conectar con el diccionario.");
            return null; 
        }
    }
}