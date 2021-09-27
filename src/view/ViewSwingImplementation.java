/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class ViewSwingImplementation  implements ViewInterface{

    @Override
    public void showGreeting(String tipo) {
        JOptionPane.showMessageDialog(null,tipo);
    }
    
}
