package org.quangphan.java.workshop.errorhandling.technique2;

import java.time.Instant;

public class Ticket {

    private Instant startTime;
    private String movie;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
}
