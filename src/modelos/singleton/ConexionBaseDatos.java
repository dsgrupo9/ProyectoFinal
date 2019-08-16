/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.singleton;

import modelos.*;

/**
 *
 * @author Melanie Banchon 
 */
public class ConexionBaseDatos {
    
    private static ConexionBaseDatos instance;
    
    private ConexionBaseDatos(){
        
    }
    
    public static ConexionBaseDatos getInstance(){
        if(instance==null){
            instance = new ConexionBaseDatos();
        }
        return instance;
    }
    
    public void conectar(){
        System.out.println("Conectado a la base");
    }
    
}
