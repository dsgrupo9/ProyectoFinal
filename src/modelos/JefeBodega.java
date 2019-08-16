/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jaime
 */
public class JefeBodega extends Usuario {
    
    protected Localidad localidad; 
    protected boolean enable;
    
    public JefeBodega(String nombre, String cedula, String telefono, String direccion, double sueldo) {
        super(nombre, cedula, telefono, direccion, sueldo);
        this.localidad=null;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    public Ruta crearRutaEntrega(LinkedList<Entrega> e, Queue<Repartidor> cola){
        Ruta ruta = new Ruta(e);
        while(!cola.isEmpty()){
            Repartidor r= cola.poll();
            if(r.isDisponible ){
                r.setRutaDeEntrega(ruta);
            }
        }
        return ruta;
    }
    
    //    public void asignarRepartidor(Queue<Repartidor> cola, Ruta ruta){
//        while(!cola.isEmpty()){
//            Repartidor r= cola.poll();
//            if(r.isDisponible){
//                r.setRutaDeEntrega(ruta);
//            }
//        }
//    }
    
    
}
