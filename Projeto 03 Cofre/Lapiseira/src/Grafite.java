public class Grafite {

    private Float calibre;

    private String dureza;

    private Integer tamanho;

    public Grafite() {
    }

    public Grafite(Float calibre, String dureza, Integer tamanho) {
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public Float getCalibre() {
        return calibre;
    }

    public void setCalibre(Float calibre) {
        this.calibre = calibre;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Grafite{" +
                "calibre=" + calibre +
                ", dureza='" + dureza + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
