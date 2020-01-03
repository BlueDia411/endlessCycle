/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EndlessCycle.EndlessCycle.main;

import com.EndlessCycle.EndlessCycle.controller.IncomeController;
import java.sql.SQLException;
import com.EndlessCycle.EndlessCycle.view.HomeFrame;

/**
 *
 * @author BlueDia
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        new HomeFrame().setVisible(true);
        
    }
}
