public enum Label {
    saque("saque"),
    deposito("deposito"),
    tarifa("tarifa"),
    extorno("extorno"),
    abertura("abertura");

    private String name;

    private Label(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
