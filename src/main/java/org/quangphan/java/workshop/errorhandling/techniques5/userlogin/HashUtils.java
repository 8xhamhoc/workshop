package org.quangphan.java.workshop.errorhandling.techniques5.userlogin;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class HashUtils {

    public static String encode(String value) {
        String empty = "";
        if (value == null || value.equals(empty)) {
            return empty;
        }

        return Hashing.sha256().hashString(value, StandardCharsets.UTF_8).toString();
    }

}
