import java.util.ArrayList;
import java.util.List;

public class Financas {

    private int nextId = 1;

    private List<Operacao> extrato = new ArrayList<>();
    private int saldo;
    public Financas() {};

    public void addOperacao(Label label, int value) {
        Operacao op = new Operacao(1, label, value, this.saldo);
        this.extrato.add(op);
        this.nextId++;
    };

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public List<Operacao> getExtrato() {
        return this.extrato;
    }

    public List<Operacao> getExtrato(int qtdOp) {
        int size = this.extrato.size();
        List<Operacao> novaOp = new ArrayList<>();
        for(int i = size; qtdOp >= 0; size--) {
            qtdOp--;
            novaOp.add(this.extrato.get(i));
        }
        return novaOp;
    };

    public void setExtrato(List<Operacao> extrato) {
        this.extrato = extrato;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
