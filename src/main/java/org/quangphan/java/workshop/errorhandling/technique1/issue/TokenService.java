package org.quangphan.java.workshop.errorhandling.technique1.issue;

import java.util.UUID;

public class TokenService {

    private static final UserService userService = new UserService();

    public String generateToken(String userId) {
        String result;

        User user = userService.findById(userId);

        if (user != null) {
            if (UserStatus.DELETED.equals(user.getStatus())) {
                result = "User not found or invalid credentials";
            } else {
                result = UUID.randomUUID().toString().concat("-").concat(user.getUsername());
            }
        } else {
            result = "User not found or invalid credentials";
        }

        return result;
    }

}
