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
public class Cliente extends Persona {
    
    protected String ruc;
    protected boolean credito; 
    protected boolean enable;
    
    public Cliente(String nombre, String cedula, String telefono, String direccion) {
        super(nombre, cedula, telefono, direccion);
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
    
    
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
}
