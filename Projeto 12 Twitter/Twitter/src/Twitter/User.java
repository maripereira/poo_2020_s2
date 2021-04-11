package Twitter;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String usuario;
    private Integer tweetNaoLido;
    List<Tweet> timeline = new ArrayList<>();
    List<Tweet> meusTweets = new ArrayList<>();

    List<User> seguidores = new ArrayList<>();
    List<User> seguidos = new ArrayList<>();

    public User(String usuario){
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void seguir(User outro){
        for(User user : seguidos){
            if(user.getUsuario().equals(outro.getUsuario())){
                return;
            }
        }
        this.seguidos.add(outro);
        outro.seguidores.add(this);
    }

    public void tweetar(Tweet tweet){
        meusTweets.add(tweet);
        for(User seguidor : seguidores){
            seguidor.tweetNaoLido++;
            seguidor.timeline.add(tweet);
        }
        this.timeline.add(tweet);
    }

    public void darLike(int idTweet){
        for(Tweet tweet : timeline){
            if(tweet.getId() == idTweet){
                tweet.darLike(this.usuario);
            }
        }
    }

    public void lerTimeline(){
        for(Tweet tweet : timeline){
            System.out.println(tweet);
        }
        this.tweetNaoLido = 0;
    }

    public String toString(){
        String saida1 = "[ ";
        for(User user : seguidos){
            saida1 += user.getUsuario() + " ";
        }
        String seguidos = saida1 + "]";
        String saida2 = "[ ";
        for(User user : seguidores){
            saida2 += user.getUsuario() + " ";
        }
        String seguidores = saida2 + "]";
        return this.usuario + "\nseguidos " + seguidos + "\nseguidores " + seguidores;
    }
}
