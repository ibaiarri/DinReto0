/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 *
 * @author ibai Arriola Y Jon mayo
 */
public class ViewFact {
    
    private ResourceBundle fichero;
    private String opcion;
    private final String FILE_TYPE="terminal";

    public ViewInterface getView() {
        ViewInterface view; 
        this.fichero = ResourceBundle.getBundle("main.ViewModelConfig");
        this.opcion = fichero.getString("View");

        if (opcion.equalsIgnoreCase(FILE_TYPE)) {
            view = new ViewtextImplentation();

        } else {
            view = new ViewSwingImplementation();
        }

        return view;
    }

}
