/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionCorteCaja;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Omar Mtz
 */
public class menuCorteCaja extends javax.swing.JPanel {

    private JPanel contenedor = null;
    
    public menuCorteCaja(JPanel contenedor) {
        this.contenedor = contenedor;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorBotones = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        btnVisualizar = new javax.swing.JPanel();
        lblVisualizar = new javax.swing.JLabel();

        btnAgregar.setBackground(new java.awt.Color(142, 141, 141));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarhoverEntrada(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarhoverSalida(evt);
            }
        });

        lblAgregar.setBackground(new java.awt.Color(255, 255, 255));
        lblAgregar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAgregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAgregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgregar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPrincipal.add(btnAgregar);

        btnVisualizar.setBackground(new java.awt.Color(142, 141, 141));
        btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarhoverEntrada(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarhoverSalida(evt);
            }
        });

        lblVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        lblVisualizar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblVisualizar.setText("Visualizar");

        javax.swing.GroupLayout btnVisualizarLayout = new javax.swing.GroupLayout(btnVisualizar);
        btnVisualizar.setLayout(btnVisualizarLayout);
        btnVisualizarLayout.setHorizontalGroup(
            btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnVisualizarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblVisualizar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnVisualizarLayout.setVerticalGroup(
            btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnVisualizarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblVisualizar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPrincipal.add(btnVisualizar);

        javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
        contenedorBotones.setLayout(contenedorBotonesLayout);
        contenedorBotonesLayout.setHorizontalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenedorBotonesLayout.setVerticalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(contenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        cambiarInterfaz("agregar");
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarhoverEntrada
        evt.getComponent().setBackground(new Color(94, 92, 92));
    }//GEN-LAST:event_btnAgregarhoverEntrada

    private void btnAgregarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarhoverSalida
        evt.getComponent().setBackground(new Color(142, 141, 141));
    }//GEN-LAST:event_btnAgregarhoverSalida

    private void btnVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseClicked
         cambiarInterfaz("visualizar");
    }//GEN-LAST:event_btnVisualizarMouseClicked

    private void btnVisualizarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarhoverEntrada
        evt.getComponent().setBackground(new Color(94, 92, 92));
    }//GEN-LAST:event_btnVisualizarhoverEntrada

    private void btnVisualizarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarhoverSalida
        evt.getComponent().setBackground(new Color(142, 141, 141));
    }//GEN-LAST:event_btnVisualizarhoverSalida


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnVisualizar;
    private javax.swing.JPanel contenedorBotones;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblVisualizar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
public void cambiarInterfaz(String interfaz) {
	JPanel interfazMostrar = null;
	switch (interfaz) {
		case "agregar":
			interfazMostrar = new Interfaces.GestionCorteCaja.panelAgregarCorteCaja();
			break;
		
		case "visualizar":
			interfazMostrar =  new Interfaces.GestionCorteCaja.panelVisualizar();
			break;
	}
	setInterfaz(interfazMostrar);
}

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


}
