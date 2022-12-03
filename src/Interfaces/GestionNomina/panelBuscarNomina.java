package Interfaces.GestionNomina;

import Manejadores.GestionAsistencia.ManejadorGestionAsistencia;
import Manejadores.GestionNomina.ManejadorGestionNomina;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelBuscarNomina extends javax.swing.JPanel {

Manejadores.GestionNomina.ManejadorGestionNomina manejador;
private DefaultTableModel modeloTabla;

public panelBuscarNomina() {
	manejador = new ManejadorGestionNomina();
	initComponents();
	modeloTabla = (DefaultTableModel) tablaFechas.getModel();
	insertarFilasTabla(getFilasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString()));
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    contenedorEmpleado = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    boxEmpleados = new javax.swing.JComboBox<>();
    contenedorTabla = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaFechas = new javax.swing.JTable();

    setLayout(new java.awt.GridBagLayout());

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

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 339;
    gridBagConstraints.ipady = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(31, 78, 0, 0);
    add(contenedorEmpleado, gridBagConstraints);

    tablaFechas.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fecha", "Horas trabajadas", "Pago por hora"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
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
      .addGap(0, 278, Short.MAX_VALUE)
      .addGroup(contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contenedorTablaLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(33, 106, 78, 6);
    add(contenedorTabla, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  private void boxEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxEmpleadosItemStateChanged
		if (evt.getStateChange() == 1) {
			Object[][] tabla = getFilasEmpleado(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString());
			insertarFilasTabla(tabla);
		} else {
			limpiarTabla();
		}
  }//GEN-LAST:event_boxEmpleadosItemStateChanged

private void insertarFilasTabla(Object[][] tabla) {
	limpiarTabla();
	if (tabla.length > 0) {
		Object[] fila = new Object[tabla[0].length];
		//Recorre las filas
		for (int numFila = 0; numFila < tabla.length; numFila++) {
			//Recorre las columnas
			for (int numColumna = 0; numColumna < 3; numColumna++) {
				fila[numColumna] = tabla[numFila][numColumna];
			}
			modeloTabla.addRow(fila);
		}
	} else {
		JOptionPane.showMessageDialog(null, "No se han podido consultar las fechas de Nomina, "
						+ "puede que se deba a lo siguiente:" + "\n"
						+ "• Se perdio conexion con la base de datos" + "\n"
						+ "• Este empleado no tiene pagos de Nomina" + "\n"
						+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al consultar las nominas", JOptionPane.ERROR_MESSAGE);
	}
}

private Object[][] getFilasEmpleado(String idEmpleado) {
	return manejador.getFilas(idEmpleado);
}

private String[] insertarEmpleados() {
	Object[] listaTemp = getEmpleados();
	String[] listaEmpleados = new String[listaTemp.length];

	for (int iterador = 0; iterador < listaTemp.length; iterador++) {
		listaEmpleados[iterador] = listaTemp[iterador].toString();
	}
	return listaEmpleados;
}

private Object[] getEmpleados() {
	return manejador.getListaEmpleados();
}

private Object getIdEmpleado(int indice) {
	return manejador.getIdEmpleado(indice);
}

private void limpiarTabla() {
	for (int iterador = 0; iterador < modeloTabla.getRowCount(); iterador++) {
		modeloTabla.removeRow(iterador);
	}
	modeloTabla.setRowCount(0);
}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> boxEmpleados;
  private javax.swing.JPanel contenedorEmpleado;
  private javax.swing.JPanel contenedorTabla;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JTable tablaFechas;
  // End of variables declaration//GEN-END:variables
}
