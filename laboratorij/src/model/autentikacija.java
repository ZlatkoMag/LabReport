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
public class autentikacija {
    
    private String korisnickoIme;
    private String lozinka;
    private String vrstaKorisnika;

    

    public String getVrstaKorisnika() {
        return vrstaKorisnika;
    }

    public void setVrstaKorisnika(String vrstaKorisnika) {
        this.vrstaKorisnika = vrstaKorisnika;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public autentikacija(String korisnickoIme, String lozinka,String vrstaKorisnika) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.vrstaKorisnika = vrstaKorisnika;
    }
    public autentikacija() {
       
    }
    
}
