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
public class Rezultat {
    
    int sifraR;
    int sifraU;
    int sifraP;
    String vrijdnostR;

    public Rezultat(int sifraP, int sifraU) {
        
    }

    public int getSifraR() {
        return sifraR;
    }

    public void setSifraR(int sifraR) {
        this.sifraR = sifraR;
    }

    public int getSifraU() {
        return sifraU;
    }

    public void setSifraU(int sifraU) {
        this.sifraU = sifraU;
    }

    public int getSifraP() {
        return sifraP;
    }

    public void setSifraP(int sifraP) {
        this.sifraP = sifraP;
    }

    public String getVrijdnostR() {
        return vrijdnostR;
    }

    public void setVrijdnostR(String vrijdnostR) {
        this.vrijdnostR = vrijdnostR;
    }
    
    public Rezultat(){
    
    }
}
