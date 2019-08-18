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
public class JefeBodega extends Usuario implements IAdministrador {
    
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
    
    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    public Ruta crearRutaEntrega(LinkedList<Entrega> e){
        Ruta ruta = new Ruta(e);
        return ruta;
    }
    
    public void asignarRepartidor(Queue<Repartidor> cola, Ruta ruta) {
        while (!cola.isEmpty()) {
            Repartidor r = cola.poll();
            if (r.isDisponible) {
                r.setRutaDeEntrega(ruta);
            }
        }
    }

    @Override
    public void asignarAdministrador(Usuario u) {
        System.out.println("El jefe de bodega es administrador");
    }
    
    
}
