package Interfaces;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Label;
import javax.swing.JPanel;
import Manejadores.Principal;
import Interfaces.GestionEmpleados.contenedorEmpleado;

public class VentanaPrincipal extends javax.swing.JFrame {

    /*Se declara al manejador principal que se encargará 
    de hacer la conexion con la base de datos y posteriormente
    a las interfaces correspondientes de los casos de uso
    */

    
    contenedorEmpleado empleado = new contenedorEmpleado();
    
public VentanaPrincipal() {
	initComponents();
        contenedorPrincipal.add(empleado);

//Agrega la vista inicial del punto de venta
	//contenedorPrincipal.add(contenedorVenta);

//Maximiza la pantalla
	setExtendedState(this.MAXIMIZED_BOTH);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        contenedorRedimencionable = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        contenedorMenu = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnCorteCaja = new javax.swing.JButton();
        panelDeContenido = new javax.swing.JPanel();
        contenedorTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorRedimencionable.setBorder(null);
        contenedorRedimencionable.setPreferredSize(new java.awt.Dimension(580, 780));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(760, 560));
        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        contenedorMenu.setBackground(new java.awt.Color(153, 153, 153));
        contenedorMenu.setToolTipText("");
        contenedorMenu.setMaximumSize(new java.awt.Dimension(250, 2147483647));
        contenedorMenu.setPreferredSize(new java.awt.Dimension(220, 650));
        contenedorMenu.setLayout(new java.awt.GridBagLayout());

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo oficial.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        contenedorMenu.add(icono, gridBagConstraints);

        btnAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        btnAsistencia.setText("Asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 0, 0, 0);
        contenedorMenu.add(btnAsistencia, gridBagConstraints);

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nventa.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 0, 0, 0);
        contenedorMenu.add(btnVenta, gridBagConstraints);

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 0, 0, 0);
        contenedorMenu.add(btnProveedores, gridBagConstraints);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 0, 0);
        contenedorMenu.add(btnProductos, gridBagConstraints);

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 0, 0, 0);
        contenedorMenu.add(btnEmpleados, gridBagConstraints);

        btnCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        btnCorteCaja.setText("Corte de caja");
        btnCorteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteCajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 92, 0);
        contenedorMenu.add(btnCorteCaja, gridBagConstraints);

        panelPrincipal.add(contenedorMenu);

        panelDeContenido.setLayout(new javax.swing.BoxLayout(panelDeContenido, javax.swing.BoxLayout.PAGE_AXIS));

        contenedorTitulo.setMaximumSize(new java.awt.Dimension(32767, 100));
        contenedorTitulo.setPreferredSize(new java.awt.Dimension(80, 110));
        contenedorTitulo.setLayout(new java.awt.GridLayout(1, 0));

        lblTitulo.setBackground(java.awt.Color.red);
        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ABARROTES EDWIN");
        lblTitulo.setToolTipText("");
        lblTitulo.setAutoscrolls(true);
        lblTitulo.setMaximumSize(new java.awt.Dimension(800, 110));
        lblTitulo.setMinimumSize(new java.awt.Dimension(80, 70));
        lblTitulo.setPreferredSize(new java.awt.Dimension(80, 90));
        contenedorTitulo.add(lblTitulo);

        panelDeContenido.add(contenedorTitulo);

        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(580, 400));
        contenedorPrincipal.setLayout(new javax.swing.BoxLayout(contenedorPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        panelDeContenido.add(contenedorPrincipal);

        panelPrincipal.add(panelDeContenido);

        contenedorRedimencionable.setViewportView(panelPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorRedimencionable, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorRedimencionable, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
		
      /*
                limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(ManejadorPrincipal.getGestionAsistencia());
		actualizarContenido();*/
                
  }//GEN-LAST:event_btnAsistenciaActionPerformed

  private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
		/*limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(ManejadorPrincipal.getGestionVenta());
		actualizarContenido();*/
  }//GEN-LAST:event_btnVentaActionPerformed

  private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
		/*limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(ManejadorPrincipal.getGestionProveedor());
		actualizarContenido();*/
limpiarContenido();
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(new Interfaces.GestionProveedores.PanelMenuProveedores(contenedorPrincipal));
        actualizarContenido();
  }//GEN-LAST:event_btnProveedoresActionPerformed

  private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
		/*limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(ManejadorPrincipal.getGestionProductos());
		actualizarContenido();*/

                
                limpiarContenido();
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(new Interfaces.GestionProducto.PanelMenuGestionProducto(contenedorPrincipal));
        actualizarContenido();

  }//GEN-LAST:event_btnProductosActionPerformed

  private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
		limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(empleado);
		actualizarContenido();
  }//GEN-LAST:event_btnEmpleadosActionPerformed

  private void btnCorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteCajaActionPerformed
		/*limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(ManejadorPrincipal.getGestionCorteCaja());
		actualizarContenido();*/
  }//GEN-LAST:event_btnCorteCajaActionPerformed

public void limpiarContenido() {
	Component componente = contenedorPrincipal.getComponent(0);
	contenedorPrincipal.remove(componente);
	actualizarContenido();
}

public void actualizarContenido() {
	contenedorPrincipal.revalidate();
	contenedorPrincipal.repaint();
}

public static void main(String args[]) {

	try {
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	} catch (ClassNotFoundException ex) {
		java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>

	java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		new VentanaPrincipal().setVisible(true);

	}
	});
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnCorteCaja;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVenta;
    private javax.swing.JPanel contenedorMenu;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JScrollPane contenedorRedimencionable;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelDeContenido;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
