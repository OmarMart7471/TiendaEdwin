package Interfaces.GestionAsistencia;

import Manejadores.GestionAsistencia.ManejadorGestionAsistencia;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelEliminarAsistencia extends javax.swing.JPanel {

Manejadores.GestionAsistencia.ManejadorGestionAsistencia manejador;
private DefaultTableModel modeloTabla;

public panelEliminarAsistencia() {
	manejador = new ManejadorGestionAsistencia();
	initComponents();
	deshabilitarBotonEliminar();
	modeloTabla = (DefaultTableModel) tablaFechas.getModel();
	insertarFilasTabla(getFilasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString()));
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contenedorEmpleado = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    boxEmpleados = new javax.swing.JComboBox<>();
    btnEliminiarRegistro = new javax.swing.JPanel();
    lblEliminar = new javax.swing.JLabel();
    contenedorTabla = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaFechas = new javax.swing.JTable();

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

    btnEliminiarRegistro.setBackground(new java.awt.Color(142, 141, 141));
    btnEliminiarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnEliminiarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnEliminiarRegistroMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnEliminiarRegistrohoverEntrada(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnEliminiarRegistrohoverSalida(evt);
      }
    });

    lblEliminar.setBackground(new java.awt.Color(255, 255, 255));
    lblEliminar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
    lblEliminar.setText("Eliminar Registro");

    javax.swing.GroupLayout btnEliminiarRegistroLayout = new javax.swing.GroupLayout(btnEliminiarRegistro);
    btnEliminiarRegistro.setLayout(btnEliminiarRegistroLayout);
    btnEliminiarRegistroLayout.setHorizontalGroup(
      btnEliminiarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 357, Short.MAX_VALUE)
      .addGroup(btnEliminiarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminiarRegistroLayout.createSequentialGroup()
          .addContainerGap(91, Short.MAX_VALUE)
          .addComponent(lblEliminar)
          .addContainerGap(84, Short.MAX_VALUE)))
    );
    btnEliminiarRegistroLayout.setVerticalGroup(
      btnEliminiarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 42, Short.MAX_VALUE)
      .addGroup(btnEliminiarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminiarRegistroLayout.createSequentialGroup()
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lblEliminar)
          .addContainerGap(7, Short.MAX_VALUE)))
    );

    tablaFechas.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fecha", "Hora entrada", "Hora salida", "Observacion", "Monto"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaFechas.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaFechasMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tablaFechas);

    javax.swing.GroupLayout contenedorTablaLayout = new javax.swing.GroupLayout(contenedorTabla);
    contenedorTabla.setLayout(contenedorTablaLayout);
    contenedorTablaLayout.setHorizontalGroup(
      contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 594, Short.MAX_VALUE)
      .addGroup(contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contenedorTablaLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    contenedorTablaLayout.setVerticalGroup(
      contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
      .addGroup(contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contenedorTablaLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addComponent(contenedorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnEliminiarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(125, 125, 125)))
        .addGap(4, 4, 4))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(54, 54, 54)
        .addComponent(contenedorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(33, 33, 33)
        .addComponent(contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnEliminiarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void boxEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxEmpleadosItemStateChanged
		if (evt.getStateChange() == 1) {
			Object[][] tabla = getFilasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString());
			insertarFilasTabla(tabla);
		} else {
			limpiarTabla();
		}
  }//GEN-LAST:event_boxEmpleadosItemStateChanged

  private void btnEliminiarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminiarRegistroMouseClicked
		if (!setEliminarRegistro(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString(), getFecha())) {
			JOptionPane.showMessageDialog(null, "No se ha podido registrar la asistencia, "
							+ "puede que se deba a lo siguiente:" + "\n"
							+ "• Se perdio conexion con la base de datos" + "\n"
							+ "• Este empleado ya tiene asistencia" + "\n"
							+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al registrar la asistencia", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Registro eliminado con exito", "Correcto", JOptionPane.INFORMATION_MESSAGE);
			deshabilitarBotonEliminar();
			insertarFilasTabla(getFilasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString()));
		}
  }//GEN-LAST:event_btnEliminiarRegistroMouseClicked

  private void btnEliminiarRegistrohoverEntrada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminiarRegistrohoverEntrada
		evt.getComponent().setBackground(new Color(94, 92, 92));
  }//GEN-LAST:event_btnEliminiarRegistrohoverEntrada

  private void btnEliminiarRegistrohoverSalida(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminiarRegistrohoverSalida
		evt.getComponent().setBackground(new Color(142, 141, 141));
  }//GEN-LAST:event_btnEliminiarRegistrohoverSalida

  private void tablaFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFechasMouseClicked
		habilitarBotonEliminar();
  }//GEN-LAST:event_tablaFechasMouseClicked

private void insertarFilasTabla(Object[][] tabla) {
	limpiarTabla();
	if (tabla.length > 0) {
		Object[] fila = new Object[tabla[0].length];
		//Recorre las filas
		for (int numFila = 0; numFila < tabla.length; numFila++) {
			//Recorre las columnas
			for (int numColumna = 0; numColumna < 5; numColumna++) {
				fila[numColumna] = tabla[numFila][numColumna];
			}
			modeloTabla.addRow(fila);
		}
	} else {
		JOptionPane.showMessageDialog(null, "No se han podido consultar las fechas de asistencia, "
						+ "puede que se deba a lo siguiente:" + "\n"
						+ "• Se perdio conexion con la base de datos" + "\n"
						+ "• Este empleado no tiene asistencias" + "\n"
						+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al consultar las asistencias", JOptionPane.ERROR_MESSAGE);
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

private Object[][] getFilasEmpleado(String idEmpleado) {
	return manejador.getFilas(idEmpleado);
}

private boolean setEliminarRegistro(String idEmpleado, String fecha) {
	return manejador.eliminarRegistro(idEmpleado, fecha);
}

private void limpiarTabla() {
	for (int iterador = 0; iterador < modeloTabla.getRowCount(); iterador++) {
		modeloTabla.removeRow(iterador);
	}
	modeloTabla.setRowCount(0);
}

private Object[] getEmpleados() {
	return manejador.getListaEmpleados();
}

private Object getIdEmpleado(int indice) {
	return manejador.getIdEmpleado(indice);
}

private void habilitarBotonEliminar() {
	btnEliminiarRegistro.setEnabled(true);
}

private String getFecha() {
	return modeloTabla.getValueAt(tablaFechas.getSelectedRow(), 0).toString();
}

private void deshabilitarBotonEliminar() {
	btnEliminiarRegistro.setEnabled(false);
}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> boxEmpleados;
  private javax.swing.JPanel btnEliminiarRegistro;
  private javax.swing.JPanel contenedorEmpleado;
  private javax.swing.JPanel contenedorTabla;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblEliminar;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JTable tablaFechas;
  // End of variables declaration//GEN-END:variables
}
