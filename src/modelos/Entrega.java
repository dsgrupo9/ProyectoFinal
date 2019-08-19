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
public class Entrega {
    //De aqui debemos heredar las entregas , realcionarlas con lo que queda , creo que debemos corregir algo , mañana hay que hablarlo
    private static int idEntrega;
    private String direccion; 
    private boolean isExitosa;
    private boolean enable; 

    public Entrega(String direccion) {
        this.direccion = direccion;
        this.isExitosa = false;
        this.enable=true;
        
    }

     public static int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isIsExitosa() {
        return isExitosa;
    }

    public void setIsExitosa(boolean isExitosa) {
        this.isExitosa = isExitosa;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    
}
