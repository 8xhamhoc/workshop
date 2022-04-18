package org.quangphan.java.workshop.errorhandling.technique1.solution;

import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;

import java.util.UUID;

public class TokenService {

    private static final UserService userService = new UserService();

    public String generateToken(String userId) {
        String result;

        try {
            User user = userService.findById(userId);
            result = UUID.randomUUID().toString().concat("-").concat(user.getUsername());
        } catch (UserNotFoundException e) {
            result = "User not found or invalid credentials";
        }

        return result;
    }

}
