package org.quangphan.java.workshop.errorhandling.techniques5.userlogin;

import org.quangphan.java.workshop.errorhandling.exception.PasswordNotMatchException;
import org.quangphan.java.workshop.errorhandling.exception.UserNotFoundException;

public class Test {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();

        try {
            User user = loginService.login("user3", "3333");
            System.out.println("This user is working at " + user.getDepartment() + " department");
        } catch (Exception e) {
            showError(e);
        }
    }

    private static void showError(Exception exception) {
        if (exception instanceof UserNotFoundException) {
            System.out.println("User not found");
        } else if (exception instanceof PasswordNotMatchException) {
            System.out.println("Password does not match");
        }
    }

}
