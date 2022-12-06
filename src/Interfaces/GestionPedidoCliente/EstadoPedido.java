package Interfaces.GestionPedidoCliente;

import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EstadoPedido extends javax.swing.JPanel {

PedidoDatos peD = new PedidoDatos();
private ManejadorPedidoCliente cc;
private List<Pedido> resultados;
Pedido pe = new Pedido();
private Pedido pedidoActual;
DefaultTableModel modelo = new DefaultTableModel();
int filas;

public EstadoPedido() {
	initComponents();
        peD.consultaEstadoPedido(comboEstadoP);
	cc = new ManejadorPedidoCliente();
	filas = modelo.getRowCount();
	for (int i = filas - 1; i >= 0; i--) {
		modelo.removeRow(i);
	}
	modelo.addColumn("id");
	modelo.addColumn("fecha");
	modelo.addColumn("nombre");
	modelo.addColumn("telefono");
	modelo.addColumn("cantidad");
	modelo.addColumn("anticipo");
	modelo.addColumn("total");
	modelo.addColumn("idVenta");
        modelo.addColumn("producto");
	this.PedidosEncon.setModel(modelo);
        ListarPedido();
	
}

 
      public void ListarPedido() {
      List<Pedido> Listape = peD.ListarPedido();
      modelo = (DefaultTableModel) PedidosEncon.getModel();
      Object[] ob = new Object[9];
        for (int i = 0; i < Listape.size(); i++) {
            ob[0] = Listape.get(i).getId();
            ob[1] = Listape.get(i).getFecha();
            ob[2] = Listape.get(i).getNombreCliente();
            ob[3] = Listape.get(i).getTelefono();
            ob[4] = Listape.get(i).getCantidad();
            ob[5] = Listape.get(i).getAnticipo();
            ob[6] = Listape.get(i).getTotal();
            ob[7] = Listape.get(i).getIdVenta();
            ob[8] = Listape.get(i).getProducto();
            modelo.addRow(ob);
        }
        PedidosEncon.setModel(modelo);

    }

public Pedido buscarPedido(String id) {
	return peD.BuscarPedido(id);
}

public void insertarPedido(Pedido pedido) {
	modelo = (DefaultTableModel) PedidosEncon.getModel();
	modelo.addRow(pedido.getRow());
	PedidosEncon.setModel(modelo);
} 

/*public void cargarPedidos() {

	ArrayList<Pedido> Listape = peD.ListarPedido();
	modelo = (DefaultTableModel) PedidosEncon.getModel();
	for (Pedido pedido : Listape) {
		modelo.addRow(pedido.getRow());
	}
	PedidosEncon.setModel(modelo);
} */

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUusario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnBuscarPedido = new javax.swing.JButton();
        scrollPedidosEncon = new javax.swing.JScrollPane();
        PedidosEncon = new javax.swing.JTable();
        comboEstadoP = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacer-un-pedido (2).png"))); // NOI18N
        jLabel1.setText("Id pedido: ");

        txtIdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPedidoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha-tope (1).png"))); // NOI18N
        jLabel2.setText("Fecha de pedido:");

        btnBuscarPedido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa (1).png"))); // NOI18N
        btnBuscarPedido.setText("Buscar");
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUusarioLayout = new javax.swing.GroupLayout(panelUusario);
        panelUusario.setLayout(panelUusarioLayout);
        panelUusarioLayout.setHorizontalGroup(
            panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUusarioLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUusarioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(panelUusarioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPedido)))
                .addGap(44, 44, 44)
                .addComponent(btnBuscarPedido)
                .addGap(103, 103, 103))
        );
        panelUusarioLayout.setVerticalGroup(
            panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUusarioLayout.createSequentialGroup()
                .addGroup(panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelUusarioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUusarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarPedido)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        PedidosEncon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Pedido", "Fecha", "Estado"
            }
        ));
        scrollPedidosEncon.setViewportView(PedidosEncon);

        comboEstadoP.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        comboEstadoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoPActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esperar (1).png"))); // NOI18N
        btnGuardar.setText("Estado Pedido");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUusario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar))
                    .addComponent(scrollPedidosEncon, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelUusario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scrollPedidosEncon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoPActionPerformed
			// TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoPActionPerformed

    private void txtIdPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyPressed

			if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
				if (!"".equals(txtIdPedido.getText())) {
					String id = txtIdPedido.getText();
					pe = peD.BuscarPedido(id);
					if (pe.getFecha() != null) {
						txtIdPedido.setText("" + pe.getId());
						txtFecha.setText("" + pe.getFecha());
					} else {

						txtIdPedido.requestFocus();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese el codigo del pedido");
					txtIdPedido.requestFocus();
				}
			}
    }//GEN-LAST:event_txtIdPedidoKeyPressed

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
			
        Pedido pedido = buscarPedido(txtIdPedido.getText());
			limpiarTabla();
			if (pedido.getNombreCliente() != null) {
				insertarPedido(pedido);
				JOptionPane.showMessageDialog(this, "Se encontró el pedido");
				pedidoActual = resultados.get(0);
				txtIdPedido.setText("" + pedidoActual.getId());
				txtFecha.setText(pedidoActual.getFecha());
			} else {
				JOptionPane.showMessageDialog(this, "No se el pedido");
			}

    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
  
    Pedido pedido = new Pedido();
    if(pedido.getAnticipo()>pedido.getTotal()){
    JOptionPane.showMessageDialog(null, "Entregado");
    }else{
    JOptionPane.showMessageDialog(null, "No Entregado");
     }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void limpiarTabla() {
	modelo = (DefaultTableModel) PedidosEncon.getModel();
	for (int iterador = 0; iterador < modelo.getRowCount(); iterador++) {
		modelo.removeRow(iterador);
	}
	modelo.setRowCount(0);
	PedidosEncon.setModel(modelo);
} 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PedidosEncon;
    private javax.swing.JButton btnBuscarPedido;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboEstadoP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelUusario;
    private javax.swing.JScrollPane scrollPedidosEncon;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
