/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.singleton;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melanie Banchon 
 */
public class ConexionBaseDatos {

    private static Connection conectar = null;
    private String baseconectar="jdbc:mysql://172.17.0.1:8081/proyecto_diseno2";
    private String secureSSL="?autoReconnect=true&useSSL=false";
    
    private ConexionBaseDatos(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(baseconectar+secureSSL, "root", "secret");
            System.out.println("La conexion a la base de datos ha sido exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexion");
            System.out.println(e.getMessage());
        }
        
    }
    
    public static Connection getInstance(){
        if(conectar==null){
            conectar = new ConexionBaseDatos().getConnection();
        }
        return conectar;
    }
   
    public static Connection getConnection() {
        return conectar;
    }

    public void desconectar() {
        try {
            conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
 