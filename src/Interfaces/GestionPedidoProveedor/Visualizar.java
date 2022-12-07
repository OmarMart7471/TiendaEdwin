
package Interfaces.GestionPedidoProveedor;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Visualizar extends javax.swing.JPanel {
    
      PedidoDatos peD = new PedidoDatos();
      DefaultTableModel tabla = new DefaultTableModel();
      int filas;
      public PedidoDatos CC;
      private Pedido pedidoActual;
      private List<Pedido> resultados;
      Pedido pe = new Pedido();


    
    public Visualizar() {
        initComponents();
        
          CC = new PedidoDatos();
        filas = tabla.getRowCount();
        for(int i = filas-1; i>= 0; i--){
        tabla.removeRow(i);}
        tabla.addColumn("id");        
        tabla.addColumn("fecha");        
        tabla.addColumn("cantidad");        
        tabla.addColumn("anticipo");        
        tabla.addColumn("total");
        tabla.addColumn("idProducto");
        tabla.addColumn("idProveedor");
        this.PedidoEncontrado.setModel(tabla);
        ListarPedido();
    }
    
     public void ListarPedido() {
      List <Pedido> Listape = peD.ListarPedido();
      tabla = (DefaultTableModel) PedidoEncontrado.getModel();
      Object[] ob = new Object[7];
        for (int i = 0; i < Listape.size(); i++) {
            ob[0] = Listape.get(i).getIdPedido();
            ob[1] = Listape.get(i).getFecha();
            ob[2] = Listape.get(i).getCantidad();
            ob[3] = Listape.get(i).getAnticipo();
            ob[4] = Listape.get(i).getTotal();
            ob[5] = Listape.get(i).getIdProducto();
            ob[6] = Listape.get(i).getIdProveedor();
            tabla.addRow(ob);
        }
        PedidoEncontrado.setModel(tabla);

    }
     
      
     public Pedido buscarPedido(String id) {
	return peD.BuscarPedido(id);
}


public void insertarPedido(Pedido pedido) {
	tabla = (DefaultTableModel) PedidoEncontrado.getModel();
	tabla.addRow(pedido.getRow());
	PedidoEncontrado.setModel(tabla);
        }

private void limpiarTabla() {
	tabla = (DefaultTableModel) PedidoEncontrado.getModel();
	for (int iterador = 0; iterador < tabla.getRowCount(); iterador++) {
		tabla.removeRow(iterador);
	}
	tabla.setRowCount(0);
	PedidoEncontrado.setModel(tabla);
} 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backUsuario = new javax.swing.JPanel();
        lblNomProvee = new javax.swing.JLabel();
        txtNomProvee = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnBuscarPedido = new javax.swing.JButton();
        scrollPedidoEncon = new javax.swing.JScrollPane();
        PedidoEncontrado = new javax.swing.JTable();

        backUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomProvee.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblNomProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacer-un-pedido (2).png"))); // NOI18N
        lblNomProvee.setText("Id del pedido:");
        backUsuario.add(lblNomProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 63, -1, 38));

        txtNomProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomProveeKeyPressed(evt);
            }
        });
        backUsuario.add(txtNomProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 69, 150, -1));

        lblFecha.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha-tope (1).png"))); // NOI18N
        lblFecha.setText("Fecha:");
        backUsuario.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 107, -1, -1));
        backUsuario.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 109, 177, -1));

        btnBuscarPedido.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        btnBuscarPedido.setText("Buscar pedido");
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });
        backUsuario.add(btnBuscarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 88, -1, -1));

        PedidoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Cantidad", "Anticipo", "Total"
            }
        ));
        scrollPedidoEncon.setViewportView(PedidoEncontrado);

        backUsuario.add(scrollPedidoEncon, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 183, 460, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
        Pedido pedido = buscarPedido(txtNomProvee.getText());
			limpiarTabla();
			if (pedido.getIdProveedor()!= null) {
				insertarPedido(pedido);
				JOptionPane.showMessageDialog(this, "Se encontró el pedido");
				pedidoActual = resultados.get(0);
				txtNomProvee.setText("" + pedidoActual.getFecha());
				txtFecha.setText(pedidoActual.getFecha());
			} else {
				JOptionPane.showMessageDialog(this, "No se encontró el pedido");
			}
    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    private void txtNomProveeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProveeKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
				if (!"".equals(txtNomProvee.getText())) {
					String id = txtNomProvee.getText();
					pe = peD.BuscarPedido(id);
					if (pe.getFecha() != null) {
						txtNomProvee.setText("" + pe.getIdPedido());
						txtFecha.setText("" + pe.getFecha());
					} else {

						txtNomProvee.requestFocus();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese el codigo del pedido");
					txtNomProvee.requestFocus();
				}
			}
    }//GEN-LAST:event_txtNomProveeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PedidoEncontrado;
    private javax.swing.JPanel backUsuario;
    private javax.swing.JButton btnBuscarPedido;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNomProvee;
    private javax.swing.JScrollPane scrollPedidoEncon;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNomProvee;
    // End of variables declaration//GEN-END:variables
}
