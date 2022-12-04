/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionVenta;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author César Abarca
 */
public class ModificarVenta extends javax.swing.JPanel {

     DefaultTableModel tabla = new DefaultTableModel();
    DefaultTableModel tabla2 = new DefaultTableModel();
    int filas;
    private ResultSet conjuntoInstalacion;
    
    public Consultas CC;
    
    public ModificarVenta() throws SQLException {
        initComponents();
           CC= new Consultas();
           
           filas = tabla2.getRowCount();
        for(int i=filas-1;i>=0;i--){
            tabla2.removeRow(i);}
        tabla2.addColumn("Nombre Producto");        
        tabla2.addColumn("Cantidad");        
        tabla2.addColumn("Total");        
        
        this.jTable1.setModel(tabla2);
        cargarCombobox ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarLista = new javax.swing.JButton();
        btnBuscarPrecioProducto = new javax.swing.JButton();
        btnEliminarLista = new javax.swing.JButton();

        jLabel1.setText("ID de la Venta:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Cantidad", "Total $"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Total de la Venta: $");

        txtTotalPagar.setEditable(false);

        jLabel4.setText("Producto:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel7.setText("Total:");

        btnAgregarLista.setText("Agregar a la Lista");
        btnAgregarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarListaActionPerformed(evt);
            }
        });

        btnBuscarPrecioProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnBuscarPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrecioProductoActionPerformed(evt);
            }
        });

        btnEliminarLista.setText("Eliminar de la lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarPrecioProducto))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnAgregarLista)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarLista))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnBuscarPrecioProducto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarLista)
                            .addComponent(btnEliminarLista))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         try {
             consultaVenta();
             AgregarLista();
         } catch (SQLException ex) {
             Logger.getLogger(ModificarVenta.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarListaActionPerformed

        modificarStock();
    }//GEN-LAST:event_btnAgregarListaActionPerformed

    private void btnBuscarPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrecioProductoActionPerformed

        int cantidad;
        float tot=(float) 0.0;
        cantidad=Integer.parseInt(txtCantidad.getText());

        conjuntoInstalacion = CC.BuscaProducto(txtProducto.getSelectedItem().toString());
        filas = tabla.getRowCount();
        for(int i=filas-1; i>=0;i--){
            tabla.removeRow(i);
        }
        try{
            while(conjuntoInstalacion.next()){
                Object dato[] = new Object[10];
                for(int i=0; i<10;i++){
                    dato[0]=conjuntoInstalacion.getString("id");
                    dato[1]=conjuntoInstalacion.getString("descripcion");
                    dato[2]=conjuntoInstalacion.getString("precio");
                    dato[3]=conjuntoInstalacion.getString("stock");
                    dato[4]=conjuntoInstalacion.getString("idProveedor");

                    //Checar el dato del precio por que no nos esta retornando el valor
                    //Checar el valor de dato[2]
                }
                txtPrecio.setText((String) dato[2]);

                tot=Float.parseFloat((String) dato[2]);
                txtTotal.setText( String.valueOf(tot*cantidad) );

            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBuscarPrecioProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLista;
    private javax.swing.JButton btnBuscarPrecioProducto;
    private javax.swing.JButton btnEliminarLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JComboBox<String> txtProducto;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

public void consultaVenta() throws SQLException{

     conjuntoInstalacion = CC.ConsultaVenta(txtId.getText());
            filas = tabla.getRowCount();
            for(int i=filas-1; i>=0;i--){
                tabla.removeRow(i);
            }
        try{
            while(conjuntoInstalacion.next()){
                Object dato[] = new Object[3];
                for(int i=0; i<3;i++){
                    dato[0]=conjuntoInstalacion.getString("id");
                    dato[1]=conjuntoInstalacion.getString("fecha");
                    dato[2]=conjuntoInstalacion.getString("precioTotal");
                    
                    
                   //Checar el dato del precio por que no nos esta retornando el valor
                   //Checar el valor de dato[2]    
                }
                
                txtId.setText(String.valueOf(dato[0]));
                txtFecha.setText(String.valueOf(dato[1]));
                txtTotalPagar.setText(String.valueOf(dato[2]));
                
            
               
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
          
                }


         public void AgregarLista(){
    
        float sum=(float) 0.0;
        float total=(float) 0.0;
        String var="";
        conjuntoInstalacion = CC.consultaLista(txtId.getText());
            filas = tabla2.getRowCount();
            for(int i=filas-1; i>=0;i--){
                tabla2.removeRow(i);
                
            }
        try{
            while(conjuntoInstalacion.next()){
                Object dato[] = new Object[3];
                for(int i=0; i<3;i++){
                    dato[0]=conjuntoInstalacion.getString("descripcion");
                    dato[1]=conjuntoInstalacion.getString("cantidad");
                    dato[2]=conjuntoInstalacion.getString("total");
                    
                   
                var=String.valueOf(dato[2]);
                sum=Float.parseFloat(var);
                
                }
               total+=sum; 
                tabla2.addRow(dato);
                
                
                txtTotalPagar.setText(String.valueOf(total));
                
                
               
                
               
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        
        
        
        
        
        public void AgregarDetalleVenta(){

     conjuntoInstalacion = CC.BuscaProducto(txtProducto.getSelectedItem().toString());
            filas = tabla.getRowCount();
            for(int i=filas-1; i>=0;i--){
                tabla.removeRow(i);
            }
        try{
            while(conjuntoInstalacion.next()){
                Object dato[] = new Object[5];
                for(int i=0; i<5;i++){
                    dato[0]=conjuntoInstalacion.getString("id");
                    dato[1]=conjuntoInstalacion.getString("descripcion");
                    dato[2]=conjuntoInstalacion.getString("precio");
                    dato[3]=conjuntoInstalacion.getString("stock");
                    dato[4]=conjuntoInstalacion.getString("idProveedor");
                    
                   //Checar el dato del precio por que no nos esta retornando el valor
                   //Checar el valor de dato[2]    
                }
                
           
               
                 
               if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
        }else{
            int resultado = CC.agregarDetalleVenta((String) dato[0],txtId.getText(),txtCantidad.getText(),
                    txtPrecio.getText(),txtTotal.getText());
        if(resultado == 1){
            
            JOptionPane.showMessageDialog(this, "Se agrego un Detalle Venta");
         
        }else
            JOptionPane.showMessageDialog(this, "No se pudo agregar el Detalle Venta");
        } 
           
            
               
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
}

    
    
    public void modificarTotalVenta(){
    
        
            int resultado = CC.modificarTotalVenta(txtTotalPagar.getText(), txtId.getText());
            
        if(resultado == 1){
            JOptionPane.showMessageDialog(this, "Se modifico la Instalacion");
           
        }else
            JOptionPane.showMessageDialog(this, "No se pudo modificar la Instalacion");
        
        
    }
    
    
    public void modificarStock(){
    
        
            int resultado = CC.modificarStockProducto(txtCantidad.getText(), txtProducto.getSelectedItem().toString());
            
        if(resultado == 1){
            JOptionPane.showMessageDialog(this, "Se modifico El Stock");
             AgregarDetalleVenta();
            AgregarLista();
            modificarTotalVenta();
           
        }else
            JOptionPane.showMessageDialog(this, "No se puede agregar el producto"
                    +"\n Debido a que no cuenta con suficientes productos","Error",
                    JOptionPane.ERROR_MESSAGE);
        
        
        
    }
    
     private ArrayList <Producto_Venta> cargarProducto(){
        ArrayList <Producto_Venta> lista =  new ArrayList<>();
        try{
            CallableStatement cts = CC.getConexion().prepareCall("SELECT*FROM producto");
            ResultSet r = cts.executeQuery();
            while(r.next()){
                Producto_Venta listatemporal = new Producto_Venta(r.getString(1) , 
                r.getString(2),
                r.getString(3),
                r.getString(4),
                r.getString(5));
                lista.add(listatemporal);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
         
     private void cargarCombobox (){
        ArrayList<Producto_Venta> list = cargarProducto();
       // ArrayList<Tecnico> listT = cargarTecnicos();
        //ArrayList<Integer> listInst = cargarInstalaciones();
        //ArrayList<Equipo> listE = cargarEquipo();
        //ArrayList<Desinstalacion> listIntsD =  cargarDesinstalaciones();
        //String folio;
        for (int i = 0; i < list.size(); i++) {
            txtProducto.addItem(list.get(i).getDescripcion());
            
            
        }
        
        
        /*
        for (int i = 0; i < listIntsD.size(); i++) {
            int folioT = listIntsD.get(i).getFolioDes();
            folio = Integer.toString(folioT);
            cmbxFolioDesinst.addItem(folio);
        }
        
        for (int i = 0; i < listInst.size(); i++) {
            int folioI = listInst.get(i);
            folio = Integer.toString(folioI);
            cmbxFolioInst.addItem(folio);
        }
        
        for (int i = 0; i < listE.size(); i++) {
            cmbxEquipoInst.addItem(listE.get(i).getNombreE());
            cmbxEqDesinst.addItem(listE.get(i).getNombreE());
        }*/
        
    }
    
}