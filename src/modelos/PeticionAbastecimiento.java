/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.LinkedList;

/**
 *
 * @author Melanie Banchon
 */
public class PeticionAbastecimiento {
 
   
    private static int idPeticionAbast;
    private int cantidad;
    private Localidad local;
    private LinkedList<Producto> listaProductos;
    
    
    public PeticionAbastecimiento(int cantidad, Localidad local, LinkedList<Producto> listaProductos){
        this.cantidad = cantidad;
        this.local = local;
        this.listaProductos = listaProductos;
    }
    
    public static int getIdPeticionAbast() {
        return idPeticionAbast;
    }

    public void setIdPeticionAbast(int idPeticionAbast) {
        this.idPeticionAbast = idPeticionAbast;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Localidad getLocal() {
        return local;
    }

    public void setLocal(Localidad local) {
        this.local = local;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
}
