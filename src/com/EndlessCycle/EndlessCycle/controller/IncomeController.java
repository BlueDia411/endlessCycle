/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.controller;

import java.sql.SQLException;
import java.util.List;
import com.EndlessCycle.EndlessCycle.model.data.IncomeModel;
import com.EndlessCycle.EndlessCycle.model.pojo.Income;




public class IncomeController {

    public List<Income> loadIncome() throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.loadIncomes();
    }

    public int insert(Income income) throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.save(income);
    }
    
    public int update(Income income) throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.update(income);
    }

    public int delete(Income income) throws SQLException{
        IncomeModel model = new IncomeModel();
        return model.delete(income);
    }

}
