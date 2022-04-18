package org.quangphan.java.workshop.errorhandling.techniques5.thirdparty;

import org.quangphan.java.workshop.errorhandling.techniques5.userlogin.UserStatus;

public class UserTwo {

    private String username;
    private String password;
    private UserStatus status;

    public UserTwo(String username, String password, UserStatus status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
