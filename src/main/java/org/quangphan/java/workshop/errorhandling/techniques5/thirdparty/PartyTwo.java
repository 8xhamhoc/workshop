package org.quangphan.java.workshop.errorhandling.techniques5.thirdparty;

import org.quangphan.java.workshop.errorhandling.exception.*;
import org.quangphan.java.workshop.errorhandling.techniques5.userlogin.HashUtils;
import org.quangphan.java.workshop.errorhandling.techniques5.userlogin.UserStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PartyTwo {

    private static Map<String, UserTwo> users = new HashMap<>();

    static {
        users.put("user1", new UserTwo("user1", HashUtils.encode("12345"), UserStatus.ACTIVE));
        users.put("user2", new UserTwo("user2", HashUtils.encode("12345"), UserStatus.DELETE));
    }

    public String jwtToken(String username, String password) {
        if (username == null || "".equals(username)) {
            throw new InvalidUsernameException();
        }
        if (password == null || "".equals(password)) {
            throw new InvalidPasswordException();
        }

        UserTwo userTwo = users.get(username);
        if (userTwo == null) {
            throw new UserNotFoundException();
        }

        if (!userTwo.getPassword().equals(HashUtils.encode(password))) {
            throw new PasswordNotMatchException();
        }

        if (UserStatus.DELETE.equals(userTwo.getStatus())) {
            throw new InvalidUserStatusException();
        }

        return UUID.randomUUID().toString().concat("-").concat(userTwo.getUsername());
    }

}
