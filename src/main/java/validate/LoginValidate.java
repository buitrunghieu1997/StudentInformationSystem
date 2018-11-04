package validate;

public class LoginValidate {

    public boolean loginValidate(String username, String password) {

        return !username.equals("") && !password.equals("");
    }
}
