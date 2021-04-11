package Twitter;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

    List<User> users = new ArrayList<>();

    public void addUsuario(String username){
        User user = new User(username);
        users.add(user);
    }

    public void mostrarUsuarios(){
        for(User user : users){
            System.out.println(user + "\n");
        }
    }

    public User retornarUsuarios(String nome){
        for(User user: users){
            if(user.getUsuario().equals(nome)){
                return user;
            }
        }
        return null;
    }

    public void seguirUsuario(String nome, String nome2){
        for(User user : users){
            if(user.getUsuario().equals(nome)){
                user.seguir(retornarUsuarios(nome2));
            }
        }
    }

    public void tweetar(String nome, String mensagem){
        retornarUsuarios(nome).tweetar(new Tweet(nome, mensagem));
    }

    public void verTimeline(String nome){
        retornarUsuarios(nome).lerTimeline();
    }

    public void darLike(String nome, int idTweet){
        retornarUsuarios(nome).darLike(idTweet);
    }
}
