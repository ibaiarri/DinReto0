/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import java.util.ResourceBundle;
import model.ModelFact;
import view.ViewFact;

/**
 *
 * @author ibai Arriola , jon  Mayo
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        
         ModelFact factory = new ModelFact() ;
         ViewFact viewFact = new ViewFact() ;
         
         Controller control = new Controller();
         control.run(viewFact.getView(), factory.getModel());
         
          
         
         
         
          
    }
    
}
