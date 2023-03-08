package pachet;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Aliment> alimente = new ArrayList<>();
        Aliment cozonac = new Aliment(10032023L, "lapte, faina, oua, zahar", 32.5, 20.0, Categorie.PANIFICATIE);
        Aliment branza_cu_smantana = new Aliment(11032023L, "branza proaspata, smantana", 14.8, 17.5, Categorie.LACTATE);
        Aliment carnati = new Aliment(10032023L, "carne tocata, condimente", 26.4, 18.3, Categorie.MEZELURI);
        Aliment paine = new Aliment(9032023L, "faina integrala, apa", 10.0, 15.0, Categorie.PANIFICATIE);
        alimente.add(cozonac);
        alimente.add(branza_cu_smantana);
        alimente.add(carnati);
        alimente.add(paine);
        System.out.println("Lista initiala de alimente: ");
        System.out.println(alimente.toString());
        System.out.println("Lista de alimente, sortata in functie de numarul de calorii ale alimentelor: ");
        System.out.println(alimente.stream().sorted().toList());
    }

}


