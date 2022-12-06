
package Interfaces.GestionPedidoProveedor;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Eliminar extends javax.swing.JPanel {
    
      PedidoDatos peD = new PedidoDatos();
      DefaultTableModel tabla = new DefaultTableModel();
      int filas;
      public PedidoDatos CC;
      private Pedido pedidoActual;
      private List<Pedido> resultados;
      Pedido pe = new Pedido();


   
    public Eliminar() {
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
        this.PedidoEncon.setModel(tabla);
        ListarPedido();
    }
    
    
     public void ListarPedido() {
      List <Pedido> Listape = peD.ListarPedido();
      tabla = (DefaultTableModel) PedidoEncon.getModel();
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
        PedidoEncon.setModel(tabla);

    }
     
     public Pedido buscarPedido(String id) {
	return peD.BuscarPedido(id);
}


public void insertarPedido(Pedido pedido) {
	tabla = (DefaultTableModel) PedidoEncon.getModel();
	tabla.addRow(pedido.getRow());
	PedidoEncon.setModel(tabla);
        }

private void limpiarTabla() {
	tabla = (DefaultTableModel) PedidoEncon.getModel();
	for (int iterador = 0; iterador < tabla.getRowCount(); iterador++) {
		tabla.removeRow(iterador);
	}
	tabla.setRowCount(0);
	PedidoEncon.setModel(tabla);
} 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomProvee = new javax.swing.JLabel();
        txtNomProvee = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnBuscarProvee = new javax.swing.JButton();
        scrollPedidoElim = new javax.swing.JScrollPane();
        PedidoEncon = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        lblNomProvee.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblNomProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacer-un-pedido (2).png"))); // NOI18N
        lblNomProvee.setText("Id del proveedor: ");

        txtNomProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomProveeKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha-tope (1).png"))); // NOI18N
        jLabel1.setText("Fecha:");

        btnBuscarProvee.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnBuscarProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        btnBuscarProvee.setText("Buscar ");
        btnBuscarProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomProvee)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFecha)
                    .addComponent(txtNomProvee, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProvee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomProvee)
                            .addComponent(txtNomProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProvee)
                        .addGap(59, 59, 59))))
        );

        PedidoEncon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Cantidad", "Anticipo", "Total"
            }
        ));
        scrollPedidoElim.setViewportView(PedidoEncon);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (1).png"))); // NOI18N
        btnEliminar.setText("Eliminar pedido");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(scrollPedidoElim, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnEliminar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPedidoElim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if (!"".equals(txtNomProvee.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtNomProvee.getText());
                peD.EliminarPedido(id);
               
                ListarPedido();
                limpiarTabla();
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveeActionPerformed
        
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
        
    }//GEN-LAST:event_btnBuscarProveeActionPerformed

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
    private javax.swing.JTable PedidoEncon;
    private javax.swing.JButton btnBuscarProvee;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNomProvee;
    private javax.swing.JScrollPane scrollPedidoElim;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNomProvee;
    // End of variables declaration//GEN-END:variables
}
