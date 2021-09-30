/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;
/**
 *
 * @author ibai Arriola , jon  Mayo
 */
public class ModelFact {
    private ResourceBundle fichero;
    private String opcion;
    private final String FILE_TYPE="file";
    public ModelInterface getModel(){     
        ModelInterface model; 
        this.fichero = ResourceBundle.getBundle("main.ViewModelConfig");
        this.opcion = fichero.getString("Model");

        if(opcion.equalsIgnoreCase(FILE_TYPE)){
            model= new FileModelImplementation();
        }else {
            model = new BDModelImplementation();
        }

        return model;
    }
      }
      

