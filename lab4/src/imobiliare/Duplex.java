package imobiliare;

import java.util.List;

public class Duplex extends Apartament {
    private Apartament a;
    public Duplex (Apartament a, Long id, Double dimensiune, String dataCump, Boolean vandut, List<Camera> camere) {
        super(id, dimensiune, dataCump, vandut, camere);
        this.a = a;
        this.pret = 2 * a.pret;
        this.nrCamere = 2 * a.nrCamere;
        this.utilitati = a.utilitati;
        this.balcon = a.balcon;
        this.vandut = vandut;
    }
}
