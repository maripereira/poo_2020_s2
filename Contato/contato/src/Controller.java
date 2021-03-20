import java.sql.SQLOutput;
import java.util.Scanner;

public class Controller {

    private static final String NOME_VAZIO = "vazio";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do contato: ");
        String nomeContato = scanner.nextLine();

        boolean hasText = nomeContato.length() != 0;
        if(!hasText) nomeContato = NOME_VAZIO;

        Contato contato = new Contato(nomeContato);

        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(ui[0].equals("add")){
                String label = ui[1];
                String numero = ui[2];

                //método que diz se numero é válido aqui
                Fone fone = new Fone(label, numero);
                contato.addFone(fone);
            }
            else if(ui[0].equals("rm")){
                int index = Integer.parseInt(ui[1]);
                contato.rmFone(index);

            }
            else if(ui[0].equals("update")){


            }
            else{
                System.out.println("fail: comando invalido!");
            }
        }

    }
}
