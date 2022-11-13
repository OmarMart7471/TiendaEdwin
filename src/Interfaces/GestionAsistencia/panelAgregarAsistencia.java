package Interfaces.GestionAsistencia;

import Manejadores.GestionAsistencia.ManejadorGestionAsistencia;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class panelAgregarAsistencia extends javax.swing.JPanel {

Manejadores.GestionAsistencia.ManejadorGestionAsistencia manejador;

public panelAgregarAsistencia() {
	manejador = new ManejadorGestionAsistencia();
	initComponents();

	insertarEmpleados();
	insertarHoraYFecha();
	deshabilitarDescuento();
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    contenedorNombreEmpleado = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    boxEmpleados = new javax.swing.JComboBox<>();
    contenedorFecha = new javax.swing.JPanel();
    lblFecha = new javax.swing.JLabel();
    txtFecha = new javax.swing.JTextField();
    contenedorHoraEntrada = new javax.swing.JPanel();
    lblHoraEntrada = new javax.swing.JLabel();
    txtHoraEntrada = new javax.swing.JTextField();
    contenedorHoraSalida = new javax.swing.JPanel();
    lblHoraSalida = new javax.swing.JLabel();
    txtHoraSalida = new javax.swing.JTextField();
    contenedorDescuentos = new javax.swing.JPanel();
    radioObservaciones = new javax.swing.JRadioButton();
    contenedorMonto = new javax.swing.JPanel();
    lblMonto = new javax.swing.JLabel();
    txtMonto = new javax.swing.JTextField();
    contenedorObservacion = new javax.swing.JPanel();
    lblObservacion = new javax.swing.JLabel();
    txtObservacion = new javax.swing.JTextField();
    btnGuardarRegistro = new javax.swing.JPanel();
    lblGuardar = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    contenedorNombreEmpleado.setPreferredSize(new java.awt.Dimension(480, 40));

    lblNombre.setText("Nombre del empleado");
    lblNombre.setMinimumSize(new java.awt.Dimension(130, 16));
    lblNombre.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorNombreEmpleado.add(lblNombre);

    boxEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(insertarEmpleados()));
    boxEmpleados.setSelectedIndex(0);
    boxEmpleados.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorNombreEmpleado.add(boxEmpleados);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 263;
    gridBagConstraints.ipady = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(31, 38, 0, 0);
    add(contenedorNombreEmpleado, gridBagConstraints);

    contenedorFecha.setMinimumSize(new java.awt.Dimension(217, 32));
    contenedorFecha.setPreferredSize(new java.awt.Dimension(480, 40));

    lblFecha.setText("Fecha");
    lblFecha.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorFecha.add(lblFecha);

    txtFecha.setMinimumSize(new java.awt.Dimension(300, 30));
    txtFecha.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorFecha.add(txtFecha);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.ipadx = 263;
    gridBagConstraints.ipady = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 38, 0, 0);
    add(contenedorFecha, gridBagConstraints);

    contenedorHoraEntrada.setPreferredSize(new java.awt.Dimension(480, 100));

    lblHoraEntrada.setText("Hora de entrada");
    lblHoraEntrada.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorHoraEntrada.add(lblHoraEntrada);

    txtHoraEntrada.setMinimumSize(new java.awt.Dimension(300, 30));
    txtHoraEntrada.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorHoraEntrada.add(txtHoraEntrada);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.ipadx = 80;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 38, 0, 0);
    add(contenedorHoraEntrada, gridBagConstraints);

    contenedorHoraSalida.setPreferredSize(new java.awt.Dimension(480, 100));

    lblHoraSalida.setText("Hora de salida");
    lblHoraSalida.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorHoraSalida.add(lblHoraSalida);

    txtHoraSalida.setEditable(false);
    txtHoraSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtHoraSalida.setToolTipText("Inserta la hora de salida en la ventana de Modificar Asistencia");
    txtHoraSalida.setMargin(new java.awt.Insets(4, 6, 4, 6));
    txtHoraSalida.setMinimumSize(new java.awt.Dimension(300, 30));
    txtHoraSalida.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorHoraSalida.add(txtHoraSalida);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.ipadx = 90;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 38, 0, 0);
    add(contenedorHoraSalida, gridBagConstraints);

    contenedorDescuentos.setMinimumSize(new java.awt.Dimension(400, 50));
    contenedorDescuentos.setPreferredSize(new java.awt.Dimension(400, 100));

    radioObservaciones.setText("Observaciones");
    radioObservaciones.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioObservacionesActionPerformed(evt);
      }
    });
    contenedorDescuentos.add(radioObservaciones);

    contenedorMonto.setPreferredSize(new java.awt.Dimension(480, 40));

    lblMonto.setText("Monto");
    lblMonto.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorMonto.add(lblMonto);

    txtMonto.setMinimumSize(new java.awt.Dimension(300, 30));
    txtMonto.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorMonto.add(txtMonto);

    contenedorDescuentos.add(contenedorMonto);

    contenedorObservacion.setPreferredSize(new java.awt.Dimension(480, 40));

    lblObservacion.setText("Observacion");
    lblObservacion.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorObservacion.add(lblObservacion);

    txtObservacion.setMinimumSize(new java.awt.Dimension(300, 30));
    txtObservacion.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorObservacion.add(txtObservacion);

    contenedorDescuentos.add(contenedorObservacion);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.ipadx = 80;
    gridBagConstraints.ipady = 73;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 38, 0, 0);
    add(contenedorDescuentos, gridBagConstraints);

    btnGuardarRegistro.setBackground(new java.awt.Color(142, 141, 141));
    btnGuardarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnGuardarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnGuardarRegistroMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnGuardarRegistrohoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnGuardarRegistrohoverSalida(evt);
      }
    });

    lblGuardar.setBackground(new java.awt.Color(255, 255, 255));
    lblGuardar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
    lblGuardar.setText("Guardar registro");

    javax.swing.GroupLayout btnGuardarRegistroLayout = new javax.swing.GroupLayout(btnGuardarRegistro);
    btnGuardarRegistro.setLayout(btnGuardarRegistroLayout);
    btnGuardarRegistroLayout.setHorizontalGroup(
      btnGuardarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 348, Short.MAX_VALUE)
      .addGroup(btnGuardarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarRegistroLayout.createSequentialGroup()
          .addContainerGap(91, Short.MAX_VALUE)
          .addComponent(lblGuardar)
          .addContainerGap(84, Short.MAX_VALUE)))
    );
    btnGuardarRegistroLayout.setVerticalGroup(
      btnGuardarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 42, Short.MAX_VALUE)
      .addGroup(btnGuardarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarRegistroLayout.createSequentialGroup()
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lblGuardar)
          .addContainerGap(7, Short.MAX_VALUE)))
    );

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.ipadx = 163;
    gridBagConstraints.ipady = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 170, 0, 0);
    add(btnGuardarRegistro, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  private void btnGuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistroMouseClicked
		if (!setRegistroAsistencia(generarRegistro())) {
			JOptionPane.showMessageDialog(null, "No se ha podido registrar la asistencia, "
							+ "puede que se deba a lo siguiente:" + "\n"
							+ "• Se perdio conexion con la base de datos" + "\n"
							+ "• Este empleado ya tiene asistencia" + "\n"
							+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al registrar la asistencia", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Registro agregado con exito", "Correcto", JOptionPane.INFORMATION_MESSAGE);
		}
		limpiarCamposDescuento();
  }//GEN-LAST:event_btnGuardarRegistroMouseClicked

  private void btnGuardarRegistrohoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistrohoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnGuardarRegistrohoverEntrada

  private void btnGuardarRegistrohoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistrohoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnGuardarRegistrohoverSalida

  private void radioObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioObservacionesActionPerformed
		if (radioObservaciones.isSelected()) {
			habilitarDescuento();
		} else {
			deshabilitarDescuento();
			limpiarCamposDescuento();
		}
  }//GEN-LAST:event_radioObservacionesActionPerformed

