/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.local;

import controladores.gerente.ControladorGerente;
import controladores.jefeBodega.ControladorJefeBodega;
import controladores.login.ControladorLogin;
import javax.swing.JTable;
import modelos.Localidad;

/**
 *
 * @author Melanie Banchon
 */
public class VCreacionLocales extends javax.swing.JPanel {

    /**
     * Creates new form VCreacionç
     */
    public VCreacionLocales() {
        initComponents();
    }

    //gerente maneja los locales
    ControladorLogin ctrlLogin = new ControladorLogin();
    ControladorGerente ctrlGerente = new ControladorGerente();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLocal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarLocal = new javax.swing.JButton();
        txtBuscarLocal = new javax.swing.JTextField();
        lTipo = new javax.swing.JLabel();
        comboTipoLocal = new javax.swing.JComboBox<>();
        lLugar1 = new javax.swing.JLabel();
        txtNombreLocal = new javax.swing.JTextField();
        bIngresar = new javax.swing.JButton();
        btnActualizarDatos = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        btnEliminarDatos = new javax.swing.JButton();

        jLabel1.setText("Locales");

        tablaLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo de Local ","Nombre", "Lugar "
            }
        ));
        jScrollPane1.setViewportView(tablaLocal);

        jLabel2.setText("Buscar Local");

        btnBuscarLocal.setText("Buscar");
        btnBuscarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLocalActionPerformed(evt);
            }
        });

        txtBuscarLocal.setText("coloque nombre");
        txtBuscarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarLocalActionPerformed(evt);
            }
        });

        lTipo.setText("Tipo");

        comboTipoLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodega", "Sucursal" }));
        comboTipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoLocalActionPerformed(evt);
            }
        });

        lLugar1.setText("Nombre Local:");

        txtNombreLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreLocalActionPerformed(evt);
            }
        });

        bIngresar.setText("Ingresar Datos");
        bIngresar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                bIngresarComponentHidden(evt);
            }
        });
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        btnActualizarDatos.setText("Actualizar Datos");
        btnActualizarDatos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btnActualizarDatosComponentHidden(evt);
            }
        });
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        btnEliminarDatos.setText("Eliminar Datos");
        btnEliminarDatos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btnEliminarDatosComponentHidden(evt);
            }
        });
        btnEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lLugar1)
                                .addGap(73, 73, 73)
                                .addComponent(txtNombreLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarCampos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lTipo)
                                .addGap(176, 176, 176)
                                .addComponent(comboTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bIngresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarLocal)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(txtBuscarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBuscarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarLocal)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTipo)
                            .addComponent(comboTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bIngresar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombreLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lLugar1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarDatos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarDatos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCampos)
                        .addGap(144, 144, 144))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarLocalActionPerformed

    private void txtNombreLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreLocalActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        Localidad local = new Localidad((String) comboTipoLocal.getSelectedItem(),txtNombreLocal.getText());
        ctrlGerente.actualizarLocal(local);
//Localidad(String tipoLocalidad, String nombreLocal)
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnEliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosActionPerformed
         Localidad local = new Localidad((String) comboTipoLocal.getSelectedItem(),txtNombreLocal.getText());
        ctrlGerente.eliminarLocal(local);
    }//GEN-LAST:event_btnEliminarDatosActionPerformed

    private void btnActualizarDatosComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnActualizarDatosComponentHidden
        if(ctrlLogin.isIsAdmin()){
            btnActualizarDatos.setEnabled(true);
        }else
             btnActualizarDatos.setEnabled(false);
    }//GEN-LAST:event_btnActualizarDatosComponentHidden

    private void btnEliminarDatosComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEliminarDatosComponentHidden
        
        if (ctrlLogin.isIsAdmin()) {
            btnActualizarDatos.setEnabled(true);
        } else {
            btnActualizarDatos.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarDatosComponentHidden

    private void comboTipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoLocalActionPerformed

    private void bIngresarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bIngresarComponentHidden
        if (ctrlLogin.isIsAdmin()) {
            btnActualizarDatos.setEnabled(true);
        } else {
            btnActualizarDatos.setEnabled(false);
        }
    }//GEN-LAST:event_bIngresarComponentHidden

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        Localidad local = new Localidad((String) comboTipoLocal.getSelectedItem(),txtNombreLocal.getText());
        ctrlGerente.ingresarLocal(local);
    }//GEN-LAST:event_bIngresarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        txtBuscarLocal.setText("");
        txtNombreLocal.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnBuscarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLocalActionPerformed
        ctrlGerente.buscarLocal(txtBuscarLocal.getText());
    }//GEN-LAST:event_btnBuscarLocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnBuscarLocal;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JComboBox<String> comboTipoLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lLugar1;
    private javax.swing.JLabel lTipo;
    private static javax.swing.JTable tablaLocal;
    private javax.swing.JTextField txtBuscarLocal;
    private javax.swing.JTextField txtNombreLocal;
    // End of variables declaration//GEN-END:variables

    public static JTable getTablaLocal() {
        return tablaLocal;
    }
}