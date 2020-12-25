public class Carro {

    private Integer gas;

    private Integer maxGas;

    private Integer pass;

    private Integer passMax;

    private Integer km;

    public Carro() {
    }

    public Carro(Integer gas, Integer maxGas, Integer pass, Integer passMax, Integer km) {
        this.gas = gas;
        this.maxGas = maxGas;
        this.pass = pass;
        this.passMax = passMax;
        this.km = km;
    }

    public void in(){
        if(this.pass + 1 > passMax){
            System.out.println("A quantidade de passageiro máximo atingiu o limite");
            return;
        }
        this.pass++;
        System.out.println("Passageiro embarcando");
    }

    public void out(){
        if(this.pass - 1 < 0){
            System.out.println("Não há passageiros para desembarcar");
            return;
        }
        this.pass--;
        System.out.println("Passageiro descendo");
    }

    public void fuel(Integer quantidade){
        if(gas + quantidade > maxGas){
            System.out.println(String.format("Abastacendo %d litros", quantidade));
            this.gas = 100;
            return;
        }
        System.out.println(String.format("Abastacendo %d litros", quantidade));
        this.gas += quantidade;
    }

    public void drive(Integer distancia){
        if(this.pass > 0 && gas > 0){
            this.km += distancia;
            if(gas.compareTo(distancia) < 0){
                System.out.println(String.format(
                        "Não temos combustivel suficiente para completar a viagem toda. Pecorreremos apenas %d km", this.gas));
                gas -= distancia;
                if(gas < 0) gas = 0;
                return;
            }
            System.out.println("O carro está dirigindo");
            gas -= distancia;
        } else{
            System.out.println("Tanque vazio ou não há passageiros.");
        }
    }

    void showPassageiros() {
        System.out.println("Numero de pessoas = " + this.pass);
    }

    void showCombustivel() {
        System.out.println("Tanque = " + this.gas);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "gas=" + gas +
                ", maxGas=" + maxGas +
                ", pass=" + pass +
                ", passMax=" + passMax +
                ", km=" + km +
                '}';
    }

    public Integer getGas() {
        return gas;
    }

    public void setGas(Integer gas) {
        this.gas = gas;
    }

    public Integer getMaxGas() {
        return maxGas;
    }

    public void setMaxGas(Integer maxGas) {
        this.maxGas = maxGas;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getPassMax() {
        return passMax;
    }

    public void setPassMax(Integer passMax) {
        this.passMax = passMax;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }
}
