public class Fonetica {
    private String transcripcion;
    private String audioUrl;

    public Fonetica(String transcripcion, String audioUrl) {
        this.transcripcion = transcripcion;
        this.audioUrl = audioUrl;
    }

    public String getTranscripcion(){
        return transcripcion;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    @Override
    public String toString() {
        return "Pronunciación: " + transcripcion + " (Audio: " + audioUrl + ")";
    }
}
