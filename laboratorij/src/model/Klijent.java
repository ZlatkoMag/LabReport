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
public class Klijent {
    
    int sifraK;
    String naziv;
    long OIBK;
    String adresa;
    String grad;
    int pBroj;

    public int getSifraK() {
        return sifraK;
    }

    public void setSifraK(int sifraK) {
        this.sifraK = sifraK;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public long getOIBK() {
        return OIBK;
    }

    public void setOIBK(long OIBK) {
        this.OIBK = OIBK;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getpBroj() {
        return pBroj;
    }

    public void setpBroj(int pBroj) {
        this.pBroj = pBroj;
    }

    public Klijent(/*int sifraK,*/ String naziv, long OIBK, String adresa, String grad, int pBroj) {
        //this.sifraK = sifraK;
        this.naziv = naziv;
        this.OIBK = OIBK;
        this.adresa = adresa;
        this.grad = grad;
        this.pBroj = pBroj;
    }
    
    public Klijent(){}
    
}
