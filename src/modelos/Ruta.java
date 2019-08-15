/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.LinkedList;

/**
 *
 * @author jaime
 */
class Ruta {
    private LinkedList<Entrega> rutas;
    private boolean enable; 

    public Ruta(LinkedList<Entrega> rutas) {
        this.rutas = rutas;
        this.enable = enable;
        
    }
    
     public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public LinkedList<Entrega> getRutas() {
        return rutas;
    }

    public void setRutas(LinkedList<Entrega> rutas) {
        this.rutas = rutas;
    }
    
}
