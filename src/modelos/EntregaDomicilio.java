/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Melanie Banchon
 */
public class EntregaDomicilio extends Entrega {
    
    private Venta venta;
    private Cliente cliente;
    
    
    public EntregaDomicilio(String direccion) {
        super(direccion);
        this.venta=null;
        this.cliente=null;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
