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
public class Income {
    private int jml_income;
    private String ket_income;
    private String tgl_income;
    
    public void createKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ketemu");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubes", "root", "");
            System.out.println("Koneksi berhasil");

            Statement statement = conn.createStatement();
            String sql ="INSERT INTO tubes.income (jml_income, ket_income, tgl_income) VALUES ('"+ jml_income +"', '"+ ket_income +"', '"+ tgl_income +"')";
            statement.executeUpdate(sql);
            
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ketemu");
        } catch (SQLException ex) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the jml_income
     */
    public int getJml_income() {
        return jml_income;
    }

    /**
     * @param jml_income the jml_income to set
     */
    public void setJml_income(int jml_income) {
        this.jml_income = jml_income;
    }

    /**
     * @return the ket_income
     */
    public String getKet_income() {
        return ket_income;
    }

    /**
     * @param ket_income the ket_income to set
     */
    public void setKet_income(String ket_income) {
        this.ket_income = ket_income;
    }

    /**
     * @return the tgl_income
     */
    public String getTgl_income() {
        return tgl_income;
    }

    /**
     * @param tgl_income the tgl_income to set
     */
    public void setTgl_income(String tgl_income) {
        this.tgl_income = tgl_income;
    }
    
    public Income(int jml_income, String ket_income, String tgl_income){
        this.jml_income = jml_income;
        this.ket_income = ket_income;
        this.tgl_income = tgl_income;
    }
    
}
