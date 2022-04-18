package org.quangphan.java.workshop.errorhandling.technique1.solution;

import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static Map<String, User> users;

    static {
        users = new HashMap<>();
        users.put("1", new User("test", UserStatus.ACTIVE));
        users.put("2", new User("vnuk", UserStatus.DELETED));
        users.put("3", new User("coffee", UserStatus.ACTIVE));
    }

    public User findById(String id) {
        User user =  users.get(id);
        if (user == null || UserStatus.DELETED.equals(user.getStatus())) {
            throw new UserNotFoundException();
        }

        return user;
    }

}
