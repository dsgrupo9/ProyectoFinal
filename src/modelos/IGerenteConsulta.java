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
public interface IGerenteConsulta {
    Usuario consultarUsuario();
    Entrega consultarEnvio();
    Producto consultarProducto();
    Venta consultarVenta();
    
    
  
    
}
