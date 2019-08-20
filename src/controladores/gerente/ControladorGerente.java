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
import modelos.Localidad;
import modelos.Usuario;
import modelos.singleton.ConexionBaseDatos;
import vistas.Gerente.NewVGerente;
//import vistas.Gerente.AsignarAdmin;
import vistas.local.Locales;


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
    
            
    public static void buscarUsuario(String texto) {
        String[] cols = new String[]{"Usuario", "Nombre","Cedula","Telefono","Direccion", "Sueldo","Cargo"};
        //Usuario(String nombre, String cedula, String telefono, String direccion, double sueldo) 
        DefaultTableModel modelo = new DefaultTableModel(null, cols);

        try {
            String filtro = "" + texto + "_%";
            String sql = "Select u.username,p.nombre,p.cedula,p.telefono,p.direccion,e.sueldo, u.cargo from usuario u  inner join empleado e on e.empleadoid = u.empleadoid"
                    + " inner join localidad l on e.localidad =l.localid inner join persona p on e.personaid = p.personaid where u.username like" + '"' + filtro + '"';
            PreparedStatement us = cn.prepareStatement(sql);
            us.setString(1, texto);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[7];
            
            while (res.next()) {
                
                datos[0] = res.getString("username");
                datos[1] = res.getString("nombre");
                datos[2] = res.getString("cedula");
                datos[3] = res.getString("telefono");
                datos[4] = res.getString("direccion");
                datos[5] = res.getString("sueldo");
                datos[6] = res.getString("cargo");

                modelo.addRow(datos);
            }
            
            NewVGerente.gettUsuarios().setModel(modelo);
            //AsignarAdmin.gettUsuarios().setModel(modelo);
            res.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }

    }

     
      public static DefaultTableModel MostrarLocal() {
        String[] cols = new String[]{"Numero local", "Nombre", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(null, cols);
        try {
            String sql = "Select l.localid, l.nombrelocal ,l.descripcion from localiad l";
            PreparedStatement us = cn.prepareStatement(sql);
            try (ResultSet res = us.executeQuery()) {
                Object datos[] = new Object[3];
                while (res.next()) {
                    for (int i = 0; i < 3; i++) {

                        datos[i] = res.getObject(i + 1);
                    }
                    modelo.addRow(datos);
                }
            }

        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        return modelo;
    }

     
    public static String eliminarLocal(Localidad local) {
        String result = null;
        PreparedStatement pst = null;
        String sql = "UPDATE localidad SET enabled=? WHERE  nombrelocal =?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                local.setEnabled(0);
                pst.setString(1, Integer.toString(local.getEnabled()));
                //pst.setString(2, clienteVo.getCliente_ID());
                pst.setString(2, (local.getNombreLocal()));
                pst.executeUpdate();
                if (local.getEnabled()== 1) {
                    result = "Local Habilitado con exito, nombre: " + local.getNombreLocal();
                } else if (local.getEnabled()== 0) {
                    result = result = "Local Eliminado con exito, nombre: " + local.getNombreLocal();
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
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    
    public static String actualizarLocal(Localidad local) {
        String result = null;
        PreparedStatement pst = null;
        String sql = "UPDATE localidad SET nombrelocal=?, descripcion=? WHERE  localid =?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, local.getNombreLocal());
                pst.setString(2, local.getTipoLocalidad());
                 pst.setString(3, Integer.toString(local.getIdLocal()));
                pst.executeUpdate();
                if (local.getEnabled()== 1) {
                    result = "Local actualizado, nombre: " + local.getNombreLocal();
                } else {
                    result = result = "Local actualizado, nombre: " + local.getNombreLocal();
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
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    
    
    public static String ingresarLocal(Localidad local) {
        
        String result = null;
        PreparedStatement pst = null;
        String sql = "insert into localidad(nombrelocal,descripcion) values(?,?)"; 
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                try{
                
                pst.setString(1, local.getNombreLocal());
                pst.setString(2, local.getTipoLocalidad());
                //pst.setString(3, Integer.toString(local.getEnabled()));
                pst.executeUpdate();
                
                result = "Localidad registrada!" ;}
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
    
    public static void buscarLocal(String local) {
        String[] cols= new String[]{"Numero local","Nombre","Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(null, cols);

        try {
            String filtro = "" + local + "_%";
            String sql = "Select l.localid, l.nombrelocal,l.descripcion where l.nombrelocal like"  + '"' + filtro + '"';
            PreparedStatement us = cn.prepareStatement(sql);
            us.setString(1, local);
            ResultSet res = us.executeQuery();
            Object datos[] = new Object[3];
            while (res.next()) {
                datos[0] = res.getString("localid");
                datos[1] = res.getString("nombrelocal");
                datos[2] = res.getString("descripcion");

                modelo.addRow(datos);
            }
            res.close();
            Locales.getjTablaLocal().setModel(modelo);
                   

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }
        //return modelo;

    }
        public static String AsignarAdmi(Usuario u) {
        String result = null;
        PreparedStatement pst = null;
        String sql = "UPDATE usuario SET isadmin=? WHERE  username =?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, Integer.toString(u.isIsAdmin()));
                pst.setString(2, u.getUsuario());
                pst.executeUpdate();
                if (u.isIsAdmin()== 1) {
                    result = "Administrador asignado, nombre: " + u.getUsuario();
                } else {
                    result = result = "Admin Denegado : " + u.getUsuario();
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
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
}
