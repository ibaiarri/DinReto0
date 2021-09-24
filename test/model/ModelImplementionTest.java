/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author 2dam
 */
public class ModelImplementionTest {
  
    @Test  
    public void testGetGreeting() {
        
        //Create object for testing
       BDModelImplementation m = new BDModelImplementation();
        //Call getGreeting methot  
       m.getGreetings();
        //Assert that greeting is what is supposed to be
        //assertEquals("Los datos del archivo no salen correctamente",,);
    }
}
