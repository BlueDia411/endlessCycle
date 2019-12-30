/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.data.IncomeModel;
import model.pojo.Income;
//import view.IncomeFrame;

/**
 *
 * @author BlueDia
 */
public class IncomeController {
//
//    IncomeFrame icFrame;
//
//    public IncomeController() {
//        icFrame = new IncomeFrame();
//    }
//
//    public void start() {
//        icFrame.setVisible(true);
//    }

    public List<Income> loadIncome() throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.loadIncomes();
    }

    public int insert(Income income) throws SQLException {
        IncomeModel model = new IncomeModel();
        return model.save(income);
    }

}
