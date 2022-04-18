package org.quangphan.java.workshop.errorhandling.technique4;

public class Card {

    private String serialNumber;
    private CardStatus status;

    public Card(String serialNumber, CardStatus status) {
        this.serialNumber = serialNumber;
        this.status = status;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }
}
