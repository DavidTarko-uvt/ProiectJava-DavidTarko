package com.javatravel;

public class Spatiu {
    String oras;
    String adresa;
    int numar_paturi;
    double pret_noapte;

    public Spatiu(String oras, String adresa, int numar_paturi, double pret_noapte) {
        this.setOras(oras);
        this.setAdresa(adresa);
        this.numar_paturi = numar_paturi;
        this.pret_noapte = pret_noapte;
    }

    public int getNumar_paturi() {
        return numar_paturi;
    }

    public void setNumar_paturi(int numar_paturi) {
        this.numar_paturi = numar_paturi;
    }

    public double getPret_noapte() {
        return pret_noapte;
    }

    public void setPret_noapte(double pret_noapte) {
        this.pret_noapte = pret_noapte;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
