/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.strategy;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author Melanie Banchon
 */
public class Pago {
    
    private Currency monto;
    private MetodoPago metodoPago;
    
    public Pago(MetodoPago metodoPago){
        monto = Currency.getInstance(Locale.US);
        this.metodoPago = metodoPago;
    }

    public void generarPago(MetodoPago metodo){
        this.metodoPago.generarPago();
        
    }
    
}
