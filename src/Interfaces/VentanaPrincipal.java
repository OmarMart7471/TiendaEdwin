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

        contenedorRedimencionable = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        contenedorMenu = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        btnAsistencia = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnPedidoCliente = new javax.swing.JButton();
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

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo oficial.png"))); // NOI18N

        btnAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        btnAsistencia.setText("Asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nventa.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito-de-compras.png"))); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnPedidoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.png"))); // NOI18N
        btnPedidoCliente.setText("Pedido Cliente");
        btnPedidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorMenuLayout = new javax.swing.GroupLayout(contenedorMenu);
        contenedorMenu.setLayout(contenedorMenuLayout);
        contenedorMenuLayout.setHorizontalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addGroup(contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPedidoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(btnPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        contenedorMenuLayout.setVerticalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnAsistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnProveedores)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados)
                .addGap(18, 18, 18)
                .addComponent(btnPedido)
                .addGap(18, 18, 18)
                .addComponent(btnPedidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
  }//GEN-LAST:event_btnProveedoresActionPerformed

  private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
		limpiarContenido();
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(empleado);
		actualizarContenido();
  }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        
        limpiarContenido();
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(new Interfaces.GestionPedidoProveedor.MenuGestionPedido(contenedorPrincipal));
        actualizarContenido();
        
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnPedidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoClienteActionPerformed
        
        limpiarContenido();
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(new Interfaces.GestionPedidoCliente.MenuPedidoCliente(contenedorPrincipal));
        actualizarContenido();
        
    }//GEN-LAST:event_btnPedidoClienteActionPerformed

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
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnPedidoCliente;
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
