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
public class Producto {
    private String nombre;
    private int id;
    private boolean isBodega;
    private boolean enable;

    public Producto(String nombre, int id, boolean isBodega) {
        this.nombre = nombre;
        this.id = id;
        this.isBodega = isBodega;
        this.enable=true;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsBodega() {
        return isBodega;
    }

    public void setIsBodega(boolean isBodega) {
        this.isBodega = isBodega;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    
    
    
}
