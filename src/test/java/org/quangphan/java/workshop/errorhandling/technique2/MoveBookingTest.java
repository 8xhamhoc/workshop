package org.quangphan.java.workshop.errorhandling.technique2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.quangphan.java.workshop.errorhandling.exception.InvalidQuantityException;

import java.util.List;

public class MoveBookingTest {


    @Test
    void test1() {
        MovieBooking movieBooking = new MovieBooking();
        List<Ticket> tickets = movieBooking.booking("Iron man", 2);
        Assertions.assertEquals(2, tickets.size());
    }

    @Test
    void test2() {
        MovieBooking movieBooking = new MovieBooking();
        Assertions.assertThrows(InvalidQuantityException.class, () -> movieBooking.booking("Iron man", 0));
    }

}
