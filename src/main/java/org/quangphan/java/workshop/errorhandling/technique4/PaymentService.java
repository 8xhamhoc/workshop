package org.quangphan.java.workshop.errorhandling.technique4;

import java.math.BigDecimal;

public class PaymentService {

    private static final CardService cardService = new CardService();

    public String payment(String serialNumber, BigDecimal amount) {
        Card card = cardService.getCard(serialNumber);
        cardService.verify(card);
        return "Success";
    }

}
