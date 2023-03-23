package imobiliare;

import java.util.List;

public class Duplex extends Apartament {

    private Apartament a;

    public Duplex(Apartament a, Long id, Double dimensiune, String dataCump, Boolean vandut, List<Camera> camere) {
        super(id, dimensiune, dataCump, vandut, camere);
        this.a = a;
        this.setPret(2 * a.getPret());
        this.setNrCamere(2 * a.getNrCamere());
        this.setUtilitati(a.getUtilitati());
        this.setBalcon(a.getBalcon());
        this.setVandut(vandut);
    }
}
