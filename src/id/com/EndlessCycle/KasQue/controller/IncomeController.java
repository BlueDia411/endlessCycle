/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.com.EndlessCycle.KasQue.controller;

import java.sql.SQLException;
import java.util.List;
import id.com.EndlessCycle.KasQue.model.data.IncomeModel;
import id.com.EndlessCycle.KasQue.model.pojo.Income;




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
