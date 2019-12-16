/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlueDia
 */
public class Outcome {
    private int jml_outcome;
    private String ket_outcome;
    private String tgl_outcome;
    
    public void createKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ketemu");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubes", "root", "");
            System.out.println("Koneksi berhasil");

            Statement statement = conn.createStatement();
            String sql ="INSERT INTO tubes.outcome (jml_outcome, ket_outcome, tgl_outcome) VALUES ('"+ jml_outcome +"', '"+ ket_outcome +"', '"+ tgl_outcome +"')";
            statement.executeUpdate(sql);
            
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ketemu");
        } catch (SQLException ex) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the jml_outcome
     */
    public int getJml_outcome() {
        return jml_outcome;
    }

    /**
     * @param jml_outcome the jml_outcome to set
     */
    public void setJml_outcome(int jml_outcome) {
        this.jml_outcome = jml_outcome;
    }

    /**
     * @return the ket_outcome
     */
    public String getKet_outcome() {
        return ket_outcome;
    }

    /**
     * @param ket_outcome the ket_outcome to set
     */
    public void setKet_outcome(String ket_outcome) {
        this.ket_outcome = ket_outcome;
    }

    /**
     * @return the tgl_outcome
     */
    public String getTgl_outcome() {
        return tgl_outcome;
    }

    /**
     * @param tgl_outcome the tgl_outcome to set
     */
    public void setTgl_outcome(String tgl_outcomecome) {
        this.tgl_outcome = tgl_outcome;
    }
    
    public Outcome(int jml_outcome, String ket_outcome, String tgl_outcome){
        this.jml_outcome = jml_outcome;
        this.ket_outcome = ket_outcome;
        this.tgl_outcome = tgl_outcome;
    }
}
