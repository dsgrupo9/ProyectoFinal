/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.strategy;

/**
 *
 * @author Melanie Banchon
 */
public class PagoEfectivo extends MetodoPago{

    private double cantidad=0;
    
    @Override
    void generarPago() {
        System.out.println("Se genero el pago en efectivo por un total de: "+cantidad);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
