/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionUsuarios;

import Clases.Usuario;
import Manejadores.ManejadorGUsuarios.ManejadorGUsuarios;
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
public class contenedorModificarUsuario extends javax.swing.JPanel {

    private JPanel contenedor = null;
    private ManejadorGUsuarios consultasusuarios;
    private Principal conectorBDUsuario = new Principal();
    private List< Usuario> resultados;
    private Usuario usuarioActual;
    private DefaultTableModel tablaUsuario = new DefaultTableModel();
    private ResultSet conjuntoUsuarios;
    int filas;

    public contenedorModificarUsuario(JPanel contenedor) {
        initComponents();
        consultasusuarios = new ManejadorGUsuarios();
        this.contenedor = contenedor;
        filas = tablaUsuario.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            tablaUsuario.removeRow(i);
        }
        tablaUsuario.addColumn("usuario");
        tablaUsuario.addColumn("contrasena");
        tablaUsuario.addColumn("contrasenaRecuperar");
        this.tablaUsuarios.setModel(tablaUsuario);
        cargarUsuarios();
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
        tablaUsuarios = new javax.swing.JTable();
        contraRecuper = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contrasena = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contrasena", "contrasenaRecuperar"
            }
        ));
        jScrollPane2.setViewportView(tablaUsuarios);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 346, 646, 230));

        contraRecuper.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(contraRecuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 238, 270, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Usuario:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 101, -1, -1));

        usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 105, 173, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Contraseña:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 155, -1, -1));

        contrasena.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 155, 163, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText(" pregunta de recuperacion:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 195, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿En que ciudad Naciste?", "¿Nombre de tu primera mascota?", "¿Cuando es tu cumpleaños?", "¿Cual es tu numero de celular?" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 192, 277, -1));

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 293, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Respuesta de recuperacion:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 241, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICAR USUARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 49, -1, -1));

        btnModificar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 301, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 101, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        limpiarContenido();
        contenedor.removeAll();
        contenedor.add(new Interfaces.GestionUsuarios.MenuGestionUsuario(contenedor));
        actualizarContenido();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if(usuario.getText().isEmpty() || contrasena.getText().isEmpty()||contraRecuper.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
        } else {
            int resultado = consultasusuarios.modificarUsuario(usuario.getText(), contrasena.getText(),
                contraRecuper.getText());
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
                cargarUsuarios();
                usuario.setText("");
                contrasena.setText("");
                contraRecuper.setText("");
               
            } else {
                JOptionPane.showMessageDialog(this, "No se actualizo");
            }
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        resultados = consultasusuarios.buscarUsuario(usuario.getText());
        if (resultados.size() != 0) {
            JOptionPane.showMessageDialog(this, "Se encontro Usuario");
            usuarioActual = resultados.get(0);
            usuario.setText(usuarioActual.getUsuario());
            contrasena.setText(usuarioActual.getContrasena());
            contraRecuper.setText(usuarioActual.getContraRecuper());
 
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el Usuario");
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
 public void cargarUsuarios() {
        try {
            filas = tablaUsuario.getRowCount();
            System.out.println("numero de filas: " + filas);
            for (int i = filas - 1; i >= 0; i--) {
                tablaUsuario.removeRow(i);
            }
            CallableStatement cts = consultasusuarios.getDbConection().getConexion().prepareCall("SELECT * FROM Usuario");
            System.out.println("consulta realizada");
            ResultSet r = cts.executeQuery();
            while (r.next()) {
                Object dato[] = new Object[3];
                for (int columnas = 0; columnas < 3; columnas++) {
                    dato[columnas] = r.getString(columnas + 1);
                }
                tablaUsuario.addRow(dato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField contraRecuper;
    private javax.swing.JTextField contrasena;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
