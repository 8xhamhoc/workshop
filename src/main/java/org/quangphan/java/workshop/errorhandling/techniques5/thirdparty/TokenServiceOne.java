package org.quangphan.java.workshop.errorhandling.techniques5.thirdparty;

import org.quangphan.java.workshop.errorhandling.exception.*;

public class TokenServiceOne implements TokenService {

    private PartyOne partyOne = new PartyOne();

    public String getToken(String username, String password) {
        try {
            return partyOne.jwtToken(username, password);
        } catch (UserNotFoundException
                | PasswordNotMatchException
                | InvalidUsernameException
                | InvalidPasswordException e) {
            throw new InvalidCredentialsException();
        }
    }
}
