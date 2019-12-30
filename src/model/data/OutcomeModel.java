/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.pojo.Income;
import model.pojo.Outcome;
import utilities.DatabaseUtilities;

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
    
    public int delete(Outcome ouc) throws SQLException{
         Connection con = DatabaseUtilities.getConnection();
          try{
          PreparedStatement stat = con.prepareStatement("DELETE FROM outcome WHERE jml_outcome ='"  + ouc.getJml_outcome()+ "'");
          return stat.executeUpdate();
     
          }finally{
              if(con != null){
                  con.close();
              }
          }
     }
}
