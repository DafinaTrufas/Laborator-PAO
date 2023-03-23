package imobiliare;

public class Pair<T, T1> {
    String s;

    Integer i;

    public Pair(T s, T1 i) {
        this.s = (String) s;
        this.i = (Integer) i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

}
