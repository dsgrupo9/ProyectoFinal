/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.decorator;

import modelos.Usuario;

/**
 *
 * @author Melanie Banchon
 */
public abstract class AdministradorDecorador {
    
    protected Usuario usuarioAdministrador;
   
    
    abstract void delegarPrivilegios();
}
