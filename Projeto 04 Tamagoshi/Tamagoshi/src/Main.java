import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagoshi tamagoshi = new Tamagoshi();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            Boolean isDead = tamagoshi.verificaSePetMorreu();

            if(ui[0].equals("end"))
                break;

            else if(ui[0].equals("init")){
                tamagoshi.setEnergy(Integer.parseInt(ui[1]));
                tamagoshi.setHungry(Integer.parseInt(ui[2]));
                tamagoshi.setClean(Integer.parseInt(ui[3]));
            }

            else if(ui[0].equals("show")){
                if(!isDead)
                    tamagoshi.show();
            }

            else if(ui[0].equals("play")){
                if(!isDead)
                    tamagoshi.play();
            }

            else if(ui[0].equals("eat")){
                if(!isDead)
                    tamagoshi.eat();
            }

            else if(ui[0].equals("sleep")){
                if(!isDead)
                    tamagoshi.sleep();
            }

            else if(ui[0].equals("shower")){
                if(!isDead)
                    tamagoshi.shower();
            }

            else
                System.out.println("fail: comando invalido!");
        }
    }
}
