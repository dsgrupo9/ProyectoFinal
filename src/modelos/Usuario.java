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
    
    protected String usuario; 
    protected String password;
    protected int isAdmin;
    protected boolean enable;
    
    public Usuario(String nombre, String cedula, String telefono, String direccion, double sueldo) {
        super(nombre, cedula, telefono, direccion, sueldo);
        this.usuario="";
        this.password="";
        this.isAdmin=0;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        System.out.println("aqui debemos hacer la conexion a la base ,");
        
        
    }
    
    public void buscarArticulo(){
        System.out.println("Implementar... ");
        System.out.println("Los controladores lo tienen implementado ");
       
    }

    public int isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
    
    
      
    
     
  
    
    
}
