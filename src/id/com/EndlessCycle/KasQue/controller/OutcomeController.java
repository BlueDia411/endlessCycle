/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.com.EndlessCycle.KasQue.controller;

import java.sql.SQLException;
import java.util.List;
import id.com.EndlessCycle.KasQue.model.data.OutcomeModel;
import id.com.EndlessCycle.KasQue.model.pojo.Outcome;


/**
 *
 * @author BlueDia
 */
public class OutcomeController {
    
    public List<Outcome> loadOutcome() throws SQLException {
        OutcomeModel model = new OutcomeModel();
        return model.loadOutcomes();
    }
    
    public int insert(Outcome outcome) throws SQLException{
        OutcomeModel model = new OutcomeModel();
        return model.save(outcome);
    }
    
    public int update(Outcome outcome) throws SQLException {
        OutcomeModel model = new OutcomeModel();
        return model.update(outcome);
    }
    
    public int delete(Outcome outcome) throws SQLException{
        OutcomeModel model = new OutcomeModel();
        return model.delete(outcome);
    }

    
    
}
