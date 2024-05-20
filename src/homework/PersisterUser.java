package homework;

public class PersisterUser implements Persister{

    public static void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
