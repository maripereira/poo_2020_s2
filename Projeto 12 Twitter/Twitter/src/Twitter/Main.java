package Twitter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Twitter twitter = new Twitter();
    	Scanner ler = new Scanner(System.in);

	    while(true){
	        String line = ler.nextLine();
	        String uInput[] = line.split(" ");

	        if(uInput[0].equals("end")){
	            break;
            }
	        else if(uInput[0].equals("add")){
	            twitter.addUsuario(uInput[1]);
            }
	        else if(uInput[0].equals("seguir")){
	            twitter.seguirUsuario(uInput[1], uInput[2]);
            }
	        else if(uInput[0].equals("tweetar")){
	        	String[] subarray = Arrays.copyOfRange(uInput, 2, uInput.length);
	        	String mensagem = String.join(" ", subarray);
	            twitter.tweetar(uInput[1], mensagem);
            }
	        else if(uInput[0].equals("like")){
	            twitter.darLike(uInput[1], Integer.parseInt(uInput[2]));
            }
	        else if(uInput[0].equals("timeline")){
	        	twitter.verTimeline(uInput[1]);
			}
	        else if(uInput[0].equals("show")){
	        	twitter.mostrarUsuarios();
			}
	        else{
                System.out.println("Digite um comando valido");
            }
        }
    }
}