private String[] generarRegistro() {
	String[] registro = new String[6];
	registro[0] = getIdEmpleado(boxEmpleados.getSelectedIndex()).toString();

	if (txtFecha.getText().equals("")) {
		registro[1] = null;
	} else {
		registro[1] = txtFecha.getText();
	}
	if (txtHoraEntrada.getText().equals("")) {
		registro[2] = null;
	} else {
		registro[2] = txtHoraEntrada.getText();
	}
	registro[3] = null;
	if (txtObservacion.getText().equals("")) {
		registro[4] = null;
	} else {
		registro[4] = txtObservacion.getText();
	}
	if (txtMonto.getText().equals("")) {
		registro[5] = null;
	} else {
		registro[5] = txtMonto.getText();
	}

	return registro;
}

private String[] insertarEmpleados() {
	Object[] listaTemp = getEmpleados();
	String[] listaEmpleados = new String[listaTemp.length];

	for (int iterador = 0; iterador < listaTemp.length; iterador++) {
		listaEmpleados[iterador] = listaTemp[iterador].toString();
	}
	return listaEmpleados;
}

private boolean setRegistroAsistencia(String[] registro) {
	return manejador.insertarRegistro(registro);
}

private Object[] getEmpleados() {
	return manejador.getListaEmpleados();
}

private Object getIdEmpleado(int indice) {
	return manejador.getIdEmpleado(indice);
}

private void deshabilitarDescuento() {
	txtMonto.setEditable(false);
	txtObservacion.setEditable(false);
}

private void habilitarDescuento() {
	txtMonto.setEditable(true);
	txtObservacion.setEditable(true);
}

private void limpiarCamposDescuento() {
	txtMonto.setText("");
	txtObservacion.setText("");
}

private void insertarHoraYFecha() {
	txtFecha.setText(getFecha());
	txtHoraEntrada.setText(getHora());
}

private String getFecha() {
	return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
}

private String getHora() {
	return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
}


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> boxEmpleados;
  private javax.swing.JPanel btnGuardarRegistro;
  private javax.swing.JPanel contenedorDescuentos;
  private javax.swing.JPanel contenedorFecha;
  private javax.swing.JPanel contenedorHoraEntrada;
  private javax.swing.JPanel contenedorHoraSalida;
  private javax.swing.JPanel contenedorMonto;
  private javax.swing.JPanel contenedorNombreEmpleado;
  private javax.swing.JPanel contenedorObservacion;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblGuardar;
  private javax.swing.JLabel lblHoraEntrada;
  private javax.swing.JLabel lblHoraSalida;
  private javax.swing.JLabel lblMonto;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblObservacion;
  private javax.swing.JRadioButton radioObservaciones;
  private javax.swing.JTextField txtFecha;
  private javax.swing.JTextField txtHoraEntrada;
  private javax.swing.JTextField txtHoraSalida;
  private javax.swing.JTextField txtMonto;
  private javax.swing.JTextField txtObservacion;
  // End of variables declaration//GEN-END:variables
}
