package Conexiones;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    static Connection contacto = null;

    public static Connection getConexion(String user, String pass) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=HaciendaMagdalena";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion: \n" + e.getMessage(), "Error  de conexion", JOptionPane.ERROR_MESSAGE);
        }
        try {
            contacto = DriverManager.getConnection(url, user, pass);
            System.out.println("Ingreso Exitoso");
        } catch (SQLException e) {
        }
        return contacto;
    }

    ///INGRESO DE LOGIN
    public String ingLogin(String user, String pass) {
        Statement declara;
        String valCon = "";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=HaciendaMagdalena";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.print("Error 1: \n" + e.getMessage());
        }
        try {
            contacto = DriverManager.getConnection(url, "userAc", "userAc");
            declara = contacto.createStatement();
            ResultSet respuesta = declara.executeQuery("exec prodLogin @Login='" + user + "',@Pass='" + pass + "'");
            ResultSetMetaData rsmd = respuesta.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (respuesta.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    valCon = respuesta.getString(i);
                }
            }
            System.out.print("\nvalcon   " + valCon);
        } catch (SQLException e) {
            System.out.print("Error 2: " + e.getMessage());
        }
        return valCon;
    }

    //Consulta (ResultSet
    public static ResultSet Consulta(String consulta) {
        Connection con = getConexion("userAc", "userAc");
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Erro de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ArrayList<ArrayList> ConsultaMatriz(Connection conec, String sql) {
        ArrayList<ArrayList> comp = new ArrayList<>();
        try {
            ResultSet query = conec.createStatement().executeQuery(sql);
            ResultSetMetaData rsmd = query.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            String valCon;
            while (query.next()) {
                ArrayList<String> aux = new ArrayList<>();
                for (int i = 1; i <= columnsNumber; i++) {
                    valCon = query.getString(i);
                    aux.add(valCon);
                }
                comp.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comp;
    }

//INSERCION 
    public void insert(String consulta) {
        Connection con = getConexion("userAc", "userAc");
        Statement declara;
        try {
            declara = con.createStatement();
            declara.executeUpdate(consulta);
        } catch (SQLException e) {
            System.out.print("Error" + e.getMessage());

        }

    }

}
