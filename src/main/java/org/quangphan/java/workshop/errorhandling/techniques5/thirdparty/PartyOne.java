package org.quangphan.java.workshop.errorhandling.techniques5.thirdparty;

import org.quangphan.java.workshop.errorhandling.exception.InvalidPasswordException;
import org.quangphan.java.workshop.errorhandling.exception.InvalidUsernameException;
import org.quangphan.java.workshop.errorhandling.exception.PasswordNotMatchException;
import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;
import org.quangphan.java.workshop.errorhandling.technique1.solution.UserStatus;
import org.quangphan.java.workshop.errorhandling.techniques5.userlogin.HashUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PartyOne {

    private static Map<String, UserOne> users = new HashMap<>();

    static {
        users.put("user1", new UserOne("user1", HashUtils.encode("12345")));
        users.put("user2", new UserOne("user2", HashUtils.encode("12346")));
    }

    public String jwtToken(String username, String password) {
        if (username == null || "".equals(username)) {
            throw new InvalidUsernameException();
        }
        if (password == null || "".equals(password)) {
            throw new InvalidPasswordException();
        }

        UserOne userTwo = users.get(username);
        if (userTwo == null) {
            throw new UserNotFoundException();
        }

        if (!userTwo.getPassword().equals(HashUtils.encode(password))) {
            throw new PasswordNotMatchException();
        }

        return UUID.randomUUID().toString().concat("-").concat(userTwo.getUsername());
    }
}
