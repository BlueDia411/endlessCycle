/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.data.OutcomeModel;
import model.pojo.Outcome;
//import view.OutcomeFrame;

/**
 *
 * @author BlueDia
 */
public class OutcomeController {
//    OutcomeFrame outFrame;
//    
//    public OutcomeController(){
//        outFrame = new OutcomeFrame();
//    }
//    
//    public void start(){
//        outFrame.setVisible(true);
//    }
    
    public List<Outcome> loadOutcome() throws SQLException {
        OutcomeModel model = new OutcomeModel();
        return model.loadOutcomes();
    }
    
    public static Outcome submitOutcome(int jml_outcome, String ket_outcome, String tgl_outcome){
        Outcome Out = new Outcome(jml_outcome, ket_outcome, tgl_outcome);
        return Out;
    }
    
}
