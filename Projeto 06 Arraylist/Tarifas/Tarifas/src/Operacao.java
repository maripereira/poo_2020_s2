public class Operacao {
    private int indice;
    private Label label;

    private int value;

    private int saldo;

    public Operacao(int indice, Label label, int value, int saldo) {
        this.indice = indice;
        this.label = label;
        this.value = value;
        this.saldo = saldo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static String pad(String string, int length) {
        return String.format("%1$"+length+ "s", string);
    }
    public String toString() {
        return pad("" + indice, 2) + ":" + pad("" + label, 9) + ":" + pad("" + value, 5) + ":" + pad("" + saldo, 5);
    }
}
