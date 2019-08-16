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
public class Empleado extends Persona {
    
    protected double sueldo; 
    protected boolean enable;
    

    public Empleado(String nombre, String cedula, String telefono, String direccion,double sueldo) {
        super(nombre, cedula, telefono, direccion);
        this.sueldo=sueldo;
        this.enable=true;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public boolean isEnable() {
        return enable;
    }

    /**
     *
     * @param enable
     */
    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}
