public class Tamagoshi {

    private Integer energyMax;

    private Integer hungryMax;

    private Integer cleanMax;

    private Integer energy;

    private Integer hungry;

    private Integer clean;

    private Integer diamonds;

    private Integer age;

    private Boolean alive;

    public Tamagoshi() {
    }

    public Tamagoshi(Integer energyMax, Integer hungryMax, Integer cleanMax){
        this.energyMax = energyMax;
        this.hungryMax = hungryMax;
        this.cleanMax = cleanMax;
    }

    public void play(){
        this.energy -= 2;
        this.hungry -= 1;
        this.clean -= 3;
        this.diamonds += 1;
        this.age += 1;
        verificaLimitesDosAtributos();
    }

    private Integer[] array(){
        Integer[] array = new Integer[3];
        array[0] = this.energy;
        array[1] = this.hungry;
        array[2] = this.clean;
        return array;
    }

    public void eat(){
        this.energy -= 1;
        this.hungry += 4;
        this.clean -= 2;
        this.age += 1;
        verificaLimitesDosAtributos();
    }

    public void sleep(){
        this.energy = this.energyMax;
    }

    public void shower(){
        this.energy -= 3;
        this.hungry--;
        this.clean = cleanMax;
        this.age += 2;
        verificaLimitesDosAtributos();
    }

    public void show(){
        this.toString();
    }

    private void verificaLimitesDosAtributos() {
        Integer[] array = array();
        for(Integer atributo : array){
            Boolean integerNegative = atributo < 0;
            if(integerNegative) atributo = 0;
        }

        if(this.energy > this.energyMax) this.energy = energyMax;
        if(this.hungry > this.hungryMax) this.hungry = hungryMax;
        if(this.clean > this.cleanMax) this.clean = cleanMax;
    }

    public Boolean verificaSePetMorreu(){
        Integer[] array = array();
        for(Integer atributo : array){
            Boolean isDead = atributo.equals(0);
            if(isDead) System.out.println("PET MORREU!");
            return isDead;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tamagoshi{" +
                ", energy=" + energy +
                "energyMax=" + energyMax +
                ", hungry=" + hungry +
                ", hungryMax=" + hungryMax +
                ", clean=" + clean +
                ", cleanMax=" + cleanMax +
                ", diamons=" + diamonds +
                ", age=" + age +
                '}';
    }

    public Integer getEnergyMax() {
        return energyMax;
    }

    public Integer getHungryMax() {
        return hungryMax;
    }

    public Integer getCleanMax() {
        return cleanMax;
    }

    public Integer getEnergy() {
        return energy;
    }

    public Integer getHungry() {
        return hungry;
    }

    public Integer getClean() {
        return clean;
    }

    public Integer getDiamonds() {
        return diamonds;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void setHungry(Integer hungry) {
        this.hungry = hungry;
    }

    public void setClean(Integer clean) {
        this.clean = clean;
    }
}
