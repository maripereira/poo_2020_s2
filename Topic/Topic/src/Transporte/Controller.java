package Transporte;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Topic passageiros = new Topic(0, 0);
		
		while(true) {
			String line = sc.nextLine();
			String ui[] = line.split(" ");
			
			if(ui[0].equals("end"))
				break;
			
			else if(ui[0].equals("show"))
				System.out.println(passageiros.toString());
			
			else if(ui[0].equals("initi")) {
				passageiros = new Topic(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
			}
			else if(ui[0].equals("reservar")) {
				passageiros.inserirPassageiro(new Pass(ui[1], Integer.parseInt(ui[2])));
				
			}
			else if(ui[0].equals("remover")) {
				passageiros.remover(ui[1]);
			}
			
			else
				System.out.println("fail: comando invalido!");
				
		}
		
		sc.close();
		
	}

}
