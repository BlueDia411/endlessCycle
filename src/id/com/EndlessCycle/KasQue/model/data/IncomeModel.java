/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.com.EndlessCycle.KasQue.model.data;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import id.com.EndlessCycle.KasQue.model.pojo.Income;
import id.com.EndlessCycle.KasQue.utilities.DatabaseUtilities;

/**
 *
 * @author BlueDia
 */
public class IncomeModel {

    public List<Income> loadIncomes() throws SQLException {
        List<Income> incList;
        Connection conn = DatabaseUtilities.getConnection();
        try {
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM income");
            incList = new ArrayList<>();
            while (rs.next()) {
                Income inc = new Income();
                inc.setCode_income(Integer.valueOf(rs.getString("code_income")));
                inc.setJml_income(Integer.valueOf(rs.getString("jml_income")));
                inc.setKet_income(rs.getString("ket_income"));
                inc.setTgl_income(rs.getString("tgl_income"));

                incList.add(inc);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return incList;
    }

    public int save(Income inc) throws SQLException {
        Connection conn = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = conn.prepareStatement("INSERT INTO income values(?,?,?,?)");
            stat.setString(1, null);
            stat.setInt(2, inc.getJml_income());
            stat.setString(3, inc.getKet_income());
            stat.setString(4, inc.getTgl_income());
            return stat.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public int update(Income inc) throws SQLException {
        Connection conn = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = conn.prepareStatement("UPDATE income SET jml_income =?, ket_income =?, tgl_income =? WHERE code_income = ?");
            stat.setInt(1, inc.getJml_income());
            stat.setString(2, inc.getKet_income());
            stat.setDate(3, java.sql.Date.valueOf(inc.getTgl_income()));
            stat.setInt(4, inc.getCode_income());
            return stat.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }

        }
    }

        public int delete(Income inc) throws SQLException {
         Connection conn = DatabaseUtilities.getConnection();
        try{
            PreparedStatement stat = conn.prepareStatement("DELETE FROM income WHERE code_income = ?");
            stat.setInt(1, inc.getCode_income());
            return stat.executeUpdate();
        }finally{
            if (conn !=null){
                conn.close();
            }
            
        }
    }
}
