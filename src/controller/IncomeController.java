/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.data.IncomeModel;
import model.pojo.Income;


/**
 *
 * @author BlueDia
 */
public class IncomeController {

    public List<Income> loadIncome() throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.loadIncomes();
    }

    public int insert(Income income) throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.save(income);
    }
    
    public int update (Income income) throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.update(income);
    }

}
