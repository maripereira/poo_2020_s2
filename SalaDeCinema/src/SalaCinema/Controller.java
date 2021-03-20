package SalaCinema;

import java.util.Scanner;

public class Controller {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cinema sala = new Cinema(0);
		
		while(true) {
			String line = sc.nextLine();
			String[] ui = line.split(" ");
			if(ui[0].equals("end"))
				break;
			else if(ui[0].equals("initi"))
				sala = new Cinema(Integer.parseInt(ui[1]));
			else if(ui[0].equals("show"))
				System.out.println(sala.toString());
			else if(ui[0].equals("cancelar"))
				sala.cancelar(ui[1]);
			else if(ui[0].equals("reservar"))
				sala.reservar(ui[1], ui[2], Integer.parseInt(ui[3]));
			else
				System.out.println("fail: comando invalido!");
		}
		sc.close();
	}
	
}
