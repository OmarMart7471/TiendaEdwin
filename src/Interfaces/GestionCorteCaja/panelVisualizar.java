/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionCorteCaja;

import Manejadores.ManejadorGestionCorteCaja.ManejadorCorteCaja;
import Manejadores.Principal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelVisualizar extends javax.swing.JPanel {

    private DefaultTableModel dtmCortecaja = new DefaultTableModel();
    private Principal db;
    private ManejadorCorteCaja DB;
    int filasCC;
    public panelVisualizar() {
        db =  new Principal();
        DB = new ManejadorCorteCaja();
        initComponents();
        mostrarTabla(filasCC, dtmCortecaja, tablaCorteCaja, "CorteCaja");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCorteCaja = new javax.swing.JTable();

        tablaCorteCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCC", "idEmpleado", "fecha", "total"
            }
        ));
        jScrollPane1.setViewportView(tablaCorteCaja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCorteCaja;
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
            CallableStatement cts = db.getConexion().prepareCall("SELECT * FROM "+nombreTabla);
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
  
  
}
