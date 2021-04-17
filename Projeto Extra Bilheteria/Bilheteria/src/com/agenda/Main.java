package com.agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();
        while(true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(ui[0].equals("$addPessoa")) {
                if(ui[2].equals("meia"))
                    bilheteria.addPessoa(ui[1], true);
                else
                    bilheteria.addPessoa(ui[1], false);
            } else if (ui[0].equals("$pessoas")) {
                bilheteria.showPessoas();
            } else if (ui[0].equals("$addEvento")) {
                bilheteria.addEvento(ui[1]);
            } else if (ui[0].equals("$addSetor")) {
                bilheteria.addSetor(ui[1], ui[2], Double.parseDouble(ui[2]), Integer.parseInt(ui[3]));
            }else if (ui[0].equals("$eventos")) {
               bilheteria.showEventos();
            }else if (ui[0].equals("$vender")) {
                bilheteria.vender(ui[1], ui[2], ui[3]);
            } else if (ui[0].equals("$vendas")) {
                bilheteria.showVendas();
            } else {
                System.out.println("Comando inválido!");
            }
        }
    }
}
