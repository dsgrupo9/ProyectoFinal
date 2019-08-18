/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jaime
 */
public class Vendedor extends Usuario implements IAdministrador{
    
    protected Localidad localidad;
    protected boolean enable;
    
    public Vendedor(String nombre, String cedula, String telefono, String direccion, double sueldo) {
        super(nombre, cedula, telefono, direccion, sueldo);
        this.localidad=null;
        this.enable=true;
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
    
    
    public boolean agregarCliente(Cliente c){
        return false;
        
    }
    public boolean editarCliente(Cliente c){
        return false;
    }
    public void realizarCotizacion(){
        System.out.println("Cotizacion");
        
    }
    public void editarCotizacion(){
        System.out.println("Cotizacion editada");
    }
    public void realizarVenta(){
        System.out.println("Realizar Venta");
        
        
    }
    public void consultarEntregaDomicilio(){
        System.out.println("Domicilio");
    }
    
    public void emitirDocumento(Documento docu){
        System.out.println("Documento ");
    }

    @Override
    public void asignarAdministrador(Usuario u) {
        System.out.println("El Vendedor es administrador");
    }
    
}
