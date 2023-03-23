package imobiliare;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Apartament> apartamente = new TreeSet<>();

        List<String> utilitati1 = new ArrayList<>();
        List<String> utilitati2 = new ArrayList<>();
        List<String> utilitati3 = new ArrayList<>();
        List<String> utilitati4 = new ArrayList<>();
        utilitati1.add("o baie");
        utilitati1.add("mobilat");
        utilitati2.add("doua bai");
        utilitati2.add("loc de parcare");
        utilitati3.add("terasa");
        utilitati4.add("doua bai");

        List<String> utilitatic1 = new ArrayList<>();
        List<String> utilitatic2 = new ArrayList<>();
        utilitatic1.add("canapea");
        utilitatic1.add("biblioteca");
        utilitatic2.add("aragaz");
        utilitatic2.add("cuptor");

        List<Camera> camere1 = new ArrayList<>();
        List<Camera> camere2 = new ArrayList<>();
        camere1.add(new Camera("sufragerie", utilitatic1));
        camere1.add(new Camera("bucatarie", utilitatic2));
        camere2.add(new Camera("sufragerie", utilitatic1));

        Apartament a = new Apartament2(53L, 2100D, 35D, "21.03.2023", utilitati4, false, true, camere2);
        apartamente.add(new Apartament3(17L, 2500D, 45D, "18.03.2023", utilitati1, true, true, camere1));
        apartamente.add(new Duplex(a, 123L, 100D, null, true, camere1));
        apartamente.add(new Apartament2(56L, 3000D, 35D, "19.03.2023", utilitati3, false, true, camere1));
        apartamente.add(new Openspace(22L, 5000D, 67D, null, utilitati2, false, 4, false, camere2));
        apartamente.add(new Apartament2(50L, 3000D, 32.5D, "17.03.2023", utilitati3, false, true, camere1));
        apartamente.add(new Apartament3(18L, 2500D, 45D, "19.03.2023", utilitati1, true, true, camere1));
        apartamente.add(new Apartament3(19L, 2750D, 43D, "18.03.2023", utilitati1, true, true, camere1));

        // Task 2
        System.out.println("\nLista de apartamente, sortata crescator, in functie de numarul de camere al apartamentelor:\n");
        for (Apartament ap : apartamente) {
            System.out.println(ap);
        }

        // Task 3
        System.out.println("\nListele generale de utilitati, pentru fiecare apartament, urmate de listele de utilitati ale fiecarei camere din apartament:");
        Integer nr2 = 0, nr3 = 0, nrDuplex = 0, nrOpenSpace = 0, nr2Vandute = 0, nr3Vandute = 0, nrDuplexVandute = 0, nrOpenspaceVandute = 0;
        for (Apartament ap : apartamente) {
            System.out.println("\nLista generala de utilitati, pentru apartamentul cu numarul " + ap.getId() + " este: " + ap.getUtilitati() +
                    ",\niar listele de utilitati ale camerelor sunt urmatoarele:");
            for (Camera c : ap.getCamere()) {
                System.out.println(c.getDenumire() + ": " + c.getUtilitati());
            }
            if (ap instanceof Apartament2) {
                nr2++;
            } else if (ap instanceof Apartament3) {
                nr3++;
            } else if (ap instanceof Duplex) {
                nrDuplex++;
            } else if (ap instanceof Openspace) {
                nrOpenSpace++;
            }
            if (ap.getVandut()) {
                if (ap instanceof Apartament2) {
                    nr2Vandute++;
                } else if (ap instanceof Apartament3) {
                    nr3Vandute++;
                } else if (ap instanceof Duplex) {
                    nrDuplexVandute++;
                } else if (ap instanceof Openspace) {
                    nrOpenspaceVandute++;
                }
            }
        }

        // Task 4
        List<Pair<String, Integer>> nrVandute = new ArrayList<>();
        nrVandute.add(new Pair<>("Apartamente de doua camere, vandute: ", nr2Vandute));
        nrVandute.add(new Pair<>("Apartamente de trei camere, vandute: ", nr3Vandute));
        nrVandute.add(new Pair<>("Apartamente de tip duplex, vandute: ", nrDuplexVandute));
        nrVandute.add(new Pair<>("Apartamente de tip openspace, vandute: ", nrOpenspaceVandute));
        System.out.println("\nClasamentul tipurilor de apartamente, in functie de numarul de vanzari inregistrate: ");
        nrVandute.sort((p1, p2) -> p2.getI().compareTo(p1.getI()));
        for (Pair p : nrVandute) {
            System.out.println(p.s + p.i);
        }

        // Task 5
        System.out.println("\nNumarul de apartamente existente, din fiecare categorie:\nNumarul de apartamente de doua camere: " + nr2 + "\nNumarul de apartamente de trei camere: " + nr3 +
                "\nNumarul de apartamente de tip duplex: " + nrDuplex + "\nNumarul de apartamente de tip openspace: " + nrOpenSpace);
    }

}