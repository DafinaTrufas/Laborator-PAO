package imobiliare;

import java.util.List;

public class Apartament implements Comparable<Apartament> {
    Long id;
    Double pret;
    Double dimensiune;
    String dataCump;
    List<String> utilitati;
    Boolean balcon;
    Integer nrCamere;
    Boolean vandut;
    List<Camera> camere;
    public Apartament(Long id, Double pret, Double dimensiune, String dataCump, List<String> utilitati, Boolean balcon, Integer nrCamere,
                      Boolean vandut, List<Camera> camere) {
        this.id = id;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.dataCump = dataCump;
        this.utilitati = utilitati;
        this.balcon = balcon;
        this.nrCamere = nrCamere;
        this.vandut = vandut;
        this.camere = camere;
    }

    public Apartament(Long id, Double pret, Double dimensiune, String dataCump, List<String> utilitati, Boolean balcon, Boolean vandut, List<Camera> camere) {
        this.id = id;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.dataCump = dataCump;
        this.utilitati = utilitati;
        this.balcon = balcon;
        this.vandut = vandut;
        this.camere = camere;
    }

    public Apartament(Long id, Double dimensiune, String dataCump, Boolean vandut, List<Camera> camere) {
        this.id = id;
        this.dimensiune = dimensiune;
        this.dataCump = dataCump;
        this.vandut = vandut;
        this.camere = camere;
    }

    public Apartament() {

    }

    public Long getId() {
        return id;
    }

    public Double getPret() {
        return pret;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public String getDataCump() {
        return dataCump;
    }

    public List<String> getUtilitati() {
        return utilitati;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public Boolean getVandut() {
        return vandut;
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public Apartament(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setDataCump(String dataCump) {
        this.dataCump = dataCump;
    }

    public void setUtilitati(List<String> utilitati) {
        this.utilitati = utilitati;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setVandut(Boolean vandut) {
        this.vandut = vandut;
    }

    public void setCamere(List<Camera> camere) {
        this.camere = camere;
    }

    @Override
    public String toString() {
        StringBuilder camereAfis = new StringBuilder(" {");
        for (Camera c : this.camere) {
            camereAfis.append(c.toString() + ", ");
        }
        camereAfis.delete(camereAfis.length() - 2, camereAfis.length());
        camereAfis.append(" }");
        return "Apartament {" +
                "id=" + id +
                ", pret=" + pret +
                ", dimensiune=" + dimensiune +
                ", dataCump='" + dataCump + '\'' +
                ", utilitati=" + utilitati +
                ", balcon=" + balcon +
                ", nrCamere=" + nrCamere +
                ", vandut=" + vandut +
                ", camere=" + camereAfis;
    }

    @Override
    public int compareTo(Apartament o) {
        return Double.compare(this.nrCamere, o.nrCamere);
    }

}
