/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.EndlessCycle.EndlessCycle.model.pojo.Outcome;
import com.EndlessCycle.EndlessCycle.utilities.DatabaseUtilities;
import java.sql.Date;


/**
 *
 * @author BlueDia
 */
public class OutcomeModel {

    public List<Outcome> loadOutcomes() throws SQLException {
        List<Outcome> outList;
        Connection conn = DatabaseUtilities.getConnection();
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM outcome");
            outList = new ArrayList<>();
            while (rs.next()) {
                Outcome ouc = new Outcome();
                ouc.setJml_outcome(Integer.valueOf(rs.getString("jml_outcome")));
                ouc.setCode_outcome(Integer.valueOf(rs.getString("code_outcome")));
                ouc.setKet_outcome(rs.getString("ket_outcome"));
                ouc.setTgl_outcome(rs.getString("tgl_outcome"));

                outList.add(ouc);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return outList;
    }

    public int save(Outcome ouc) throws SQLException {
        Connection conn = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = conn.prepareStatement("INSERT INTO outcome values(?,?,?,?)");
            stat.setString(1, null);
            stat.setInt(2, ouc.getJml_outcome());
            stat.setString(3, ouc.getKet_outcome());
            stat.setString(4, ouc.getTgl_outcome());
            return stat.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public int update(Outcome ouc) throws SQLException {
        Connection conn = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = conn.prepareStatement("UPDATE outcome SET jml_outcome = ?, ket_outcome = ?, tgl_outcome = ? WHERE code_outcome = ? ");
            stat.setInt(1, ouc.getJml_outcome());
            stat.setString(2, ouc.getKet_outcome());
            stat.setDate(3, java.sql.Date.valueOf(ouc.getTgl_outcome()));
            stat.setInt(4, ouc.getCode_outcome());
            return stat.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }

        }
    }

        public int delete(Outcome ouc) throws SQLException {
         Connection conn = DatabaseUtilities.getConnection();
        try{
            PreparedStatement stat = conn.prepareStatement("DELETE FROM outcome WHERE code_outcome = ?");
            stat.setInt(1, ouc.getCode_outcome());
            return stat.executeUpdate();
        }finally{
            if (conn !=null){
                conn.close();
            }
            
        }
    }
}
