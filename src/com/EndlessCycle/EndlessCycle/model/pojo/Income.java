/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.model.pojo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.EndlessCycle.EndlessCycle.model.pojo.Income;

/**
 *
 * @author BlueDia
 */
public class Income {

    private int code_income;
    private int jml_income;
    private String ket_income;
    private String tgl_income;

    
    public Income() {

    }
    
     public Income(int jml_income,  String ket_income, String tgl_income, int code_income) {
        this.code_income = code_income; 
        this.jml_income = jml_income;
        this.ket_income = ket_income;
        this.tgl_income = tgl_income;
    }
    /**
     * @return the jml_income
     */
    public int getJml_income() {
        return jml_income;
    }
    
    public void setKode_Income(int code_income) {
        this.code_income = code_income;
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

    public void setCode_income(int code_income) {
        this.code_income = code_income;
    }

    public int getCode_income() {
        return code_income;
    }

}
