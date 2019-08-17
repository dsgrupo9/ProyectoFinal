/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.jcraft.jsch.*;
import java.util.Properties;
import modelos.*;

/**
 *
 * @author Melanie Banchon 
 */
public class ConexionBaseDatos {
    
    private static Connection conectar = null;
    public static Session sesion = null;
    
    private ConexionBaseDatos(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ProyectoBD?useTimezone=True&serverTimezone=UTC", "meldaban", "melaBa97");
            System.out.println("CONECTÓOOOOOOOOO!!!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error");
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection getInstance(){
        if(conectar==null){
            conectar = ConexionBaseDatos.getConnection();
        }
        return conectar;
    }
    
    public static void serverConnection(){
        try{
            String usuario="meldaban";
            String contraseña="melaBa97";
            String host="127.0.0.1";
            int localport=3366;
            int remoteport=3306;
            connectionJSch(usuario,contraseña,host,localport,remoteport);    
        }catch(JSchException j){
            j.printStackTrace();
           
        }  
    }
    
     public static void connectionJSch(String SSHuser,String SSHpass,String SSHhost,int localport,int remoteport) throws JSchException{
        JSch js=new JSch();
        sesion=js.getSession(SSHuser,SSHhost,22);
        sesion.setPassword(SSHpass);
        Properties config= new Properties();
        config.put("StrictHostKeyChecking","no");
        sesion.setConfig(config);
        sesion.connect();
        sesion.setPortForwardingL(localport,SSHhost,remoteport);
        
    }
      
    
    public static boolean ValidarUsuario(String Usuario, String contraseña) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ProyectoBD?useTimezone=True&serverTimezone=UTC", Usuario, contraseña);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
   
    public static Connection getConnection() {
        return conectar;
    }

    public void desconectar() {
        conectar = null;
    }

}
 
     

