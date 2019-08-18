/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.decorator;

import modelos.Gerente;
import modelos.Usuario;
import modelos.IAdministrador;

/**
 *
 * @author Melanie Banchon
 */
public abstract class AdministradorDecorador implements IAdministrador{ 

   protected IAdministrador gerente;

    public AdministradorDecorador(IAdministrador gerente ){
        this.gerente = gerente;
    }
    
   @Override
   public void asignarAdministrador(Usuario u){
        this.gerente.asignarAdministrador(u);
    }
}
