package com.javatravel;

import java.util.ArrayList;

public class Chirias {
    ArrayList<Rezervare> rezervari;

    public Chirias(ArrayList<Rezervare> rezervari) {
        this.setRezervari(rezervari);
    }

    public ArrayList<Rezervare> getRezervari() {
        return rezervari;
    }

    public void setRezervari(ArrayList<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }
}
