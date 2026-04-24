package ads.seg;

public interface UserRepository {
    public void save(User user);
    public void update(User user,String senha);
    public User findByLogin(String login);
}
