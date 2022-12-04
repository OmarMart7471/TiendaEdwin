/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionCorteCaja;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Manejadores.Principal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Omar Mtz
 */
public class panelAgregarCorteCaja extends javax.swing.JPanel {

    private DefaultTableModel dtmVentasHoy = new DefaultTableModel();
    private Principal db;
    private int filasV;
    public panelAgregarCorteCaja() {
        db =  new Principal();
        initComponents();
        mostrarTabla(filasV, dtmVentasHoy, tablaVentasHoy, "Venta");
        cargarCombobox();
        labelNumVentas.setText(""+numVentasHoy());
        labelTotalVentas.setText(""+totalVentasHoy());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentasHoy = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNumVentas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTotalVentas = new javax.swing.JLabel();
        cmbxEmpleados = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        tablaVentasHoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "fecha", "precioTotal"
            }
        ));
        jScrollPane1.setViewportView(tablaVentasHoy);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("DATOS DEL CORTE DE CAJA:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("NÚMERO DE VENTAS:");

        labelNumVentas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        labelNumVentas.setText("total");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("TOTAL: ");

        labelTotalVentas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        labelTotalVentas.setText("total");

        cmbxEmpleados.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbxEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un empleado" }));
        cmbxEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxEmpleadosItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("HORA DE SALIDA: ");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("FECHA: ");

        txtHora.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtFecha.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR CORTE DE CAJA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNumVentas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHora))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbxEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotalVentas))
                            .addComponent(jLabel1))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(97, 97, 97)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(cmbxEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelNumVentas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelTotalVentas))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxEmpleadosItemStateChanged
        insertarHoraYFecha();
        
    }//GEN-LAST:event_cmbxEmpleadosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbxEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNumVentas;
    private javax.swing.JLabel labelTotalVentas;
    private javax.swing.JTable tablaVentasHoy;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables

    public void mostrarTabla(int filasT,DefaultTableModel modeltabla,JTable Jtabla,String nombreTabla){
        filasT = modeltabla.getRowCount();
        //CREAMOS EL ARRAY QUE GUARDARA LOS NOMBRES DE LOS CAMPOS
        ArrayList<String> nombreCampos = new ArrayList<>();
        try{
            //CONSULTA QUE OBTIENE LA CANTIDAD DE COLUMNAS DE LA TABLA A VISUALIZAR
            CallableStatement cts = db.getConexion().prepareCall("SHOW COLUMNS FROM "+nombreTabla);
            ResultSet r = cts.executeQuery();
            while(r.next()==true){
                //OBTENEMOS LOS NOMBRES DE LAS COLUMNAS EN EL ARRAY
                nombreCampos.add(r.getString("Field"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        //SE BORRAN LOS DATOS QUE SE TENIAN EN LA TABLA
        for(int i=filasT-1;i>=0;i--){
            modeltabla.removeRow(i);
        }
        //SE AGREGAN LOS CAMPOS AL MODELO DE LA TABLA
        for (String campo : nombreCampos) {
            modeltabla.addColumn(campo);
        }  
        //AGREGAMOS EL MODELO A LA TABLA
        Jtabla.setModel(modeltabla);
        //CARGAMOS LOS DATOS CON EL SIGUIENTE METODO
        cargarDatos(filasT,modeltabla,nombreTabla);
    }
    
    public void cargarDatos(int filasE,DefaultTableModel modeltabla,String nombreTabla){
        //INICIALIZAMOS UN TAMAÑO DE COLUMNAS
        int tamanioColumnas=0;
        try{
            //CONSULTA QUE NOS DICE CUANTAS COLUMNAS TIENE NUESTRA TABLA                                                                                                                                      //NOMBRE DE LA BASE DE DATOS
            CallableStatement cts = db.getConexion().prepareCall("SELECT TABLE_NAME, count( COLUMN_NAME ) FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name = '"+nombreTabla+"' AND table_schema = 'sql9556799';");
            ResultSet r = cts.executeQuery();
            while(r.next()){
                //OBTENEMOS EL TOTAL DE COLUMNAS
                    tamanioColumnas = r.getInt(2);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            //REINICIAMOS LOS DATOS DE LA TABLA
            filasE=modeltabla.getRowCount();
            for(int i =filasE-1;i>=0;i--){
                modeltabla.removeRow(i);
            }
            //CONSULTA CON LA QUE OBTENEMOS LOS DATOS DE LA TABLA
            CallableStatement cts = db.getConexion().prepareCall("SELECT * FROM "+nombreTabla+" WHERE fecha = CURDATE()");
            ResultSet r = cts.executeQuery();
            
            //PROCESO DE ACCESO Y SUBIDA DE DATOS EN LA TABLA
            while(r.next()){
                Object dato[] = new Object[tamanioColumnas];
                for(int i=0; i < tamanioColumnas;i++){
                    dato[i]=r.getString(i+1);
                }
                modeltabla.addRow(dato);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private int numVentasHoy(){
        int total=0;
        try{
            //CONSULTA QUE OBTIENE LA CANTIDAD DE COLUMNAS DE LA TABLA A VISUALIZAR
            CallableStatement cts = db.getConexion().prepareCall("SELECT COUNT(*) FROM Venta WHERE fecha = CURDATE()");
            ResultSet r = cts.executeQuery();
            while(r.next()==true){
                total =  r.getInt(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;
    }
    
    private float totalVentasHoy(){
        float total=0;
        try{
            //CONSULTA QUE OBTIENE LA CANTIDAD DE COLUMNAS DE LA TABLA A VISUALIZAR
            CallableStatement cts = db.getConexion().prepareCall("SELECT SUM(precioTotal) FROM Venta WHERE fecha = CURDATE()");
            ResultSet r = cts.executeQuery();
            while(r.next()==true){
                total =  r.getFloat(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;
    } 
    
    private ArrayList <String> cargarListaEmpleados(){
        ArrayList <String> lista =  new ArrayList<>();
        String nombre ;
        try{
            CallableStatement cts = db.getConexion().prepareCall("SELECT nombre FROM Empleado");
            ResultSet r = cts.executeQuery();
            while(r.next()){
                nombre = r.getString(1);
                lista.add(nombre);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
     
    private void cargarCombobox (){
       
        ArrayList<String> list = cargarListaEmpleados();
        

        for (int i = 0; i < list.size(); i++) {
            cmbxEmpleados.addItem(list.get(i));
        }
       
        
    }
     
    private String getFecha() {
	return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    }

    private String getHora() {
	return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    }
    
    private void insertarHoraYFecha() {
	txtFecha.setText(getFecha());
	txtHora.setText(getHora());
    }
}
