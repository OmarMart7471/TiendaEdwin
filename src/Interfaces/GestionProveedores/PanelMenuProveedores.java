/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.GestionProveedores;

/**
 *
 * @author luis
 */
import java.awt.Component;
import javax.swing.JPanel;

public class PanelMenuProveedores extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuProveedores
     */
    
     private JPanel contenedor = null;
     
     
    public PanelMenuProveedores(JPanel contenedor) {
        initComponents();
        this.contenedor = contenedor;
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

        btnAgregarNuevoProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();

        btnAgregarNuevoProveedor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAgregarNuevoProveedor.setText("AGREGAR NUEVO PROVEEDOR");
        btnAgregarNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEliminarProveedor.setText("ELIMINAR PROVEEDOR");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnModificarProveedor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnModificarProveedor.setText("MODIFICAR PROVEEDOR");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarNuevoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAgregarNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProveedorActionPerformed
        // TODO add your handling code here:
        limpiarContenido();
        contenedor.add(new PanelAgregarProveedores());
        actualizarContenido();
    }//GEN-LAST:event_btnAgregarNuevoProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
        // TODO add your handling code here:
        limpiarContenido();
        contenedor.add(new PanelModificar_VisualizarProveedores());
        actualizarContenido();
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
        limpiarContenido();
        contenedor.add(new PanelEliminarProveedores());
        actualizarContenido();
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    
     private void setInterfaz(JPanel interfazMostrar) {
    limpiarContenido();
    contenedor.removeAll();
    contenedor.add(interfazMostrar);
    actualizarContenido();
}
     

    public void limpiarContenido() {
    Component componente = contenedor.getComponent(0);
    contenedor.remove(componente);
    actualizarContenido();
}

public void actualizarContenido() {
    contenedor.revalidate();
    contenedor.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNuevoProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnModificarProveedor;
    // End of variables declaration//GEN-END:variables
}