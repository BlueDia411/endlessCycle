/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.pojo.Income;
import view.IncomeFrame;

/**
 *
 * @author BlueDia
 */
public class IncomeController {
    IncomeFrame icFrame;
    
    public IncomeController(){
        icFrame = new IncomeFrame();
    }
    
    public void start(){
        icFrame.setVisible(true);
    }
    
    public static Income submitIncome(int jml_income, String ket_income, String tgl_income){
        Income inc = new Income(jml_income, ket_income, tgl_income);
        inc.createKoneksi();
        return inc;
    }
    
    
}
