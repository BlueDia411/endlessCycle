/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BlueDia
 */
public class DatabaseUtilities {
        public static Connection getConnection(){
        return getConnection("jdbc:mysql://localhost/tubes", "root", "");
    }
    
    private static Connection getConnection(String url, String user, String Pass){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, Pass);
        } catch(ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;  
    }
}
