package org.quangphan.java.workshop.errorhandling.techniques5.thirdparty;

import org.quangphan.java.workshop.errorhandling.exception.*;

public class TokenServiceTwo implements TokenService {

    private PartyTwo partyTwo = new PartyTwo();

    @Override
    public String getToken(String username, String password) {
        try {
            return partyTwo.jwtToken(username, password);
        } catch (UserNotFoundException
                | PasswordNotMatchException
                | InvalidUsernameException
                | InvalidPasswordException
                | InvalidUserStatusException e) {
            throw new InvalidCredentialsException();
        }
    }
}
