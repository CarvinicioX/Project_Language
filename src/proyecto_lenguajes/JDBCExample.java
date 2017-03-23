/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lenguajes;

/**
 *
 * @author carviniciox
 */
//STEP 1. Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JDBCExample {

    private Connection connection = null;

    public void establishConnection() {
        if (connection != null) {
            return;
        }
        String URL = "Jdbc:postgresql://localhost:5432/lenguajes/Contact";
        String USER = "postgres";
        String PASS = "postgres";
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Creates Connection");
            if (connection != null) {
                System.out.println("Connecting to database...");
            }
        } catch (Exception e) {
//            System.out.println("Problem when connecting to the database 1");
            e.printStackTrace();
        }
    }

    public ResultSet giveName() {
        ResultSet rs = null;
        Statement s = null;
        try {
            s = connection.createStatement();

            rs = s.executeQuery("SELECT * FROM Contact");
        } catch (Exception e) {
//            System.out.println("Problem in searching the database 1");
            e.printStackTrace();
        }
        return rs;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
//            System.out.println("Problem to close the connection to the database");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        JDBCExample x = new JDBCExample();
        ResultSet rs = null;
        String string = "";
        x.establishConnection();
        rs = x.giveName();
        try {
            while (rs.next()) {
                string += rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "\n";
            }
            JOptionPane.showMessageDialog(null, string, "authors", 1);
        } catch (Exception e) {
//            System.out.println("Problem when printing the database.");
            e.printStackTrace();
        }
        x.closeConnection();
    }

}
