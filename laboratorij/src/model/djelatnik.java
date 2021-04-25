/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zlatko
 */
public class djelatnik {
    String naziv;
    long OIB;
    int sifraD;

    public djelatnik() {
        
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public long getOIB() {
        return OIB;
    }

    public void setOIB(long OIB) {
        this.OIB = OIB;
    }

    public int getSifraD() {
        return sifraD;
    }

    public void setSifraD(int sifraD) {
        this.sifraD = sifraD;
    }

    public djelatnik(String naziv, long OIB) {
        this.naziv = naziv;
        this.OIB = OIB;
        
    }
    
}
