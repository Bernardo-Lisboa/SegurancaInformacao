package ads.seg;

public class UserService {

    public UserRepository repository;
    public String algoritmo;

    public UserService(UserRepository repository, String algoritmo){
        this.repository=repository;
        this.algoritmo=algoritmo;
    }
    public void register(String login, String senha){
        User achou = repository.findByLogin(login);
        if (achou == null){
            return;
        }


        repository.save(new User(login,senha));
    }
    public void updatePassword(User user, String newPassword){
        repository.update(user,newPassword);
    }
    public void authenticate(User user){

    }
}
