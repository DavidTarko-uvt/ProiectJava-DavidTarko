package com.javatravel;
import java.util.ArrayList;

public class Gazda {
    ArrayList<Spatiu> spatii;

    public Gazda(ArrayList<Spatiu> spatii) {
        this.setSpatii(spatii);
    }

    public ArrayList<Spatiu> getSpatii() {
        return spatii;
    }

    public void setSpatii(ArrayList<Spatiu> spatii) {
        this.spatii = spatii;
    }
}
