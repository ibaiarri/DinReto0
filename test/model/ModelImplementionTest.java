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
 * @author Ibai Arriola  Y Jon Mayo */
public class ModelImplementionTest {
  /**
   *  estas 2 pruebas demuestran el correcto funcionamiento de los  metodo getGreetings.
   * - una ellas obtiene datos de una base de datos
   * - otra obtiene datos de un ficheros
   */
    @Test  
    public void testGetGreetingFILE() {  
        //Create object for testing
       FileModelImplementation m = new FileModelImplementation();
        //Call getGreeting methot  
       m.getGreetings();
        //Assert that greeting is what is supposed to be
      assertEquals("Este saludo corre a cuenta del fichero",m.getGreetings());
    }
    
    @Test
     public void testGetGreetingBD() {  
        //Create object for testing
       BDModelImplementation m = new BDModelImplementation();
        //Call getGreeting methot  
       m.getGreetings();
        //Assert that greeting is what is supposed to be
      assertEquals("Este Hola viene de una base de datos",m.getGreetings());
    }
    
    
}
