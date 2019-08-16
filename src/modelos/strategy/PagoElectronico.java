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
public class PagoElectronico extends MetodoPago{

    private String metodo="";
    
    @Override
    void generarPago() {
        System.out.println("Se genero el pago electronico por: "+ metodo);
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    
}
