/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.gerente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelos.singleton.ConexionBaseDatos;
import vistas.Gerente.AsignarAdmin;
import vistas.jefebodega.VEntregas;

/**
 *
 * @author jaime
 */
public class ControladorGerente {
     protected static Connection cn = ConexionBaseDatos.getInstance();
    public static DefaultTableModel MostrarUsuarios(){
      String[] cols= new String[]{"Usuario","Nombre","Cargo","Localidad"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        
        
        try{//añadir a la base en la tabla usuario el cargo de empleado y poner locaclidad en empleado
            String sql="Select u.username,p.nombre,u.cargo,l.descripcion from usuario u  inner join empleado e on e.empleadoid = u.empleadoid"
                    + "inner join localidad l on e.localidad =l.localid inner join persona p on e.personaid = p.personaid";
            PreparedStatement us=cn.prepareStatement(sql);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[4];
            while(res.next())
            {
                for(int i=0; i<4; i++){
                    
                    datos[i]=res.getObject(i+1);
                }
                modelo.addRow(datos);
            }
 
            res.close();
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
        return modelo;
    }
    
            
        public static void buscarusuario(String texto) {
         String[] cols= new String[]{"Usuario","Nombre","Cargo","Localidad"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        
       
        try{
           String filtro= ""+texto+"_%";
           String sql="Select u.username,p.nombre,u.cargo,l.descripcion from usuario u  inner join empleado e on e.empleadoid = u.empleadoid"
                    + " inner join localidad l on e.localidad =l.localid inner join persona p on e.personaid = p.personaid where u.username like"+'"'+filtro+'"';
            PreparedStatement us=cn.prepareStatement(sql);
            us.setString(1, texto);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[4];
            while(res.next())
            {
                datos[0]=res.getString("username");
                datos[1]=res.getString("nombre");
                datos[2]=res.getString("cargo");
                datos[3]=res.getString("descripcicon");
                
                modelo.addRow(datos);
            }
            AsignarAdmin.gettUsuarios().setModel(modelo);
            res.close();
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
        //return modelo;
     
        
    }
    
    
    
    
    
    
}
