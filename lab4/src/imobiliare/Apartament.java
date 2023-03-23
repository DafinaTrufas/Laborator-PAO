package imobiliare;

import java.util.List;

public class Apartament implements Comparable<Apartament> {
    private Long id;

    private Double pret;

    private Double dimensiune;

    private String dataCump;

    private List<String> utilitati;

    private Boolean balcon;

    private Integer nrCamere;

    private Boolean vandut;

    private List<Camera> camere;


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


    public Apartament(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getDataCump() {
        return dataCump;
    }

    public void setDataCump(String dataCump) {
        this.dataCump = dataCump;
    }

    public List<String> getUtilitati() {
        return utilitati;
    }

    public void setUtilitati(List<String> utilitati) {
        this.utilitati = utilitati;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public Boolean getVandut() {
        return vandut;
    }

    public void setVandut(Boolean vandut) {
        this.vandut = vandut;
    }

    public List<Camera> getCamere() {
        return camere;
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
        if (Double.compare(this.nrCamere, o.nrCamere) == 0) {
            return Long.compare(this.id, o.id);
        }
        return Double.compare(this.nrCamere, o.nrCamere);
    }

}
