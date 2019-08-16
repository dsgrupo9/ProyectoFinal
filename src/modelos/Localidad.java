/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.LinkedList;

/**
 *
 * @author  Melanie Banchon
 */
public class Localidad {

    private String tipoLocalidad;
    private String lugar;
    private LinkedList<Empleado> listaEmpleados;
    private LinkedList<Producto> listaProductos;
    
    public Localidad(String tipoLocalidad, String lugar){
        this.tipoLocalidad = tipoLocalidad;
        this.lugar = lugar;
        listaEmpleados= new LinkedList();
        listaProductos= new LinkedList();
        
    }
    
    public PeticionAbastecimiento crearPedidoAbastecimiento(int cantidad, Localidad local, LinkedList<Producto> lproductos){
        PeticionAbastecimiento pedido = new PeticionAbastecimiento(cantidad, local, lproductos);
        return pedido;
    }

    public String getTipoLocalidad() {
        return tipoLocalidad;
    }

    public void setTipoLocalidad(String tipoLocalidad) {
        this.tipoLocalidad = tipoLocalidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LinkedList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
}
