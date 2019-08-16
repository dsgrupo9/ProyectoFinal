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
public abstract class MetodoPago {
 
    protected Pago pago;
    
    abstract void generarPago();
    
}
