package com.javatravel;
import java.time.LocalDate;

public class Rezervare {
    LocalDate checkin;
    LocalDate checkout;

    public Rezervare(LocalDate checkin, LocalDate checkout) {
        this.setCheckin(checkin);
        this.setCheckout(checkout);
    }
    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
