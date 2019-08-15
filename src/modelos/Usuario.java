/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jaime
 */
public class Usuario extends Empleado{
    protected String usiuario; 
    protected String password;
    protected boolean enable;
    public Usuario(String nombre, String cedula, String telefono, String direccion, double sueldo) {
        super(nombre, cedula, telefono, direccion, sueldo);
        this.usiuario="";
        this.password="";
        
    }

    public String getUsiuario() {
        return usiuario;
    }

    public void setUsiuario(String usiuario) {
        this.usiuario = usiuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    
    public void login(Usuario user){
        System.out.println("HACER LOGIN");
        
        
    }
    
    public void buscarArticulo(){
        System.out.println("Implementar... ");
       
    }
    
    
    
    
      
    
     
  
    
    
}
