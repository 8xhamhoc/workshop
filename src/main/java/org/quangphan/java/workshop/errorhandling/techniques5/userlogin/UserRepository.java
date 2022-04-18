package org.quangphan.java.workshop.errorhandling.techniques5.userlogin;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static Map<String, User> users = new HashMap<>();

    static {
        users.put("user1", new User("user1", HashUtils.encode("12345"), "IT"));
        users.put("user2", new User("user2", HashUtils.encode("22345"), "Accountant"));
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
