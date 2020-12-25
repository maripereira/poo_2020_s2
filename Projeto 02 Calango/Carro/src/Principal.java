import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro(0, 100, 0, 2, 0);

        while(true) {
            String line = sc.nextLine();
            String ui[] = line.split(" ");

            if(ui[0].equals("end"))
                break;

            else if(ui[0].equals("showPassageiro"))
                carro.showPassageiros();

            else if(ui[0].equals("showCombustivel"))
                carro.showCombustivel();

            else if(ui[0].equals("in")) {
                carro.in();
            }
            else if(ui[0].equals("out")) {
                carro.out();

            }
            else if(ui[0].equals("fuel")) {
                carro.fuel(Integer.parseInt(ui[1]));
            }

            else if(ui[0].equals("drive")){
                carro.drive(Integer.parseInt(ui[1]));
            }

            else
                System.out.println("fail: comando invalido!");

        }

        sc.close();

    }
}
