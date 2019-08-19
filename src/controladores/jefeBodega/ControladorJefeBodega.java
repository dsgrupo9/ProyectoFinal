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
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.table.DefaultTableModel;
import modelos.Entrega;
import modelos.Localidad;
import modelos.Persona;
import modelos.PeticionAbastecimiento;
import modelos.Repartidor;
import modelos.Venta;
import modelos.singleton.ConexionBaseDatos;
import vistas.jefebodega.VEntregas;

/**
 *
 * @author jaime
 */
public class ControladorJefeBodega {
    protected ConexionBaseDatos conexion;
    private static Queue<Repartidor> cola = new LinkedList<>() ;
    protected static Connection cn = ConexionBaseDatos.getInstance();
    
    
    public static DefaultTableModel MostrarEntregaDomicilio(){
      String[] cols= new String[]{"Direccion","Nro Venta","Nro Cliente"};
       DefaultTableModel modelo= new DefaultTableModel(null, cols);
        
        
        
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
    
    
     public static DefaultTableModel MostrarEntregaLocal() {
        String[] cols = new String[]{"Direccion", "Nro Pedido"};
        DefaultTableModel modelo = new DefaultTableModel(null, cols);

        Connection cn = ConexionBaseDatos.getInstance();
        try {
            String sql = "Select e.direccion,ped.pedidoid from entrega e inner join entregalocal el  on e.entregaid = el.elid"
                    + " inner join pedidoabastecimiento ped on el.pedido = ped.pedidoid";
            PreparedStatement us = cn.prepareStatement(sql);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[2];
            while (res.next()) {
                for (int i = 0; i < 2; i++) {

                    datos[i] = res.getObject(i + 1);
                }
                modelo.addRow(datos);
            }

            res.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
        return modelo;
    }

    public static void buscarEntegaDom(String texto) {
        String[] cols = new String[]{"Direccion", "Nro Venta", "Nro Cliente"};
        DefaultTableModel modelo = new DefaultTableModel(null, cols);

        try {
            String filtro = "" + texto + "_%";
            String sql = "Select e.direccion,ed.venta,v.cliente from entregadomicilio ed inner join entrega e on ed.edid = e.entregaid"
                    + " inner join venta v on ed.venta = v.ventaid where e.direccion like" + '"' + filtro + '"';
            PreparedStatement us = cn.prepareStatement(sql);
            us.setString(1, texto);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[3];
            while (res.next()) {
                datos[0] = res.getString("direccion");
                datos[1] = res.getString("venta");
                datos[2] = res.getString("cliente");
                modelo.addRow(datos);
            }
            VEntregas.gettDom().setModel(modelo);
            res.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
        //return modelo;


    }
        
    public static void buscarEntregaLocal(String texto) {
        String[] cols = new String[]{"Direccion", "Nro Pedido"};
        DefaultTableModel modelo = new DefaultTableModel(null, cols);

        try {
            String filtro = "" + texto + "_%";
            String sql = "Select e.direccion,ped.pedidoid from entrega e inner join entregalocal el  on e.entregaid = el.elid"
                    + " inner join pedidoabastecimiento ped on el.pedido = ped.pedidoid where e.direccion like" + '"' + filtro + '"';
            PreparedStatement us = cn.prepareStatement(sql);
            //us.setString(1, texto);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[2];
            while (res.next()) {
                datos[0] = res.getString("direccion");
                datos[1] = res.getString("venta");

                modelo.addRow(datos);
            }

            VEntregas.gettLoc().setModel(modelo);
            res.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
    }
        
         
    
    public static String ingresarEntregaLocal(Entrega entregaLoc) {
        
        String result = null;
        PreparedStatement pst = null;
        String sql = "insert into entregalocal(entrega, pedido) values(?,?)"; 
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                try{
                pst.setString(1, String.valueOf(entregaLoc.getIdEntrega()));
                pst.setString(2, String.valueOf(PeticionAbastecimiento.getIdPeticionAbast()));
                pst.executeUpdate();
                
                result = "Entrega a local registrada!" ;}
                catch(NullPointerException e){
                    result="Datos Vacios";
                    System.out.println("Error: "+e.getMessage());
                }
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (SQLException e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    
    public static String ingresarEntregaDomicilio(Entrega entregaDom) {
        
        String result = null;
        PreparedStatement pst = null;
        String sql = "insert into entregadominicilio(entrega, venta) values(?,?)"; 
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                try{
                
                pst.setString(1, String.valueOf(entregaDom.getIdEntrega()));
                pst.setString(2, String.valueOf(Venta.getIdVenta()));
                pst.executeUpdate();
                
                result = "Entrega a domicilio registrada!" ;}
                catch(NullPointerException e){
                    result="Datos Vacios";
                    System.out.println("Error: "+e.getMessage());
                }
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (SQLException e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    public void cargarRepartidores(){
         String result = null;
        PreparedStatement pst = null;
        String sql= "select r.repartidorid, p.nombre,p.cedula,p.telefono,p.direccion,e.sueldo from repartidor r\n" +
        " inner join empleado e on r.empleadoid=e.empleadoid\n" +
        " inner join persona p on e.personaid = p.personaid where disponible=true;";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                //pst.setString(1, ruc);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int id = Integer.parseInt(rs.getString(0));
                    String nombre= rs.getString(1);
                    String cedula = rs.getString(2);
                    String telefono= rs.getString(3);
                    String direc= rs.getString(4);
                    float sueldo = Float.parseFloat(rs.getString(5));
                    Repartidor rep= new Repartidor(nombre,cedula,telefono,direc,sueldo);
                    rep.setId(id);
                    cola.offer(rep);
                         
                }
          
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta"+e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
       
    }
        
    }
       
    
    
    

