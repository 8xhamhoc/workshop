package org.quangphan.java.workshop.errorhandling.techniques5.userlogin;

import org.quangphan.java.workshop.errorhandling.exception.PasswordNotMatchException;
import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public User findUser(String username, String password) {

        User user = userRepository.getUsers().get(username);

        if (user == null) {
            throw new UserNotFoundException();
        }

        if (!user.getPassword().equals(HashUtils.encode(password))) {
            throw new PasswordNotMatchException();
        }

        return user;
    }

}
