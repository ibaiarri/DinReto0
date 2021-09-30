/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ibai Arriola , jon  Mayo
 */
public class ViewtextImplentation implements ViewInterface{
    /**
     * 
     * @param saludo es el mensaje que se va a mostrar
     */
    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
    
    
    
}
