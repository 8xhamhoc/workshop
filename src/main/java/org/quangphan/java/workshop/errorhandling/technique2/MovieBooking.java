package org.quangphan.java.workshop.errorhandling.technique2;

import org.quangphan.java.workshop.errorhandling.exception.InvalidQuantityException;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MovieBooking {

    public List<Ticket> booking(String movie, Integer quantity) {

        if (quantity <= 0) {
            throw new InvalidQuantityException();
        }

        List<Ticket> tickets = new ArrayList<>();
        Instant instant = Instant.now();

        for (int i=0; i< quantity; i++) {
            Ticket ticket = new Ticket();
            ticket.setMovie(movie);
            ticket.setStartTime(instant);
            tickets.add(ticket);
        }

        return tickets;
    }

}
