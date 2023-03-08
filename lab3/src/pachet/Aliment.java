package pachet;

public class Aliment implements Comparable<Aliment> {
    protected Long dataExp;
    protected String ingrediente;
    protected Double pret;
    protected Double calorii;
    protected Categorie tip;

    public Aliment(Long dataExp, String ingrediente, Double pret, Double calorii, Categorie tip) {
        this.dataExp = dataExp;
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
        this.tip = tip;
    }

    @Override
    public int compareTo(Aliment o) {
        return Double.compare(this.calorii, o.calorii);
    }

    @Override
    public String toString() {
        return "Data expirarii: " + dataExp + ", Ingrediente: " + ingrediente + ", Pret: " + pret + ", Calorii: " + calorii + ", Categorie: " + tip + '\n';
    }

    public Aliment() {

    }

    public Long getDataExp() {
        return dataExp;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public Double getPret() {
        return pret;
    }

    public Double getCalorii() {
        return calorii;
    }

    public Categorie getTip() {
        return tip;
    }

    public void setDataExp(Long dataExp) {
        this.dataExp = dataExp;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setCalorii(Double calorii) {
        this.calorii = calorii;
    }

    public void setTip(Categorie tip) {
        this.tip = tip;
    }
}


