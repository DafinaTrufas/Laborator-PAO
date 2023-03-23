package imobiliare;

import java.util.List;

public class Openspace extends Apartament {
    public Openspace(Long id, Double pret, Double dimensiune, String dataCump, List<String> utilitati, Boolean balcon, Integer nrCamere,
                     Boolean vandut, List<Camera> camere) {
        super(id, pret, dimensiune, dataCump, utilitati, balcon, nrCamere, vandut, camere);
    }
}
