/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionEmpleados;


import Clases.Empleado;
import Manejadores.ManejadorGEmpleado.ManejadorGestionEmpleado;
import Manejadores.Principal;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ima
 */
public class ContenedorEliminarEmpleado extends javax.swing.JPanel {

         private JPanel contenedor = null;

    
    private ManejadorGestionEmpleado consultasEmpleado;
    private Principal conectorBDEmpleado = new Principal();
    private List< Empleado > resultados;
    private Empleado empleadoActual;
    private DefaultTableModel tablaEmpleado = new DefaultTableModel();
    private ResultSet conjuntoEmpleados;
    int filas;
    
    public ContenedorEliminarEmpleado(JPanel contenedor) {
        initComponents();
       consultasEmpleado = new ManejadorGestionEmpleado();
        this.contenedor = contenedor;
        filas = tablaEmpleado.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            tablaEmpleado.removeRow(i);
        }
        tablaEmpleado.addColumn("Id");
        tablaEmpleado.addColumn("Nombre");
        tablaEmpleado.addColumn("Dirección");
        tablaEmpleado.addColumn("Teléfono");
        tablaEmpleado.addColumn("Puesto");
        tablaEmpleado.addColumn("Sexo");
        tablaEmpleado.addColumn("Pago por hora");
        this.tablaEmpleados.setModel(tablaEmpleado);
        cargarEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        idEmpleado = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel39.setText("ID");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 44, 36));

        idEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        idEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEmpleadoActionPerformed(evt);
            }
        });
        add(idEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 226, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel40.setText("ELIMINAR EMPLEADO");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        tablaEmpleados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Dirección", "Teléfono", "Puesto", "Sexo", "Pago por hora"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleados);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 960, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int resultado = consultasEmpleado.borrarEmpleado(idEmpleado.getText());
        if(resultado==1){
            JOptionPane.showMessageDialog(this, "Se elimino exitosamente");
            idEmpleado.setText("");
           cargarEmpleados();
        }else{
            JOptionPane.showMessageDialog(this, "Empleado no encontrado");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        limpiarContenido();
		contenedor.removeAll();
		contenedor.add(new Interfaces.GestionEmpleados.MenuGestionEmpleados(contenedor));
		actualizarContenido();
        
        
        
        
        
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void idEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEmpleadoActionPerformed

 
public void limpiarContenido() {
	Component componente = contenedor.getComponent(0);
	contenedor.remove(componente);
	actualizarContenido();
}

public void actualizarContenido() {
	contenedor.revalidate();
	contenedor.repaint();
}
    
    public void cargarEmpleados() {
        try {
            filas = tablaEmpleado.getRowCount();
            System.out.println("numero de filas: " + filas);
            for (int i = filas - 1; i >= 0; i--) {
                tablaEmpleado.removeRow(i);
            }
            CallableStatement cts = consultasEmpleado.getDbConection().getConexion().prepareCall("SELECT * FROM Empleado");
            System.out.println("consulta realizada");
            ResultSet r = cts.executeQuery();
            while (r.next()) {
                Object dato[] = new Object[7];
                for (int columnas = 0; columnas < 7; columnas++) {
                    dato[columnas] = r.getString(columnas + 1);
                }
                tablaEmpleado.addRow(dato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField idEmpleado;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
