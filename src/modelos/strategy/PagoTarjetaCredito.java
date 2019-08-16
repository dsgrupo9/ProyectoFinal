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
public class PagoTarjetaCredito extends MetodoPago{

    private boolean tipoTarjeta;
    private double cantidad =0;
    
    @Override
    void generarPago() {
        System.out.println("Se genero el pago por tajeta de credito con un monto de: "+ cantidad);
    }

    public boolean isTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(boolean tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
