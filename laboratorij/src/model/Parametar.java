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
public class Parametar {
    
    int sifraP;
    String nazivP;
    String mjernaJ;
    String mdk;

    public int getSifraP() {
        return sifraP;
    }

    public void setSifraP(int sifraP) {
        this.sifraP = sifraP;
    }

    public String getNazivP() {
        return nazivP;
    }

    public void setNazivP(String nazivP) {
        this.nazivP = nazivP;
    }

    public String getMjernaJ() {
        return mjernaJ;
    }

    public void setMjernaJ(String mjernaJ) {
        this.mjernaJ = mjernaJ;
    }

    public String getMdk() {
        return mdk;
    }

    public void setMdk(String mdk) {
        this.mdk = mdk;
    }

    public Parametar(int sifraP, String nazivP, String mjernaJ, String mdk) {
        this.sifraP = sifraP;
        this.nazivP = nazivP;
        this.mjernaJ = mjernaJ;
        this.mdk = mdk;
    }
    public Parametar() {
        
    }
}
