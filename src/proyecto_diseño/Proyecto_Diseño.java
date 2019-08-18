/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_diseño;

import modelos.IAdministrador;
import modelos.JefeBodega;
import modelos.Usuario;
import modelos.Vendedor;
import modelos.decorator.UsuarioAdministrador;
import modelos.singleton.ConexionBaseDatos;

/**
 *
 * @author jaime
 */
public class Proyecto_Diseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //original
        //ConexionBaseDatos.getInstance();
        
        
        Usuario u = new Usuario("jaime", "123", "123", "2", 12.32);
        
        IAdministrador igerente = (IAdministrador) new Vendedor("jaime","123","123","2",12.32);
        
        IAdministrador usuarioAdministrador = new UsuarioAdministrador(igerente);
        usuarioAdministrador.asignarAdministrador(u);
        
        IAdministrador i2gerente = (IAdministrador) new JefeBodega("lester","123","123","2",12.32);
        IAdministrador usuarioAdministradorjefe = new UsuarioAdministrador(i2gerente);
        usuarioAdministradorjefe.asignarAdministrador(u);
        
        
    }
    
}
