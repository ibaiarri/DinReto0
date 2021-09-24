/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ResourceBundle;

/**
 *
 * @author ibai arriola  y jon mayo 
 */
public class FileModelImplementation implements ModelInterface{
  
    private ResourceBundle fichero;
    private String saludo;
    
    @Override
    public String getGreetings() {
            this.fichero = ResourceBundle.getBundle("model.SaludoFich");
            this.saludo= fichero.getString("saludo");
            return saludo;
    }
}
