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
 
    private int cantidad;
    private Localidad local;
    private LinkedList<Producto> listaProductos;
    
    
    public PeticionAbastecimiento(int cantidad, Localidad local, LinkedList<Producto> listaProductos){
        this.cantidad = cantidad;
        this.local = local;
        this.listaProductos = listaProductos;
    }
    
}
