public class Conta {
    private int id;
    private Financas financas;

    public Conta(int id) {
        this.id = id;
        this.financas = new Financas();
        this.financas.addOperacao(Label.abertura, 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Financas getFinancas() {
        return financas;
    }

    public void setFinancas(Financas financas) {
        this.financas = financas;
    }

    public boolean sacar(int value) {
        if(value >= this.financas.getSaldo()){
            int novoSalvo = this.financas.getSaldo();
            this.financas.setSaldo(novoSalvo);
            this.financas.addOperacao(Label.saque, value);
            return true;
        }
        return false;
    };

    public boolean tarifar(int value) {
        int novoSaldo = this.financas.getSaldo() - value;
        this.financas.setSaldo(novoSaldo);
        this.financas.addOperacao(Label.tarifa, value);
        return true;
    };

    public boolean extornar(int indice) {
        return true;
    };

    public boolean creditar(Label label, int value) {
        if(value > 0){
            this.financas.setSaldo(value);
            this.financas.addOperacao(Label.deposito, value);
            return true;
        }
        return false;
    };

}
