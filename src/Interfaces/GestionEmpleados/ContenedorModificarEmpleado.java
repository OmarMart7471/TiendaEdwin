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
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ima
 */
public class ContenedorModificarEmpleado extends javax.swing.JPanel {

    private ManejadorGestionEmpleado consultasEmpleado;
    private Principal conectorBDEmpleado = new Principal();
    private List<Empleado> resultados;
    private Empleado empleadoActual;
    private DefaultTableModel tablaEmpleado = new DefaultTableModel();
    private ResultSet conjuntoEmpleados;
    private JPanel contenedor = null;
    int filas;

    /**
     * Creates new form ContenedorModificarEmpleado
     */
    public ContenedorModificarEmpleado(JPanel contenedor) {
        initComponents();
        this.contenedor = contenedor;
        consultasEmpleado = new ManejadorGestionEmpleado();
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

        jLabel41 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        direccionEmpleado = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        numEmpleado = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        puestoEmpleado = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        idBus = new javax.swing.JTextField();
        sexoEmpleado = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JTextField();
        pagoEmpleado = new javax.swing.JTextField();
        idEmpleado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel41.setText("DIRECCIÓN");
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        btnModificar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, -1, -1));

        direccionEmpleado.setColumns(20);
        direccionEmpleado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccionEmpleado.setRows(5);
        jScrollPane1.setViewportView(direccionEmpleado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 226, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel46.setText("NOMBRE ");
        add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel42.setText("TELEFONO");
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 212, -1));

        numEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        add(numEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 226, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel44.setText("PUESTO");
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        puestoEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        puestoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza", "Cajer@", "Estibador" }));
        puestoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoEmpleadoActionPerformed(evt);
            }
        });
        add(puestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 226, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel39.setText("ID");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 44, 36));

        jLabel43.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel43.setText("SEXO");
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        idBus.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        idBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBusActionPerformed(evt);
            }
        });
        add(idBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 190, 40));

        sexoEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        sexoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        sexoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoEmpleadoActionPerformed(evt);
            }
        });
        add(sexoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 226, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel40.setText("MODIFICAR EMPLEADO");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 10, -1, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel45.setText("PAGO/HORA");
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 67));

        nombreEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoActionPerformed(evt);
            }
        });
        add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 226, -1));

        pagoEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pagoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoEmpleadoActionPerformed(evt);
            }
        });
        add(pagoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 226, -1));

        idEmpleado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        idEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEmpleadoActionPerformed(evt);
            }
        });
        add(idEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 226, -1));

        btnBuscar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        tablaEmpleados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Dirección", "Teléfono", "Puesto", "Sexo", "Pago por hora"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleados);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 960, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (idEmpleado.getText().isEmpty() || nombreEmpleado.getText().isEmpty() || direccionEmpleado.getText().isEmpty() || numEmpleado.getText().isEmpty() || pagoEmpleado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
        } else {
            int resultado = consultasEmpleado.modificarEmpleado(idEmpleado.getText(), nombreEmpleado.getText(),
                    direccionEmpleado.getText(), numEmpleado.getText(), puestoEmpleado.getSelectedItem().toString(),
                    sexoEmpleado.getSelectedItem().toString(), pagoEmpleado.getText());
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
                cargarEmpleados();
                idBus.setText("");
                idEmpleado.setText("");
                nombreEmpleado.setText("");
                direccionEmpleado.setText("");
                numEmpleado.setText("");
                puestoEmpleado.setSelectedItem("");
                sexoEmpleado.setSelectedItem("");
                pagoEmpleado.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se actualizo");
            }
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        limpiarContenido();
        contenedor.removeAll();
        contenedor.add(new Interfaces.GestionEmpleados.MenuGestionEmpleados(contenedor));
        actualizarContenido();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void puestoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoEmpleadoActionPerformed

    private void idBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBusActionPerformed

    private void sexoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoEmpleadoActionPerformed

    private void nombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoActionPerformed

    private void pagoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagoEmpleadoActionPerformed

    private void idEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEmpleadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        resultados = consultasEmpleado.buscarEmpleado(idBus.getText());
        if (resultados.size() != 0) {
            JOptionPane.showMessageDialog(this, "Se encontro Empleado");
            empleadoActual = resultados.get(0);
            idEmpleado.setText(empleadoActual.getIdEmpleado());
            nombreEmpleado.setText(empleadoActual.getNombreEmpleado());
            direccionEmpleado.setText(empleadoActual.getDireccionEmpleado());
            numEmpleado.setText(empleadoActual.getNumeroTelefono());
            puestoEmpleado.setSelectedItem("" + empleadoActual.getPuesto());
            sexoEmpleado.setSelectedItem("" + empleadoActual.getSexo());
            pagoEmpleado.setText("" + empleadoActual.getPagoPorhora());

            idBus.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro la cancion");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextArea direccionEmpleado;
    private javax.swing.JTextField idBus;
    private javax.swing.JTextField idEmpleado;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JTextField numEmpleado;
    private javax.swing.JTextField pagoEmpleado;
    private javax.swing.JComboBox<String> puestoEmpleado;
    private javax.swing.JComboBox<String> sexoEmpleado;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}