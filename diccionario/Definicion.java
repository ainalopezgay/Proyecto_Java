import java.util.List;

public class Definicion {
    private String texto;
    private List<String> sinonimos;

    public Definicion(String texto, List<String> sinonimos) {
        this.texto = texto;
        this.sinonimos = sinonimos;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getSinonimos() {
        return sinonimos;
    }

    @Override
    public String toString() {
        return "- " + texto + " (Sinónimos: " + sinonimos + ")";
    }
}
