package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 *
 * @author ibai Arriola , jon  Mayo
 */
public class BDModelImplementation implements ModelInterface {
    private Connection con;
    private PreparedStatement stmt;
    private Statement stmt1;
    // fichero config.properties
    private ResourceBundle configFile;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String contraBD;
    //////sentencia SQL
    

    private final String lectura = "SELECT * FROM saludo";

    public BDModelImplementation() {
        this.configFile = ResourceBundle.getBundle("model.BdConfig");
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
    public String getGreetings() {
        String saludo=null;
        ResultSet rs = null;
        this.openConnection();

        try {
            //stmt = con.prepareStatement(lectura);
            stmt1= con.createStatement();
            
            rs = stmt1.executeQuery(lectura);

            while (rs.next()) {
                saludo = (rs.getString(1));
            }
        } catch (SQLException e1) {
            // System.out.println("ERROR en busqueda SQL");
            e1.printStackTrace();
        }
        // se CIERRA RS
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // System.out.println("ERROR cierre RS");
                e.printStackTrace();
            }
        }
        try {
            this.closeConnection();
        } catch (SQLException e) {
            // System.out.println("Error en cierre SQL");
            e.printStackTrace();
        }
        return saludo;
    }
}
