/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.com.EndlessCycle.KasQue.main;

import id.com.EndlessCycle.KasQue.controller.IncomeController;
import id.com.EndlessCycle.KasQue.controller.OutcomeController;
import java.sql.SQLException;
import id.com.EndlessCycle.KasQue.view.HomeFrame;

/**
 *
 * @author BlueDia
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        new HomeFrame().setVisible(true);
        
    }
}
