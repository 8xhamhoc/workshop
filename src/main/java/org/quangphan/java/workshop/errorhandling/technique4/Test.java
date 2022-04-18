package org.quangphan.java.workshop.errorhandling.technique4;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        String serialNumber = "123456788";

        String result = paymentService.payment(serialNumber, BigDecimal.valueOf(5));

        System.out.println("Result: " + result);

    }

}
