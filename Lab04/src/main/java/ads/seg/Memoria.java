package ads.seg;

import java.util.ArrayList;
import java.util.List;

public class Memoria implements UserRepository {
    public List<User> memoria = new ArrayList<>();

    @Override
    public void save(User user) {
        memoria.add(user);
    }

    @Override
    public void update(User user, String senha) {
        user = findByLogin(user.getLogin());
        user.setSenha(senha);
    }

    @Override
    public User findByLogin(String login) {
        for (User user : memoria){
            if (user.getLogin().equals(login)) return user;
        }
        return null;
    }
}
