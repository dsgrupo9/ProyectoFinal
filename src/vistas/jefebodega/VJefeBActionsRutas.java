/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.jefebodega;

/**
 *
 * @author Melanie Banchon
 */
public class VJefeBActionsRutas extends javax.swing.JPanel {

    /**
     * Creates new form VJefeBActions
     */
    public VJefeBActionsRutas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCrearRuta = new javax.swing.JLabel();
        txtEntregaDireccion = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        bCrearEntrega = new javax.swing.JButton();
        lbEntrega = new javax.swing.JLabel();

        labelCrearRuta.setText("Asignar Ruta");

        lbDireccion.setText("Ingresar Direccion:");

        bCrearEntrega.setText("Crear Entrega");

        lbEntrega.setText("Entrega");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEntrega)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDireccion)
                        .addGap(73, 73, 73)
                        .addComponent(txtEntregaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(bCrearEntrega))
                    .addComponent(labelCrearRuta))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelCrearRuta)
                .addGap(33, 33, 33)
                .addComponent(lbEntrega)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntregaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion)
                    .addComponent(bCrearEntrega))
                .addContainerGap(323, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearEntrega;
    private javax.swing.JLabel labelCrearRuta;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEntrega;
    private javax.swing.JTextField txtEntregaDireccion;
    // End of variables declaration//GEN-END:variables
}
