package com.javatravel;

import java.util.ArrayList;

public class Program {
    ArrayList<Gazda> gazde;
    ArrayList<Chirias> chiriasi;
    double comision;

    public Program(ArrayList<Gazda> gazde, ArrayList<Chirias> chiriasi, double comision) {
        this.setGazde(gazde);
        this.setChiriasi(chiriasi);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public ArrayList<Gazda> getGazde() {
        return gazde;
    }

    public void setGazde(ArrayList<Gazda> gazde) {
        this.gazde = gazde;
    }

    public ArrayList<Chirias> getChiriasi() {
        return chiriasi;
    }

    public void setChiriasi(ArrayList<Chirias> chiriasi) {
        this.chiriasi = chiriasi;
    }
}
