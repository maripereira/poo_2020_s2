import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Grafite grafite = new Grafite();
        Lapiseira lapiseira = new Lapiseira();

        while(true) {
            String line = sc.nextLine();
            String ui[] = line.split(" ");

            if(ui[0].equals("end"))
                break;

            else if(ui[0].equals("init"))
                lapiseira.setCalibre(Float.parseFloat(ui[1]));

            else if(ui[0].equals("inserir")){
                Float calibre = Float.parseFloat(ui[1]);
                String dureza = ui[2];
                Integer tamanho = Integer.parseInt(ui[3]);
                grafite.setCalibre(calibre);
                grafite.setDureza(dureza);
                grafite.setTamanho(tamanho);
                lapiseira.inserir(grafite);
            }

            else if(ui[0].equals("remover")) {
                lapiseira.remover();

            }

            else if(ui[0].equals("show")) {
                System.out.println(lapiseira.toString());
            }

            else if(ui[0].equals("escrever")) {
                lapiseira.escrever(Integer.parseInt(ui[1]));
            }

            else
                System.out.println("fail: comando invalido!");

        }

        sc.close();
    }
}
