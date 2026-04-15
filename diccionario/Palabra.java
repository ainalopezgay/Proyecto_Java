import java.util.List;

public class Palabra {
    private String texto;
    private List<Significado> significados;
    private Fonetica fonetica;

    public Palabra(String texto, List<Significado> significados, Fonetica fonetica) {
        this.texto = texto;
        this.significados = significados;
        this.fonetica = fonetica;
    }

    public String getTexto() {
        return texto;
    }

    public List<Significado> getSignificados() {
        return significados;
    }

    public Fonetica getFonetica() {
        return fonetica;
    }

    // Para comprobar que la palabra tenga todos los datos posibles
    public boolean tiene InformacionCompleta() {
        return.this.fonetica != null && this.significados != null && !this.significados.isEmpty();
    }
}
