package imobiliare;

import java.util.List;

public class Camera {
    String denumire;
    List<String> utilitati;
    public Camera(String denumire, List<String> utilitati) {
        this.denumire = denumire;
        this.utilitati = utilitati;
    }
    public Camera() {

    }
    public String getDenumire() {
        return denumire;
    }
    public List<String> getUtilitati() {
        return utilitati;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setUtilitati(List<String> utilitati) {
        this.utilitati = utilitati;
    }

    @Override
    public String toString() {
        return "Camera {" +
                "denumire='" + denumire + '\'' +
                ", utilitati=" + utilitati +
                '}';
    }
}
