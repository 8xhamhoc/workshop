package org.quangphan.java.workshop.errorhandling.technique2;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        MovieBooking movieBooking = new MovieBooking();

        String movie = "Spider man";
        Integer quantity = 0;

        List<Ticket> tickets = movieBooking.booking(movie, quantity);

        for (int i=0; i< tickets.size(); i++) {
            System.out.println("Ticket: " + (i + 1));
            System.out.println("Movie: " + tickets.get(i).getMovie());
            System.out.println("Start time: " + tickets.get(i).getStartTime());
        }

    }

}
