/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zlatko
 */
public class Konekcija {
    
    private static String url = "localhost";
    private static String baza = "laboratorij";
    private static String user1 = "root";
    private static String pass1 = "11";
    private static Connection conn = null;
    
    
    
    public static Connection konekcija(){
        
            
        try {    
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            conn=DriverManager.getConnection("jdbc:mysql://"+url+"/"+baza,user1,pass1);
            
            
            
           
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    
}

    
}