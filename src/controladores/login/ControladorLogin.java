/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelos.singleton.ConexionBaseDatos;
import vistas.Gerente.VGerente;
import vistas.jefebodega.VJefeBodega;
import vistas.local.VLocales;

/**
 *
 * @author Melanie Banchon
 */

public class ControladorLogin {
    
    protected static Connection cn = ConexionBaseDatos.getInstance();
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    VJefeBodega vistajefe = new VJefeBodega();
    VGerente vistaGerente = new VGerente();
    VLocales vistaLocales = new VLocales();
    private boolean isAdmin;

    public boolean isIsAdmin() {
        return isAdmin;
    }
    
    public void buscarUsuarioLogin(String usuario, String contrasena) {
        
        String cargo="";
        
        try{
        sql="Select u.username,u.passwrd from, u.cargo, u.isadminis from usuario u Where u.username = '"+ usuario +"'&& u.passwrd= '"+ contrasena +"' ";
        sentencia_preparada = cn.prepareStatement(sql);
        resultado = sentencia_preparada.executeQuery();
        
        if(resultado.next()){
            usuario = resultado.getString("username");
            contrasena = resultado.getString("passwrd");
            cargo = resultado.getString("cargo");
            isAdmin=resultado.getBoolean("isadminis");
            
            if(cargo.equalsIgnoreCase("jefe bodega")){
                vistajefe.setVisible(true);
            }
            else if(cargo.equalsIgnoreCase("gerente")){
                vistaGerente.setVisible(true);
                vistaLocales.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Implementacion en construccion");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no existente");
        }
        }catch(Exception e){
            
        }
        
    }
    
    
    
} 
