package Interfaces.GestionNomina;

import Manejadores.GestionAsistencia.ManejadorGestionAsistencia;
import Manejadores.GestionNomina.ManejadorGestionNomina;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelModificarNomina extends javax.swing.JPanel {

Manejadores.GestionNomina.ManejadorGestionNomina manejador;
private DefaultTableModel modeloTablaFechas;

public panelModificarNomina() {
	manejador = new ManejadorGestionNomina();
	initComponents();
	modeloTablaFechas = (DefaultTableModel) tablaFechas.getModel();
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contenedorPrincipal = new javax.swing.JPanel();
    contenedorEmpleado = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    boxEmpleados = new javax.swing.JComboBox<>();
    contenedorFecha = new javax.swing.JPanel();
    lblFecha = new javax.swing.JLabel();
    txtFecha = new javax.swing.JTextField();
    contenedorHorasTrabajadas = new javax.swing.JPanel();
    lblHorasTrabajadas = new javax.swing.JLabel();
    txtHorasTrabajadas = new javax.swing.JTextField();
    contenedorHorasTrabajadas1 = new javax.swing.JPanel();
    lblPagoPorHora = new javax.swing.JLabel();
    txtPagoPorHora = new javax.swing.JTextField();
    btnGuardarRegistro = new javax.swing.JPanel();
    lblGuardar = new javax.swing.JLabel();
    contenedorTabla = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaFechas = new javax.swing.JTable();

    setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

    contenedorEmpleado.setPreferredSize(new java.awt.Dimension(480, 40));

    lblNombre.setText("Nombre del empleado");
    lblNombre.setMinimumSize(new java.awt.Dimension(130, 16));
    lblNombre.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorEmpleado.add(lblNombre);

    boxEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(insertarEmpleados()));
    boxEmpleados.setSelectedIndex(0);
    boxEmpleados.setPreferredSize(new java.awt.Dimension(300, 30));
    boxEmpleados.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        boxEmpleadosItemStateChanged(evt);
      }
    });
    contenedorEmpleado.add(boxEmpleados);

    contenedorFecha.setMinimumSize(new java.awt.Dimension(217, 32));
    contenedorFecha.setPreferredSize(new java.awt.Dimension(480, 40));

    lblFecha.setText("Fecha");
    lblFecha.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorFecha.add(lblFecha);

    txtFecha.setEditable(false);
    txtFecha.setToolTipText("Seleccione una fecha de la tabla");
    txtFecha.setMinimumSize(new java.awt.Dimension(300, 30));
    txtFecha.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorFecha.add(txtFecha);

    contenedorHorasTrabajadas.setPreferredSize(new java.awt.Dimension(480, 100));

    lblHorasTrabajadas.setText("Horas trabajadas");
    lblHorasTrabajadas.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorHorasTrabajadas.add(lblHorasTrabajadas);

    txtHorasTrabajadas.setToolTipText("");
    txtHorasTrabajadas.setMargin(new java.awt.Insets(4, 6, 4, 6));
    txtHorasTrabajadas.setMinimumSize(new java.awt.Dimension(300, 30));
    txtHorasTrabajadas.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorHorasTrabajadas.add(txtHorasTrabajadas);

    contenedorHorasTrabajadas1.setPreferredSize(new java.awt.Dimension(480, 100));

    lblPagoPorHora.setText("Pago por hora");
    lblPagoPorHora.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorHorasTrabajadas1.add(lblPagoPorHora);

    txtPagoPorHora.setToolTipText("");
    txtPagoPorHora.setMargin(new java.awt.Insets(4, 6, 4, 6));
    txtPagoPorHora.setMinimumSize(new java.awt.Dimension(300, 30));
    txtPagoPorHora.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorHorasTrabajadas1.add(txtPagoPorHora);

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

    javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
    contenedorPrincipal.setLayout(contenedorPrincipalLayout);
    contenedorPrincipalLayout.setHorizontalGroup(
      contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(contenedorHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(contenedorPrincipalLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(contenedorHorasTrabajadas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contenedorPrincipalLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(contenedorEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(contenedorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
              .addGap(66, 66, 66)
              .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    contenedorPrincipalLayout.setVerticalGroup(
      contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(contenedorPrincipalLayout.createSequentialGroup()
        .addGap(122, 122, 122)
        .addComponent(contenedorHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(34, 34, 34)
        .addComponent(contenedorHorasTrabajadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(210, Short.MAX_VALUE))
      .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contenedorPrincipalLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(contenedorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addComponent(contenedorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(258, 258, 258)
          .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    add(contenedorPrincipal);

    tablaFechas.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fechas"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaFechas.setMaximumSize(new java.awt.Dimension(300, 700));
    tablaFechas.setMinimumSize(new java.awt.Dimension(200, 300));
    tablaFechas.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaFechasMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tablaFechas);

    contenedorTabla.add(jScrollPane1);

    add(contenedorTabla);
  }// </editor-fold>//GEN-END:initComponents

  private void btnGuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistroMouseClicked
		if (!setActualizarNomina(generarRegistro())) {
		JOptionPane.showMessageDialog(null, "No se han podido consultar las fechas de Nomina, "
						+ "puede que se deba a lo siguiente:" + "\n"
						+ "• Se perdio conexion con la base de datos" + "\n"
						+ "• Este empleado no tiene pagos de Nomina" + "\n"
						+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al consultar las nominas", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Registro modificado con exito", "Correcto", JOptionPane.INFORMATION_MESSAGE);
		}
  }//GEN-LAST:event_btnGuardarRegistroMouseClicked

  private void btnGuardarRegistrohoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistrohoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnGuardarRegistrohoverEntrada

  private void btnGuardarRegistrohoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistrohoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnGuardarRegistrohoverSalida

  private void boxEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxEmpleadosItemStateChanged
		if (evt.getStateChange() == 1) {
			Object[] fechas = getFechasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()));
			insertarFechasTabla(fechas);
		}

  }//GEN-LAST:event_boxEmpleadosItemStateChanged

  private void tablaFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFechasMouseClicked
		String fecha = modeloTablaFechas.getValueAt(tablaFechas.getSelectedRow(), 0).toString();
		String idEmpleado = getIdEmpleado(boxEmpleados.getSelectedIndex()).toString();
		txtFecha.setText(fecha);
		rellenarCamposFaltantes(idEmpleado, fecha);
  }//GEN-LAST:event_tablaFechasMouseClicked

private void rellenarCamposFaltantes(String idEmpleado, String fecha) {
	Object[] fila = manejador.getCamposFaltantes(idEmpleado, fecha);
	txtHorasTrabajadas.setText(fila[0].toString());
	txtPagoPorHora.setText(fila[1].toString());
}

private void insertarFechasTabla(Object[] fechas) {
	limpiarPanel();
	
	if (fechas.length > 0) {
		for (int contador = 0; contador < fechas.length; contador++) {
			Object[] fila = new Object[1];
			fila[0] = fechas[contador];
			modeloTablaFechas.addRow(fila);
		}
	} else {
		JOptionPane.showMessageDialog(null, "No se han podido consultar las fechas de Nomina, "
						+ "puede que se deba a lo siguiente:" + "\n"
						+ "• Se perdio conexion con la base de datos" + "\n"
						+ "• Este empleado no tiene pagos de Nomina" + "\n"
						+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al consultar las nominas", JOptionPane.ERROR_MESSAGE);
	}
}

private String[] insertarEmpleados() {
	Object[] listaTemp = getEmpleados();
	String[] listaEmpleados = new String[listaTemp.length];
	
	for (int iterador = 0; iterador < listaTemp.length; iterador++) {
		listaEmpleados[iterador] = listaTemp[iterador].toString();
	}
	return listaEmpleados;
}

private String[] generarRegistro() {
	String[] registro = new String[4];

	if (txtPagoPorHora.getText().equals("")) {
		registro[0] = null;
	} else {
		registro[0] = txtPagoPorHora.getText();
	}
	if (txtHorasTrabajadas.getText().equals("")) {
		registro[1] = null;
	} else {
		registro[1] = txtHorasTrabajadas.getText();
	}
	registro[2] = getIdEmpleado(boxEmpleados.getSelectedIndex()).toString();
	if (txtFecha.getText().equals("")) {
		registro[3] = null;
	} else {
		registro[3] = txtFecha.getText();
	}
	return registro;
}

private boolean setActualizarNomina(String[] registro) {
	return manejador.actualizarRegistro(registro);
}

private Object[] getEmpleados() {
	return manejador.getListaEmpleados();
}

private Object[] getFechasEmpleado(Object idEmpleado) {
	return manejador.getFechasEmpleado(idEmpleado);
}

private Object getIdEmpleado(int indice) {
	return manejador.getIdEmpleado(indice);
}

private void limpiarPanel() {
	txtFecha.setText("");
	txtPagoPorHora.setText("");
	txtHorasTrabajadas.setText("");
	
	limpiarTabla();
}

private void limpiarTabla() {
	for (int iterador = 0; iterador < modeloTablaFechas.getRowCount(); iterador++) {
		modeloTablaFechas.removeRow(iterador);
	}
	modeloTablaFechas.setRowCount(0);
}



  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> boxEmpleados;
  private javax.swing.JPanel btnGuardarRegistro;
  private javax.swing.JPanel contenedorEmpleado;
  private javax.swing.JPanel contenedorFecha;
  private javax.swing.JPanel contenedorHorasTrabajadas;
  private javax.swing.JPanel contenedorHorasTrabajadas1;
  private javax.swing.JPanel contenedorPrincipal;
  private javax.swing.JPanel contenedorTabla;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblGuardar;
  private javax.swing.JLabel lblHorasTrabajadas;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblPagoPorHora;
  private javax.swing.JTable tablaFechas;
  private javax.swing.JTextField txtFecha;
  private javax.swing.JTextField txtHorasTrabajadas;
  private javax.swing.JTextField txtPagoPorHora;
  // End of variables declaration//GEN-END:variables
}
