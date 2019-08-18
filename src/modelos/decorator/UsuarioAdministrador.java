/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.decorator;

import modelos.Gerente;
import modelos.Producto;
import modelos.Usuario;
import modelos.IAdministrador;

/**
 *
 * @author Melanie Banchon
 */
public class UsuarioAdministrador extends AdministradorDecorador{

    public UsuarioAdministrador(IAdministrador gerente){
        super(gerente);
    }
    
    @Override
    public void asignarAdministrador(Usuario u) {
        gerente.asignarAdministrador(u);
    }
   
   
    public void ingresarStocks(Producto p){
        
    }
    
    public void actualizarStocks(){
        
    }
    
    public void ingresarPreciosVenta(){
        
    }

   
    //Usuario u = new Usuario()...
    //IGerenteConsulta igerente = new Vendedor()
    //IGerenteConsulta usuarioAdministrador=new UusuarioAdministrador(igerente);
    //usuarioAdministrador.asignarAdministrador(u);

}
