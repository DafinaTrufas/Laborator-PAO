package imobiliare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apartament> apartamente = new ArrayList<>();
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
        Camera c1 = new Camera("sufragerie", utilitatic1);
        Camera c2 = new Camera("bucatarie", utilitatic2);
        camere1.add(c1);
        camere1.add(c2);
        camere2.add(c1);
        Apartament a1 = new Apartament3(17L, 2500D, 45D, "18.03.2023", utilitati1, true, true, camere1);
        Apartament a2 = new Openspace(22L, 5000D, 67D, null, utilitati2, false, 4, false, camere2);
        Apartament a3 = new Apartament2(56L, 3000D, 35D, "19.03.2023", utilitati3, false, true, camere1);
        Apartament a = new Apartament2(53L, 2100D, 35D, "21.03.2023", utilitati4, false, true, camere2);
        Apartament a4 = new Duplex(a, 123L, 100D, null, true, camere1);
        Apartament a5 = new Apartament2(50L, 3000D, 32.5D, "17.03.2023", utilitati3, false, true, camere1);
        Apartament a6 = new Apartament3(18L, 2500D, 45D, "19.03.2023", utilitati1, true, true, camere1);
        Apartament a7 = new Apartament3(19L, 2750D, 43D, "18.03.2023", utilitati1, true, true, camere1);
        apartamente.add(a1);
        apartamente.add(a4);
        apartamente.add(a3);
        apartamente.add(a2);
        apartamente.add(a5);
        apartamente.add(a6);
        apartamente.add(a7);
        System.out.println("Lista initiala de apartamente:\n" + apartamente);
        System.out.println("\nLista de apartamente, sortata crescator, in functie de numarul de camere al apartamentelor:\n" +
                apartamente.stream().sorted().toList());
        System.out.println("\nListele generale de utilitati, pentru fiecare apartament, urmate de listele de utilitati ale fiecarei camere din apartament:");
        Integer nr2 = 0, nr3 = 0, nrDuplex = 0, nrOpenSpace = 0, nr2Vandute = 0, nr3Vandute = 0, nrDuplexVandute = 0, nrOpenspaceVandute = 0;
        for (Apartament ap : apartamente) {
            System.out.println("\nLista generala de utilitati, pentru apartamentul cu numarul " + ap.id + " este: " + ap.utilitati +
                    ",\niar listele de utilitati ale camerelor sunt urmatoarele:");
            for (Camera c : ap.camere) {
                System.out.println(c.denumire + ": " + c.utilitati);
            }
            if (ap instanceof Apartament2) {
                nr2++;
            } else if (ap instanceof Apartament3) {
                nr3++;
            } else if (ap instanceof  Duplex) {
                nrDuplex++;
            } else if (ap instanceof Openspace) {
                nrOpenSpace++;
            }
            if (ap.vandut) {
                if (ap instanceof Apartament2) {
                    nr2Vandute++;
                } else if (ap instanceof Apartament3) {
                    nr3Vandute++;
                } else if (ap instanceof  Duplex) {
                    nrDuplexVandute++;
                } else if (ap instanceof Openspace) {
                    nrOpenspaceVandute++;
                }
            }
        }
        List<Pair<String, Integer>> nrVandute = new ArrayList<Pair<String, Integer>>();
        nrVandute.add(new Pair<String, Integer> ("Apartamente de doua camere, vandute: ", nr2Vandute));
        nrVandute.add(new Pair<String, Integer> ("Apartamente de trei camere, vandute: ", nr3Vandute));
        nrVandute.add(new Pair<String, Integer> ("Apartamente de tip duplex, vandute: ", nrDuplexVandute));
        nrVandute.add(new Pair<String, Integer> ("Apartamente de tip openspace, vandute: ", nrOpenspaceVandute));
        System.out.println("\nClasamentul tipurilor de apartamente, in functie de numarul de vanzari inregistrate: ");
        for (Pair p : nrVandute.stream().sorted().toList()) {
            System.out.println(p.s + p.i);
        }
        System.out.println("\nNumarul de apartamente existente, din fiecare categorie:\nNumarul de apartamente de doua camere: " + nr2 + "\nNumarul de apartamente de trei camere: " + nr3 +
                           "\nNumarul de apartamente de tip duplex: " + nrDuplex + "\nNumarul de apartamente de tip openspace: " + nrOpenSpace);
    }

}