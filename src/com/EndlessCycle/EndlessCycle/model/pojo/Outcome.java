/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.model.pojo;

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

   
    private int code_outcome;
    private int jml_outcome;
    private String ket_outcome;
    private String tgl_outcome;

    /**
     * @return the jml_outcome
     */
    public int getJml_outcome() {
        return jml_outcome;
    }
     public int getCode_outcome() {
        return code_outcome;
    }

    public void setCode_outcome(int code_outcome) {
        this.code_outcome = code_outcome;
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
    public void setTgl_outcome(String tgl_outcome) {
        this.tgl_outcome = tgl_outcome;
    }
    
    public Outcome(int jml_outcome, String ket_outcome, String tgl_outcome, int code_outcome){
        this.jml_outcome = jml_outcome;
        this.ket_outcome = ket_outcome;
        this.tgl_outcome = tgl_outcome;
        this.code_outcome = code_outcome;
    }
    
    public Outcome() {

    }
}
