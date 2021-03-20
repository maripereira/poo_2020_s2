import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nome;

    private List<Fone> fones = new ArrayList<Fone>();

    public  Contato(){

    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public void addFone(Fone fone){
        this.fones.add(fone);
    }

    public void rmFone(int id){
        if(this.fones.size() > id)
            this.fones.remove(id);
        else
            System.out.println("index inválido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Fone> getFones() {
        return fones;
    }

    public void setFones(List<Fone> fones) {
        this.fones = fones;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", fones=" + fones +
                '}';
    }
}
