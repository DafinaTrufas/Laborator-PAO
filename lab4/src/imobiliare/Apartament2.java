package imobiliare;

import java.util.List;

public class Apartament2 extends Apartament {
    public Apartament2(Long id, Double pret, Double dimensiune, String dataCump, List<String> utilitati, Boolean balcon, Boolean vandut, List<Camera> camere) {
        super(id, pret, dimensiune, dataCump, utilitati, balcon, vandut, camere);
        this.setNrCamere(2);
    }
}
