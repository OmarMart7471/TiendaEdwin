/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionUsuarios;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Ima
 */
public class MenuGestionUsuario extends javax.swing.JPanel {
    private JPanel contenedor = null;

    /**
     * Creates new form MenuGestionUsuario
     */
    public MenuGestionUsuario(JPanel contenedor) {
        initComponents();
                this.contenedor= contenedor;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnModificar2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        btnModificar2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        btnModificar2.setText("MODIFICAR");
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });
        add(btnModificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 395, 90));

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 395, 90));

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 395, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
        limpiarContenido();
        contenedor.removeAll();
        contenedor.add(new Interfaces.GestionUsuarios.contenedorModificarUsuario(contenedor));
        actualizarContenido();

    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        limpiarContenido();
        contenedor.removeAll();
        contenedor.add(new Interfaces.GestionUsuarios.contenedorEliminarUsuario(contenedor));
        actualizarContenido();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        limpiarContenido();
        contenedor.removeAll();
        contenedor.add(new Interfaces.GestionUsuarios.contenedorAgregarUsuario(contenedor));
        actualizarContenido();

    }//GEN-LAST:event_btnAgregarActionPerformed
    
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}