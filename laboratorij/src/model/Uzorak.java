/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Zlatko
 */
public class Uzorak {
    
    int sifraU;
    String nazivU;
    Date datumUz;
    String mjestoUz;
    int sifraD;
    int sifraK;
    Date pocetakA;
    Date zavrsetakA;
    Time vrijemeUz;

    public Uzorak(String nazivU, String mjestoU, Date datumU, Time vrijemeU, Date pocetakA, Date zavrsetakA, int sifraK, int sifraD) {
        
    }

    public int getSifraU() {
        return sifraU;
    }

    public void setSifraU(int sifraU) {
        this.sifraU = sifraU;
    }

    public String getNazivU() {
        return nazivU;
    }

    public void setNazivU(String nazivU) {
        this.nazivU = nazivU;
    }

    public Date getDatumUz() {
        return datumUz;
    }

    public void setDatumUz(Date datumUz) {
        this.datumUz = datumUz;
    }

    public String getMjestoUz() {
        return mjestoUz;
    }

    public void setMjestoUz(String mjestoUz) {
        this.mjestoUz = mjestoUz;
    }

    public int getSifraD() {
        return sifraD;
    }

    public void setSifraD(int sifraD) {
        this.sifraD = sifraD;
    }

    public int getSifraK() {
        return sifraK;
    }

    public void setSifraK(int sifraK) {
        this.sifraK = sifraK;
    }

    public Date getPocetakA() {
        return pocetakA;
    }

    public void setPocetakA(Date pocetakA) {
        this.pocetakA = pocetakA;
    }

    public Date getZavrsetakA() {
        return zavrsetakA;
    }

    public void setZavrsetakA(Date zavrsetakA) {
        this.zavrsetakA = zavrsetakA;
    }

    public Time getVrijemeUz() {
        return vrijemeUz;
    }

    public void setVrijemeUz(Time vrijemeUz) {
        this.vrijemeUz = vrijemeUz;
    }

    public Uzorak(String nazivU, Date datumUz, String mjestoUz, int sifraD, int sifraK, Date pocetakA, Date zavrsetakA, Time vrijemeUz) {
        
        this.nazivU = nazivU;
        this.datumUz = datumUz;
        this.mjestoUz = mjestoUz;
        this.sifraD = sifraD;
        this.sifraK = sifraK;
        this.pocetakA = pocetakA;
        this.zavrsetakA = zavrsetakA;
        this.vrijemeUz = vrijemeUz;
    }
    
    public Uzorak() {
        
    }
    
}
