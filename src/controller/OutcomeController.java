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

/**
 *
 * @author BlueDia
 */
public class OutcomeController {
    
    public List<Outcome> loadOutcome() throws SQLException {
        OutcomeModel model = new OutcomeModel();
        return model.loadOutcomes();
    }
    
    public static int insert(Outcome outcome) throws SQLException{
        OutcomeModel model = new OutcomeModel();
        return model.save(outcome);
    }
    
}
