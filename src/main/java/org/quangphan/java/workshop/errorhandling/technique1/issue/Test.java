package org.quangphan.java.workshop.errorhandling.technique1.issue;

public class Test {

    public static void main(String[] args) {

        TokenService tokenService = new TokenService();

        String id = "2";
        String result = tokenService.generateToken(id);
        System.out.println("Result: " + result);

    }

}
