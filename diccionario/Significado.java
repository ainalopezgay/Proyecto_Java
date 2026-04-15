import java.util.List;
import java.util.Comparator;

public class Significado {
    private String categoriaGramatical; // puede ser verbo, sustantivo...
    private List<Definicion> definiciones;

    public Significado(String categoriaGramatical, List<Definicion> definiciones) {
        this.categoriaGramatical = categoriaGramatical;
        this.definiciones = definiciones;
    }

    public String getCategoriaGramatical() {
        return categoriaGramatical;
    }

    public List<Definicion> getDefiniciones() {
        return definiciones;
    }

    // Voy a ordenar las posibles definiciones por orden alfabético, para usar otras funcionalidades
    public void ordenarDefinicionesAlfabeticamente() {
        this.definiciones.sort(Comparator.comparing(Definicion::getTexto));
    }
}