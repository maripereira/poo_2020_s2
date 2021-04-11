package Twitter;

import java.util.ArrayList;
import java.util.List;

public class Tweet {

    public static int countadorId = 0;
    private int id;
    private String usuarioTweet;
    private String mensagem;

    List<String> curtidas = new ArrayList<>();
    List<String> comentarios = new ArrayList<>();

    public Tweet(String usuarioTweet, String mensagem){
        this.usuarioTweet = usuarioTweet;
        this.mensagem = mensagem;
        this.id = countadorId;
        countadorId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void darLike(String username){
        curtidas.add(username);
    }

    public String toString(){
        String saida = "[ ";
        for(String curtidasUser : curtidas){
            saida += curtidasUser + " ";
        }
        String curtidas = saida + "]";
        return this.id + ":" + this.usuarioTweet + "( " + this.mensagem + " )" + curtidas;
    }

}
