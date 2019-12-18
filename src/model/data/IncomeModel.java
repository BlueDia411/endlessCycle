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
import utilities.DatabaseUtilities;

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
            ResultSet rs = state.executeQuery("SELECT * FROM mahasiswa");
            incList = new ArrayList<>();
            while (rs.next()) {
                Income inc = new Income();
                inc.setJml_income(Integer.valueOf(rs.getString("jm;_incom")));
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
            PreparedStatement stat = conn.prepareStatement("INSERT INTO mahasiswa values(?,?,?)");
            stat.setInt(1, inc.getJml_income());
            stat.setString(2, inc.getKet_income());
            stat.setString(3, inc.getTgl_income());
            return stat.executeUpdate();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
