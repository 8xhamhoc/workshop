package org.quangphan.java.workshop.errorhandling.techniques5.userlogin;

import lombok.extern.slf4j.Slf4j;
import org.quangphan.java.workshop.errorhandling.exception.PasswordNotMatchException;
import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;

@Slf4j
public class LoginService {

    private UserService userService = new UserService();

    public User login(String username, String password) {

        try {
            User user = userService.findUser(username, password);
            return user;
        } catch (UserNotFoundException e) {
            throw e;
        } catch (PasswordNotMatchException e) {
            throw e;
        }
    }

}

