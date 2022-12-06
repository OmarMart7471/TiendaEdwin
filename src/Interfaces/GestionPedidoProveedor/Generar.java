
package Interfaces.GestionPedidoProveedor;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Generar extends javax.swing.JPanel { 
    Pedido pe = new Pedido();
    PedidoDatos peD = new PedidoDatos();
    public PedidoDatos CC;
    private List<Pedido> resultados;
    private Pedido instalacionActual;
    DefaultTableModel tabla = new DefaultTableModel();
    int filas;
    private ResultSet conjuntoInstalacion;
    
    JPanel contenedorPrincipal = null;
    public Generar() throws SQLException {
        initComponents();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            txtFecha.setText(dtf.format(LocalDateTime.now()));
            
            
        CC = new PedidoDatos();
        filas = tabla.getRowCount();
        for(int i = filas-1; i>= 0; i--){
        tabla.removeRow(i);}
        tabla.addColumn("id");        
        tabla.addColumn("descripcion");        
        tabla.addColumn("precio");        
        tabla.addColumn("stock");        
        tabla.addColumn("idProveedor");
        this.ProEncontrados.setModel(tabla);
        ListarProductos();
        
    }
    
    public void ListarProductos() {
        List<Productos> ListarPro = peD.ListarProductos();
        tabla = (DefaultTableModel) ProEncontrados.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0] = ListarPro.get(i).getId();
            ob[1] = ListarPro.get(i).getDescripcion();
            ob[2] = ListarPro.get(i).getPrecio();
            ob[3] = ListarPro.get(i).getStock();
            ob[4] = ListarPro.get(i).getIdProveedor();
            tabla.addRow(ob);
        }
       ProEncontrados.setModel(tabla);

    }
    
    public void ListarProveedor() {
        List<Proveedor> ListarPr = peD.ListarProveedor();
        tabla = (DefaultTableModel) ProEncontrados.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0] = ListarPr.get(i).getId();
            ob[1] = ListarPr.get(i).getNombre();
            ob[2] = ListarPr.get(i).getTelefono();
            ob[3] = ListarPr.get(i).getEmpresa();
            tabla.addRow(ob);
        }
        ProEncontrados.setModel(tabla);

    }
    
    private void LimpiarPedido() {
        txtId.setText("");
        txtProducto.setText("");
        txtProvee.setText("");
        txtCantidad.setText("");
        txtAnticipo.setText("");
        txtTotal.setText("");
    }
    
      
      
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelUsuario = new javax.swing.JPanel();
        lblNombrePro = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblProveedores = new javax.swing.JLabel();
        lblAnticipo = new javax.swing.JLabel();
        txtAnticipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGenerarPedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProvee = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        scrollProEncon = new javax.swing.JScrollPane();
        ProEncontrados = new javax.swing.JTable();
        lblProEn = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblNombrePro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblNombrePro.setText("Productos:");

        lblCantidad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblCantidad.setText("Cantidad:");

        lblProveedores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblProveedores.setText("Proveedores:");

        lblAnticipo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAnticipo.setText("Anticipo:");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Total:");

        btnGenerarPedido.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnGenerarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar (1).png"))); // NOI18N
        btnGenerarPedido.setText("Generar pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("Id:");

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelUsuarioLayout.createSequentialGroup()
                                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnticipo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtTotal)))
                            .addGroup(panelUsuarioLayout.createSequentialGroup()
                                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                                        .addComponent(lblProveedores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                                        .addComponent(lblCantidad)
                                        .addGap(26, 26, 26)))
                                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtProvee, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(panelUsuarioLayout.createSequentialGroup()
                                .addComponent(lblNombrePro)
                                .addGap(18, 18, 18)
                                .addComponent(txtProducto)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 151, Short.MAX_VALUE))))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProEncontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre del producto", "Precio", "Stock"
            }
        ));
        scrollProEncon.setViewportView(ProEncontrados);

        lblProEn.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblProEn.setText("Pedidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProEncon, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProEn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProEncon, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        
        if (!"".equals(txtId.getText()) || !"".equals(txtFecha.getText())  || !"".equals(txtCantidad.getText())
             || !"".equals(txtAnticipo.getText()) || !"".equals(txtTotal.getText()) || !"".equals(txtProducto.getText()) || !"".equals(txtProvee.getText()) ) {
            pe.setIdPedido(Integer.parseInt(txtId.getText()));
            pe.setFecha(txtFecha.getText());
            pe.setCantidad(Integer.parseInt(txtCantidad.getText()));
            pe.setAnticipo(Integer.parseInt(txtAnticipo.getText()));
            pe.setTotal(Integer.parseInt(txtTotal.getText()));
            pe.setIdProducto(Integer.parseInt(txtProducto.getText()));
            pe.setIdProveedor(txtProvee.getText());
            peD.RegistrarPedido(pe);
            JOptionPane.showMessageDialog(null, "Productos Registrado");
            LimpiarPedido();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

     
        
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProEncontrados;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAnticipo;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblNombrePro;
    private javax.swing.JLabel lblProEn;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JScrollPane scrollProEncon;
    private javax.swing.JTextField txtAnticipo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProvee;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
