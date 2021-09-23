/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author ibail
 */
public class ModelImplemention implements ModelInterface {

    private Connection con;
    private PreparedStatement stmt;
    // fichero config.properties
    private ResourceBundle configFile;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String contraBD;

    public ModelImplemention() {
        this.configFile = ResourceBundle.getBundle("logic.config");
        this.driverBD = configFile.getString("driver");
        this.urlBD = configFile.getString("con");
        this.userBD = configFile.getString("DBUSER");
        this.contraBD = configFile.getString("DBPASS");
    }

    private void openConnection() {
        try {
            con = DriverManager.getConnection(this.urlBD, this.userBD, this.contraBD);
        } catch (SQLException e) {
            // System.out.println("Error al intentar abrir la BD");
        }
    }

    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

    @Override
    public void getGreetings() {
            File f = new File("Greetings.txt");
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(f));
            String linea;
            while (entrada.ready()) {
                linea = entrada.readLine();
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
            } catch (IOException e1) {
            }
        }
    }

}

