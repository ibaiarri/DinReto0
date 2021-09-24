/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author ibail
 */
public class ModelFact {
    private ResourceBundle fichero;
    private String opcion;
    private final String FILE_TYPE="terminal";
    public ModelInterface getModel(){     
        ModelInterface model; 
        this.fichero = ResourceBundle.getBundle("main.ViewModelConfig");
        this.opcion = fichero.getString("View");

        if(opcion.equalsIgnoreCase(FILE_TYPE)){
            model= new FileModelImplementation();
        }else {
           model = new BDModelImplementation();
        }

        return model;
    }
      }
      

