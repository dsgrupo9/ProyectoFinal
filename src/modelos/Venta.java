/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.LinkedList;

/**
 *
 * @author jaime
 */
public class Venta {
    
    private static int idVenta;
    private LinkedList<Producto> productos;
    private float total;
    private boolean isDomicilio; 
    private Cliente cliente;
    private boolean enable; 

    public Venta(LinkedList<Producto> productos, float total, boolean isDomicilio, Cliente cliente) {
        this.productos = productos;
        this.total = total;
        this.isDomicilio = isDomicilio;
        this.cliente = cliente;
        this.enable=true;
    }
    
    public static int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
     public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isIsDomicilio() {
        return isDomicilio;
    }

    public void setIsDomicilio(boolean isDomicilio) {
        this.isDomicilio = isDomicilio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean addProductoaVenta(Producto p){
        return true ;
    }
    
    public boolean removeProducto (Producto P){
        return false; 
        
    }
    public Factura generarFactura(){
        return null;
    }
    
    
    
}
