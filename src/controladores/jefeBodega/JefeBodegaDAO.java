/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.jefeBodega;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelos.Entrega;
import modelos.singleton.ConexionBaseDatos;

/**
 *
 * @author jaime
 */
public class JefeBodegaDAO {
    protected ConexionBaseDatos conexion;
    
    
    public static DefaultTableModel MostrarEntregaDomicilio(){
      String[] cols= new String[]{"Direccion","Nro Venta","Nro Cliente"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        
        Connection cn = ConexionBaseDatos.getInstance();
        try{
            String sql="Select e.direccion,ed.venta,v.cliente from entregadomicilio ed inner join entrega e on ed.edid = e.entregaid"
                    + " inner join venta v on ed.venta = v.ventaid";
            PreparedStatement us=cn.prepareStatement(sql);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[3];
            while(res.next())
            {
                for(int i=0; i<3; i++){
                    
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
    
    
        public static DefaultTableModel MostrarEntregaLocal(){
      String[] cols= new String[]{"Direccion","Nro Pedido"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        
        Connection cn = ConexionBaseDatos.getInstance();
        try{
            String sql="Select e.direccion,ped.pedidoid from entrega e inner join entregalocal el  on e.entregaid = el.elid"
                    + " inner join pedidoabastecimiento ped on el.pedido = ped.pedidoid";
            PreparedStatement us=cn.prepareStatement(sql);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[2];
            while(res.next())
            {
                for(int i=0; i<2; i++){
                    
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
        
        public static DefaultTableModel buscarDom(String texto) {
        String[] cols= new String[]{"Direccion","Nro Venta","Nro Cliente"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        Connection cn = ConexionBaseDatos.getInstance();
       
        try{
           String filtro= ""+texto+"_%";
           String sql="Select e.direccion,ed.venta,v.cliente from entregadomicilio ed inner join entrega e on ed.edid = e.entregaid"
                    + " inner join venta v on ed.venta = v.ventaid where e.direccion like"+'"'+filtro+'"';
            PreparedStatement us=cn.prepareStatement(sql);
            us.setString(1, texto);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[3];
            while(res.next())
            {
                datos[0]=res.getString("direccion");
                datos[1]=res.getString("venta");
                datos[2]=res.getString("cliente");
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
        
        public static DefaultTableModel buscarlocal(String texto) {
        String[] cols= new String[]{"Direccion","Nro Pedido"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        Connection cn = ConexionBaseDatos.getInstance();
       
        try{
            String filtro= ""+texto+"_%";
           String sql="Select e.direccion,ped.pedidoid from entrega e inner join entregalocal el  on e.entregaid = el.elid"
                    + " inner join pedidoabastecimiento ped on el.pedido = ped.pedidoid where e.direccion like"+'"'+filtro+'"';
            PreparedStatement us=cn.prepareStatement(sql);
            us.setString(1, texto);
            ResultSet res=us.executeQuery();
            Object datos[]= new Object[2];
            while(res.next())
            {
                datos[0]=res.getString("direccion");
                datos[1]=res.getString("venta");
               
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
        
        
        
        
        
        public static String actualizarEntrega(Entrega entrega) {
        String result = null;
        
        Connection cn = ConexionBaseDatos.getInstance();
        PreparedStatement pst = null;
        String sql = "UPDATE entrega SET direccion=? WHERE  entregaid =?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,entrega.getDireccion());
                //pst.setString(2, clienteVo.getCliente_ID());
                //pst.setString(2, clienteVo.getRUC());
                pst.executeUpdate();
                /*
                if(clienteVo.isEstado()==1)
                    result = "Cliente Habilitado con exito, ID: " + clienteVo.getRUC();
                else if(clienteVo.isEstado()==0)
                    result= result = "Cliente Eliminado con exito, ID: " + clienteVo.getRUC();*/
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
}
