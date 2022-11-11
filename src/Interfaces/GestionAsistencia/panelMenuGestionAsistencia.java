package Interfaces.GestionAsistencia;

public class panelMenuGestionAsistencia extends javax.swing.JPanel {

public panelMenuGestionAsistencia() {
	initComponents();
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contenedorBotones = new javax.swing.JPanel();
    panelPrincipal = new javax.swing.JPanel();
    btnAgregar = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnModificar = new javax.swing.JPanel();
    lblModificar = new javax.swing.JLabel();
    btnVisualizar = new javax.swing.JPanel();
    lblVisualizar = new javax.swing.JLabel();
    btnEliminar = new javax.swing.JPanel();
    lblEliminar = new javax.swing.JLabel();

    btnAgregar.setBackground(new java.awt.Color(51, 102, 255));
    btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
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

    btnModificar.setBackground(new java.awt.Color(51, 102, 255));
    btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnModificar.setPreferredSize(new java.awt.Dimension(402, 84));
    btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnModificarhoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnModificarhoverSalida(evt);
      }
    });

    lblModificar.setBackground(new java.awt.Color(255, 255, 255));
    lblModificar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblModificar.setForeground(new java.awt.Color(255, 255, 255));
    lblModificar.setText("Modificar");

    javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
    btnModificar.setLayout(btnModificarLayout);
    btnModificarLayout.setHorizontalGroup(
      btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 402, Short.MAX_VALUE)
      .addGroup(btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnModificarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblModificar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    btnModificarLayout.setVerticalGroup(
      btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 84, Short.MAX_VALUE)
      .addGroup(btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnModificarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblModificar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    panelPrincipal.add(btnModificar);

    btnVisualizar.setBackground(new java.awt.Color(51, 102, 255));
    btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
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

    btnEliminar.setBackground(new java.awt.Color(51, 102, 255));
    btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnEliminarhoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnEliminarhoverSalida(evt);
      }
    });

    lblEliminar.setBackground(new java.awt.Color(255, 255, 255));
    lblEliminar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
    lblEliminar.setText("Eliminar");

    javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
    btnEliminar.setLayout(btnEliminarLayout);
    btnEliminarLayout.setHorizontalGroup(
      btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 402, Short.MAX_VALUE)
      .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnEliminarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblEliminar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    btnEliminarLayout.setVerticalGroup(
      btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 84, Short.MAX_VALUE)
      .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnEliminarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblEliminar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    panelPrincipal.add(btnEliminar);

    javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
    contenedorBotones.setLayout(contenedorBotonesLayout);
    contenedorBotonesLayout.setHorizontalGroup(
      contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(contenedorBotonesLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    contenedorBotonesLayout.setVerticalGroup(
      contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(151, Short.MAX_VALUE)
        .addComponent(contenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(152, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 14, Short.MAX_VALUE)
        .addComponent(contenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 14, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnAgregarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarhoverEntrada
    evt.getComponent().setBackground(new Color(102,153,255));
  }//GEN-LAST:event_btnAgregarhoverEntrada

  private void btnAgregarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarhoverSalida
    evt.getComponent().setBackground(new Color(51,102,255));
  }//GEN-LAST:event_btnAgregarhoverSalida

  private void btnEliminarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarhoverEntrada
    // TODO add your handling code here:
  }//GEN-LAST:event_btnEliminarhoverEntrada

  private void btnEliminarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarhoverSalida
    // TODO add your handling code here:
  }//GEN-LAST:event_btnEliminarhoverSalida

  private void btnVisualizarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarhoverEntrada
    // TODO add your handling code here:
  }//GEN-LAST:event_btnVisualizarhoverEntrada

  private void btnVisualizarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarhoverSalida
    // TODO add your handling code here:
  }//GEN-LAST:event_btnVisualizarhoverSalida

  private void btnModificarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarhoverEntrada
    // TODO add your handling code here:
  }//GEN-LAST:event_btnModificarhoverEntrada

  private void btnModificarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarhoverSalida
    // TODO add your handling code here:
  }//GEN-LAST:event_btnModificarhoverSalida


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel btnAgregar;
  private javax.swing.JPanel btnEliminar;
  private javax.swing.JPanel btnModificar;
  private javax.swing.JPanel btnVisualizar;
  private javax.swing.JPanel contenedorBotones;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblEliminar;
  private javax.swing.JLabel lblModificar;
  private javax.swing.JLabel lblVisualizar;
  private javax.swing.JPanel panelPrincipal;
  // End of variables declaration//GEN-END:variables
}
