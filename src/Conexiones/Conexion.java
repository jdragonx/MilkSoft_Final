package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.logging.Logger.global;
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
            JOptionPane.showMessageDialog(null, "Error 1: \n" + e.getMessage(), "Error  de conexion", JOptionPane.ERROR_MESSAGE);

        }

        try {
            contacto = DriverManager.getConnection(url, "userAc", "userAc");
            declara = contacto.createStatement();
          ResultSet respuesta = declara.executeQuery("exec prodLogin @Login='" + user + "',@Pass='" + pass + "'");

  
            
               ResultSetMetaData rsmd = respuesta.getMetaData();

   int columnsNumber = rsmd.getColumnCount();
   while (respuesta.next()) {
       for (int i = 1; i <= columnsNumber; i++) {
           if (i > 1) 
           valCon = respuesta.getString(i);

       }
   }
              // .getPassword().toString();
            System.out.print("\nvalcon   "+valCon);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error 2: " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);

        }
        return valCon;
    }

    //Consulta (ResultSet
    public static ResultSet Consulta(String consulta) {

        Connection con = getConexion("user", "osopolar");
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

//INSERCION 
    public void insert(String consulta, String user, String pass) {

        Connection con = getConexion(user, pass);
        Statement declara;
        try {
            declara = con.createStatement();
            declara.executeUpdate(consulta);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Erro de conexion", JOptionPane.ERROR_MESSAGE);

        }

    }

}
