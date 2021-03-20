public class Fone {

    private String label;

    private String numero;

    public Fone(){

    }

    public boolean validate(){

        return true;
    }

    public Fone(String label, String numero) {
        this.label = label;
        this.numero = numero;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Fone{" +
                "label='" + label + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
