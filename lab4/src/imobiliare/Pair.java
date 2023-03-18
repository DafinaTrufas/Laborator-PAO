package imobiliare;

public class Pair<T, T1> implements Comparable<Pair>{
    String s;
    Integer i;
    public Pair(T s, T1 i) {
        this.s = (String) s;
        this.i = (Integer) i;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(o.i, this.i);
    }

}
