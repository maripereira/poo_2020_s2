public class Lapiseira {

    private Float calibre; //numero quebrado

    private Grafite grafite; //

    public Lapiseira() {
    }

    public Lapiseira(Float calibre, Grafite grafite) {
        this.calibre = calibre;
        this.grafite = grafite;

    }

    public Lapiseira(Float calibre){
        this.calibre = calibre;
    }

    public void inserir(Grafite grafite){
        if(!grafite.getCalibre().equals(this.calibre)){
            System.out.println("Calibre do grafite não aceito.");
            return;
        }
        this.grafite = grafite;
    }

    public void remover(){
        if(this.grafite != null){
            this.grafite = null;
            System.out.println("Removendo grafite");
            return;
        }
        System.out.println("Não há grafite na lapiseira.");
    }

    public void escrever(Integer folhas){
        if(this.grafite == null){
            System.out.println("Não é possível escrever sem grafite.");
        }
        Integer maciez = this.pegarMaciez();
        Integer dureza = this.getGrafite().getTamanho();
        Integer novoTamanho = dureza - (maciez * folhas);
        if (novoTamanho < 0) {
            this.getGrafite().setTamanho(0);
        }
        else if(novoTamanho > 0){
            this.getGrafite().setTamanho(novoTamanho);
        }
        else {
            this.setGrafite(null);
        }

    }

    public Float getCalibre() {
        return calibre;
    }

    public void setCalibre(Float calibre) {
        this.calibre = calibre;
    }

    public Grafite getGrafite() {
        return grafite;
    }

    public void setGrafite(Grafite grafite) {
        this.grafite = grafite;
    }

    @Override
    public String toString() {
        return "Lapiseira{" +
                "calibre=" + calibre +
                ", grafite=" + grafite +
                '}';
    }

    private Integer pegarMaciez(){
        String dureza = this.getGrafite().getDureza().toUpperCase();
        if(dureza.equals("HB")){
            return 1;
        }
        if(dureza.equals("2B")){
            return 2;
        }
        if(dureza.equals("4B")){
            return 4;
        }
        if(dureza.equals("6B")){
            return 6;
        }
        return 0;
    }
}
