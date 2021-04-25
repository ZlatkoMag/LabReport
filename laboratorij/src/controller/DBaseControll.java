/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;
import model.Klijent;
import model.djelatnik;
import model.Parametar;
import model.Rezultat;
import model.Uzorak;
//import controller.Konekcija;

/**
 *
 * @author Zlatko
 */
public class DBaseControll {

    public static void spremiDjelatnikaUBazu(djelatnik djelatnik) {
        Connection conn = null;
        PreparedStatement stmt;

        try {

            conn = Konekcija.konekcija();
            System.out.println("konekcija uspostavljena");

            stmt = conn.prepareStatement("INSERT INTO `laboratorij`.`djelatnik` (`nazivD`, `OIB`)" + "VALUES (?,?);");

            stmt.setString(1, djelatnik.getNaziv());
            stmt.setString(2, String.valueOf(djelatnik.getOIB()));

            System.out.println("konekcija 2");

            stmt.execute();

            System.out.println("podaci djelatnika poslani");
        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<djelatnik> ucitajDjelatnika() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<djelatnik> listaDjelatnika = new ArrayList<djelatnik>();

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
       // stmt = conn.createStatement();
        stmt = conn.prepareStatement("SELECT * FROM djelatnik");
        System.out.println("ucitaj djelatnika 1");
        ResultSet rs = stmt.executeQuery();
System.out.println("ucitaj djelatnika 2");
        while (rs.next()) {

            int sifra = rs.getInt("idDjelatnika");
            String naziv = rs.getString("nazivD");
            long oib = rs.getLong("OIB");
            System.out.println(sifra);
            System.out.println(oib);
            System.out.println(naziv);
            djelatnik djelatnik = new djelatnik();
            djelatnik.setSifraD(sifra);
            djelatnik.setNaziv(naziv);
            djelatnik.setOIB(oib);

            listaDjelatnika.add(djelatnik);System.out.println("ucitaj djelatnika 3");
        }
        return listaDjelatnika;

    }

    public static void izmjeniDjelatnikaUBazi(djelatnik djelatnik) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {

            stmt = conn.prepareStatement("UPDATE `laboratorij`.`djelatnik` SET `nazivD`=?, `OIB`=? WHERE `idDjelatnika`=?;");

            stmt.setString(1, djelatnik.getNaziv());
            stmt.setString(2, String.valueOf(djelatnik.getOIB()));
            stmt.setString(3, String.valueOf(djelatnik.getSifraD()));
            stmt.executeUpdate();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void izbrisiDjelatnikaUBazi(djelatnik djelatnik) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {

            stmt = conn.prepareStatement("DELETE FROM `laboratorij`.`djelatnik` WHERE `idDjelatnika`=?;");
            System.out.println("konekcija 1");
            stmt.setString(1, String.valueOf(djelatnik.getSifraD()));
            stmt.executeUpdate();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void izmjeniKlijentaUBazi(Klijent klijent) {
        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement("UPDATE `laboratorij`.`klijenti` SET `nazivK`=?,`adresaK`=?,`OIB`=?,`grad`=?,`pBroj`=? WHERE `idKlijenta`=?;");

            stmt.setString(1, klijent.getNaziv());
            stmt.setString(2, klijent.getAdresa());
            stmt.setString(3, String.valueOf(klijent.getOIBK()));
            stmt.setString(4, klijent.getGrad());
            stmt.setString(5, String.valueOf(klijent.getpBroj()));
            stmt.setString(6, String.valueOf(klijent.getSifraK()));

            stmt.execute();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Klijent> ucitajKlijenta() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Klijent> listaKlijenata = new ArrayList<Klijent>();

        Connection conn = null;
        Statement stmt;
        conn = Konekcija.konekcija();
        stmt = conn.createStatement();
        String sql = "SELECT * FROM klijenti";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            int sifra = rs.getInt("idKlijenta");
            String naziv = rs.getString("nazivK");
            String adresa = rs.getString("adresaK");
            long oib = rs.getLong("OIB");
            String grad = rs.getString("grad");
            int pBroj = rs.getInt("pBroj");

            Klijent klijent = new Klijent();
            klijent.setSifraK(sifra);
            klijent.setNaziv(naziv);
            klijent.setAdresa(adresa);
            klijent.setOIBK(oib);
            klijent.setGrad(grad);
            klijent.setpBroj(pBroj);

            listaKlijenata.add(klijent);
        }

        return listaKlijenata;
    }

    public static void spremiKlijentaUBazu(Klijent klijent) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();

        try {
            stmt = conn.prepareStatement(" INSERT INTO `laboratorij`.`klijenti` (`nazivK`,`adresaK`,`OIB`,`grad`,`pBroj`)" + "VALUES(?,?,?,?,?)");

            stmt.setString(1, klijent.getNaziv());
            stmt.setString(2, klijent.getAdresa());
            stmt.setString(3, String.valueOf(klijent.getOIBK()));
            stmt.setString(4, klijent.getGrad());
            stmt.setString(5, String.valueOf(klijent.getpBroj()));
            stmt.execute();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void spremiParametarUBazu(Parametar parametar) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement(" INSERT INTO `laboratorij`.`parametar` (`nazivP`,`mjJed`,`mdk`)" + "VALUES(?,?,?)");

            stmt.setString(1, parametar.getNazivP());
            stmt.setString(2, parametar.getMjernaJ());
            stmt.setString(3, parametar.getMdk());

            stmt.execute();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Parametar> ucitajParametar() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Parametar> listaParametara = new ArrayList<Parametar>();

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        stmt = conn.prepareStatement("SELECT * FROM parametar");

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            int sifra = rs.getInt("idParam");
            String naziv = rs.getString("nazivP");
            String mjernaJ = rs.getString("mjJed");
            String mdk = rs.getString("mdk");

            Parametar parametar = new Parametar();

            parametar.setSifraP(sifra);
            parametar.setNazivP(naziv);
            parametar.setMjernaJ(mjernaJ);
            parametar.setMdk(mdk);

            listaParametara.add(parametar);
        }
        return listaParametara;
    }

    public static void izmjeniParametarUBazi(Parametar parametar) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement("UPDATE `laboratorij`.`parametar` SET `nazivP`=?,`mjJed`=?,`mdk`=? WHERE `idParam`=?;");

            stmt.setString(1, parametar.getNazivP());
            stmt.setString(2, parametar.getMjernaJ());
            stmt.setString(3, parametar.getMdk());
            stmt.setString(4, String.valueOf(parametar.getSifraP()));
            stmt.execute();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void spremiUzorakUBazu(Uzorak uzorak) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement(" INSERT INTO `laboratorij`.`uzorak` (`nazivU`,`datumU`,`mjestoU`,`idDjelatnika`,`idklijenta`,`pocetakA`,`zavrsetakA`,`vrijemeU`)" + "VALUES(?,?,?,?,?,?,?,?)");

            stmt.setString(1, uzorak.getNazivU());
            stmt.setDate(2, (Date) uzorak.getDatumUz());
            stmt.setString(3, uzorak.getMjestoUz());
            stmt.setString(4, String.valueOf(uzorak.getSifraD()));
            stmt.setString(5, String.valueOf(uzorak.getSifraK()));
            stmt.setDate(6, (Date) uzorak.getPocetakA());
            stmt.setDate(7, (Date) uzorak.getZavrsetakA());
            stmt.setTime(8, (Time) uzorak.getVrijemeUz());

            stmt.execute();

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void spremiRezultatUBazu(Rezultat rezultat) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement(" INSERT INTO `laboratorij`.`rezultat` (`idParam`,`idUzorak`)" + "VALUES(?,?);");
            stmt.setInt(1, rezultat.getSifraP());
            stmt.setInt(2, rezultat.getSifraU());
            stmt.execute();
            System.out.println("ovo su podaci poslani za rezultat-baza");
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Unijeli ste već označene parametre, možete dodati samo neoznačene!!" + "/n (" + ex.getMessage() + ")");
        }
    }

    public static void spremiVrijednostRezultatUBazu(Rezultat rezultat) {

        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();
        try {
            stmt = conn.prepareStatement("UPDATE `laboratorij`.`rezultat` SET `vrijednostR`=? WHERE `idUzorak`=? and `idParam`=?;");
            stmt.setString(1, String.valueOf(rezultat.getVrijdnostR()));
            stmt.setString(2, String.valueOf(rezultat.getSifraU()));
            stmt.setString(3, String.valueOf(rezultat.getSifraP()));
            stmt.execute();
            System.out.println("podaci klijenta poslani");
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaseControll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Uzorak> ucitajSveUzorke() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Uzorak> listaUzoraka = new ArrayList<Uzorak>();
        Connection conn = null;
        PreparedStatement stmt;
        conn = Konekcija.konekcija();

        stmt = conn.prepareStatement("SELECT * FROM uzorak");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            int sifra = rs.getInt("idUzorka");

            Uzorak uzorak = new Uzorak();

            uzorak.setSifraU(sifra);

            listaUzoraka.add(uzorak);
        }
        return listaUzoraka;
    }

}
