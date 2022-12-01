import gender.Gender;
import impl.UserServiceImpl;
import model.MyExseption;
import model.User;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.userdiKoshuu(new User(1, "Bova", 18, Gender.JENSRYI));
        userService.userdiKoshuu(new User(2, "Banya", 29, Gender.MUJSKOI));
        userService.userdiKoshuu(new User(3, "Olya", 19, Gender.MUJSKOI));

        try {
            userService.idMenenTabuu(1);
            userService.idMenenOchuu(2);
        } catch (MyExseption myExseption) {
            System.out.println(myExseption.getMessage());
        }

        userService.baardykUserlerdiAluu();

    }
}