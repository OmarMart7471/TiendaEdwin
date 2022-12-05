
package Interfaces.GestionPedidoCliente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Regristrar extends javax.swing.JPanel {
    
    
    private ManejadorPedidoCliente cc;
     PedidoDatos peD = new PedidoDatos();
     Pedido pe = new Pedido();
     DefaultTableModel modelo = new DefaultTableModel();
     int filas;
     
    
    public Regristrar() {
        initComponents();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            txtFeha.setText(dtf.format(LocalDateTime.now()));
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
	this.productosEncon.setModel(modelo);
         
      
    }
    
    public void insertarPedido(Pedido pedido) {
	modelo = (DefaultTableModel) productosEncon.getModel();
	modelo.addRow(pedido.getRow());
	productosEncon.setModel(modelo);
}
    
    public void cargarPedidos() {

	ArrayList<Pedido> Listape = peD.ListarPedido();
	modelo = (DefaultTableModel) productosEncon.getModel();
	for (Pedido pedido : Listape) {
		modelo.addRow(pedido.getRow());
	}
	productosEncon.setModel(modelo);
}
    public Pedido buscarPedido(String id) {
	return peD.BuscarPedido(id);
}

    
    
      public void ListarPedido() {
      List<Pedido> Listape = peD.ListarPedido();
      modelo = (DefaultTableModel) productosEncon.getModel();
      Object[] ob = new Object[7];
        for (int i = 0; i < Listape.size(); i++) {
            ob[0] = Listape.get(i).getId();
            ob[1] = Listape.get(i).getFecha();
            ob[2] = Listape.get(i).getNombreCliente();
            ob[3] = Listape.get(i).getTelefono();
            ob[4] = Listape.get(i).getCantidad();
            ob[5] = Listape.get(i).getAnticipo();
            ob[6] = Listape.get(i).getTotal();
            ob[7] = Listape.get(i).getIdVenta();
            modelo.addRow(ob);
        }
        productosEncon.setModel(modelo);

    }
      
      
          public void generarSerie(){
          String serie = peD.numSerie();
          if (serie == null){
              txtSerie.setText("0001");
          }else{
              int increment = Integer.parseInt( serie);
              increment = increment + 1;
              txtSerie.setText("000" + increment);
          }
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backUsuario = new javax.swing.JPanel();
        lblNomCli = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        lblTelefonoCli = new javax.swing.JLabel();
        txtTelefonoCli = new javax.swing.JTextField();
        lblNomProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lbllImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFeha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        comboProduc = new javax.swing.JComboBox<>();
        scrollProductosP = new javax.swing.JScrollPane();
        productosEncon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();

        backUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomCli.setText("Nombre del cliente: ");
        backUsuario.add(lblNomCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, -1, 22));
        backUsuario.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 73, 239, -1));

        lblTelefonoCli.setText("Numero de teléfono:");
        backUsuario.add(lblTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 122, 24));
        backUsuario.add(txtTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 109, 241, -1));

        lblNomProducto.setText("Nombre de producto: ");
        backUsuario.add(lblNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 24));

        lblCantidad.setText("Cantidad:");
        backUsuario.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 232, -1, 22));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        backUsuario.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 231, 300, -1));

        lbllImporte.setText("Importe:");
        backUsuario.add(lbllImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, -1, 22));
        backUsuario.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 261, 300, -1));

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        backUsuario.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel2.setText("Id: ");
        backUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 32, 24));
        backUsuario.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 20, 50, -1));

        jLabel3.setText("Fecha:");
        backUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 20, -1, 24));
        backUsuario.add(txtFeha, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 20, 121, -1));

        jLabel5.setText("idVenta:");
        backUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));
        backUsuario.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        backUsuario.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        backUsuario.add(comboProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 170, 241, -1));

        productosEncon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Nombre", "Telefono", "Cantidad", "Anticipo", "Total", "IdVenta"
            }
        ));
        scrollProductosP.setViewportView(productosEncon);

        jLabel1.setText("Productos en el pedido");

        jLabel4.setText("Total a pagar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProductosP, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProductosP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(backUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!"".equals(txtId.getText()) || !"".equals(txtFeha.getText()) ||!"".equals(txtNomCliente.getText()) || !"".equals(txtTelefonoCli.getText()) || !"".equals(txtCantidad.getText()) || !"".equals(txtImporte.getText()) || !"".equals(txtTotalPagar.getText()) || !"".equals(txtSerie.getText())){
            pe.setId(Integer.parseInt(txtId.getText()));
            pe.setFecha(txtFeha.getText());
            pe.setNombreCliente(txtNomCliente.getText());
            pe.setTelefono(txtTelefonoCli.getText());
            pe.setCantidad(Integer.parseInt(txtCantidad.getText()));
            pe.setAnticipo(Integer.parseInt(txtImporte.getText()));
            pe.setTotal(Integer.parseInt(txtTotalPagar.getText()));
            pe.setIdVenta(Integer.parseInt(txtSerie.getText()));
            peD.RegistrarPedido(pe);
            JOptionPane.showMessageDialog(null, "Pedido Registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos esta vacios");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         
        if (!"".equals(txtId.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtId.getText());
                peD.EliminarPedido(id);
                 }
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
    }//GEN-LAST:event_btnBorrarActionPerformed
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backUsuario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<String> comboProduc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblNomCli;
    private javax.swing.JLabel lblNomProducto;
    private javax.swing.JLabel lblTelefonoCli;
    private javax.swing.JLabel lbllImporte;
    private javax.swing.JTable productosEncon;
    private javax.swing.JScrollPane scrollProductosP;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFeha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
