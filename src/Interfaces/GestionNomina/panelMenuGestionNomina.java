package Interfaces.GestionNomina;

import Interfaces.GestionAsistencia.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class panelMenuGestionNomina extends javax.swing.JPanel {

private JPanel contenedor = null;

public panelMenuGestionNomina(JPanel contenedor) {
	this.contenedor = contenedor;
	initComponents();
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contenedorBotones = new javax.swing.JPanel();
    panelPrincipal = new javax.swing.JPanel();
    btnGenerar = new javax.swing.JPanel();
    lblAgregar = new javax.swing.JLabel();
    btnModificar = new javax.swing.JPanel();
    lblModificar = new javax.swing.JLabel();
    btnBuscar = new javax.swing.JPanel();
    lblBuscar = new javax.swing.JLabel();

    btnGenerar.setBackground(new java.awt.Color(142, 141, 141));
    btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnGenerarMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnGenerarhoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnGenerarhoverSalida(evt);
      }
    });

    lblAgregar.setBackground(new java.awt.Color(255, 255, 255));
    lblAgregar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
    lblAgregar.setText("Generar");

    javax.swing.GroupLayout btnGenerarLayout = new javax.swing.GroupLayout(btnGenerar);
    btnGenerar.setLayout(btnGenerarLayout);
    btnGenerarLayout.setHorizontalGroup(
      btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 402, Short.MAX_VALUE)
      .addGroup(btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnGenerarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblAgregar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    btnGenerarLayout.setVerticalGroup(
      btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 84, Short.MAX_VALUE)
      .addGroup(btnGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnGenerarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblAgregar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    panelPrincipal.add(btnGenerar);

    btnModificar.setBackground(new java.awt.Color(142, 141, 141));
    btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnModificar.setPreferredSize(new java.awt.Dimension(402, 84));
    btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnModificarMouseClicked(evt);
      }
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

    btnBuscar.setBackground(new java.awt.Color(142, 141, 141));
    btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnBuscarMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnBuscarhoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnBuscarhoverSalida(evt);
      }
    });

    lblBuscar.setBackground(new java.awt.Color(255, 255, 255));
    lblBuscar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
    lblBuscar.setText("Buscar");

    javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
    btnBuscar.setLayout(btnBuscarLayout);
    btnBuscarLayout.setHorizontalGroup(
      btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 402, Short.MAX_VALUE)
      .addGroup(btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnBuscarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblBuscar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    btnBuscarLayout.setVerticalGroup(
      btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 84, Short.MAX_VALUE)
      .addGroup(btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(btnBuscarLayout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(lblBuscar)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    panelPrincipal.add(btnBuscar);

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
      .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
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
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(14, Short.MAX_VALUE)
        .addComponent(contenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(82, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnGenerarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarhoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnGenerarhoverEntrada

  private void btnGenerarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarhoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnGenerarhoverSalida

  private void btnBuscarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarhoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnBuscarhoverEntrada

  private void btnBuscarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarhoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnBuscarhoverSalida

  private void btnModificarhoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarhoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnModificarhoverEntrada

  private void btnModificarhoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarhoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnModificarhoverSalida

  private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
		cambiarInterfaz("agregar");
  }//GEN-LAST:event_btnGenerarMouseClicked

  private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
    cambiarInterfaz("modificar");
  }//GEN-LAST:event_btnModificarMouseClicked

  private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
    cambiarInterfaz("buscar");
  }//GEN-LAST:event_btnBuscarMouseClicked

public void cambiarInterfaz(String interfaz) {
	JPanel interfazMostrar = null;
	switch (interfaz) {
		case "agregar":
			interfazMostrar = new Interfaces.GestionNomina.panelGenerarNomina();
			break;
		case "modificar":
			interfazMostrar = new Interfaces.GestionNomina.panelModificarNomina();
			break;
		case "buscar":
			interfazMostrar = new Interfaces.GestionNomina.panelBuscarNomina();
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


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel btnBuscar;
  private javax.swing.JPanel btnGenerar;
  private javax.swing.JPanel btnModificar;
  private javax.swing.JPanel contenedorBotones;
  private javax.swing.JLabel lblAgregar;
  private javax.swing.JLabel lblBuscar;
  private javax.swing.JLabel lblModificar;
  private javax.swing.JPanel panelPrincipal;
  // End of variables declaration//GEN-END:variables
}
