package org.quangphan.java.workshop.errorhandling.technique1.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    private String username;
    private UserStatus status;
}
