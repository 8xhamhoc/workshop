package org.quangphan.java.workshop.errorhandling.technique4;

import org.quangphan.java.workshop.errorhandling.exception.InvalidCardStatus;

import java.util.HashMap;
import java.util.Map;

public class CardService {

    private static final Map<String, Card> cards = new HashMap<>();

    static {
        cards.put("123456789", new Card("123456789", CardStatus.ACTIVE));
        cards.put("123456788", new Card("123456788", CardStatus.BLOCKED));
        cards.put("123456787", new Card("123456787", CardStatus.EXPIRED));
    }

    public Card getCard(String serialNumber) {
        return cards.get(serialNumber);
    }

    public void verify(Card card) {
        if (CardStatus.EXPIRED.equals(card.getStatus()) || CardStatus.BLOCKED.equals(card.getStatus())) {
            throw new InvalidCardStatus();
        }
    }
}
