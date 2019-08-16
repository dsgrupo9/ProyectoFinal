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
public class Gerente extends Usuario implements IGerenteConsulta {
    
    protected Localidad localidad;
    protected boolean enable;
    
    public Gerente(String nombre, String cedula, String telefono, String direccion, double sueldo) {
        super(nombre, cedula, telefono, direccion, sueldo);
        this.enable=true;
        this.localidad=null;
    }
    
    
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    
    

    public void consultarUsuario() {
        System.out.println("Implentacion en construccion");
    }

    public void consultarEnvio() {
        System.out.println("Implentacion en construccion");
    }

    public void consultarProducto() {
        System.out.println("Implentacion en construccion");
    }

    public void consultarVenta() {
        System.out.println("Implentacion en construccion");
    }
    
    public void asginarAdministrador(Usuario u){
        System.out.println("Admin "+ u.usuario);
        
    }
    
    
    
    
}
