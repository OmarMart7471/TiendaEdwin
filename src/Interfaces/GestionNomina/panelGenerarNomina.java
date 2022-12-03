package Interfaces.GestionNomina;

import Manejadores.GestionNomina.ManejadorGestionNomina;
import java.awt.Color;
import static java.awt.image.ImageObserver.ERROR;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.Desktop;
import java.net.URI;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class panelGenerarNomina extends javax.swing.JPanel {

Manejadores.GestionNomina.ManejadorGestionNomina manejador;
private double totalNomina = 0.0;
private double totalObservaciones = 0.0;

public panelGenerarNomina() {
	manejador = new ManejadorGestionNomina();
	initComponents();

	insertarEmpleados();
	insertarFecha();
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
    contenedorHorasTrabajadas = new javax.swing.JPanel();
    lblHorasTrabajadas = new javax.swing.JLabel();
    txtHorasTrabajadas = new javax.swing.JTextField();
    contenedorPagoPorHora = new javax.swing.JPanel();
    lblPagoPorHora = new javax.swing.JLabel();
    txtPagoPorHora = new javax.swing.JTextField();
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
    boxEmpleados.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        boxEmpleadosItemStateChanged(evt);
      }
    });
    contenedorNombreEmpleado.add(boxEmpleados);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 263;
    gridBagConstraints.ipady = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(31, 87, 0, 0);
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
    gridBagConstraints.insets = new java.awt.Insets(12, 87, 0, 0);
    add(contenedorFecha, gridBagConstraints);

    contenedorHorasTrabajadas.setPreferredSize(new java.awt.Dimension(480, 100));

    lblHorasTrabajadas.setText("Horas trabajadas");
    lblHorasTrabajadas.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorHorasTrabajadas.add(lblHorasTrabajadas);

    txtHorasTrabajadas.setEditable(false);
    txtHorasTrabajadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtHorasTrabajadas.setToolTipText("Inserta la hora de salida en la ventana de Modificar Asistencia");
    txtHorasTrabajadas.setMargin(new java.awt.Insets(4, 6, 4, 6));
    txtHorasTrabajadas.setMinimumSize(new java.awt.Dimension(300, 30));
    txtHorasTrabajadas.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorHorasTrabajadas.add(txtHorasTrabajadas);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.ipadx = 90;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 87, 0, 50);
    add(contenedorHorasTrabajadas, gridBagConstraints);

    contenedorPagoPorHora.setPreferredSize(new java.awt.Dimension(480, 100));

    lblPagoPorHora.setText("Pago  por hora");
    lblPagoPorHora.setPreferredSize(new java.awt.Dimension(130, 30));
    contenedorPagoPorHora.add(lblPagoPorHora);

    txtPagoPorHora.setEditable(false);
    txtPagoPorHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtPagoPorHora.setToolTipText("Inserta la hora de salida en la ventana de Modificar Asistencia");
    txtPagoPorHora.setMargin(new java.awt.Insets(4, 6, 4, 6));
    txtPagoPorHora.setMinimumSize(new java.awt.Dimension(300, 30));
    txtPagoPorHora.setPreferredSize(new java.awt.Dimension(300, 30));
    contenedorPagoPorHora.add(txtPagoPorHora);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.ipadx = 87;
    gridBagConstraints.ipady = 12;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 87, 0, 0);
    add(contenedorPagoPorHora, gridBagConstraints);

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
    gridBagConstraints.gridy = 4;
    gridBagConstraints.ipadx = 163;
    gridBagConstraints.ipady = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(60, 219, 112, 0);
    add(btnGuardarRegistro, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  private void btnGuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarRegistroMouseClicked
		File archivo = new File("src//" + "Empleado_" + getIdEmpleado(boxEmpleados.getSelectedIndex()) + "-Fecha_" + getFecha() + ".pdf");
		generarPDF(archivo,
						mostrarNominaTabla(manejador.getNomina(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString())),
						mostrarObservacionesTabla(manejador.getObservaciones(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString())));

		if (!setRegistroNomina(generarRegistro()) && txtHorasTrabajadas.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No se ha podido registrar la Nomina, "
							+ "puede que se deba a lo siguiente:" + "\n"
							+ "• Se perdio conexion con la base de datos" + "\n"
							+ "• Este empleado ya a recibido su pago" + "\n"
							+ "Intente verificar esto ultimo y vuelva a intentar.", "Error al registrar la nomina", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Registro agregado con exito", "Correcto", JOptionPane.INFORMATION_MESSAGE);

//Este if abre el PDF
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI("file:/" + "/" + "/" + archivo.getAbsolutePath().replace("\\", "/")));
				} catch (URISyntaxException ex) {
					Logger.getLogger(panelGenerarNomina.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IOException ex) {
					Logger.getLogger(panelGenerarNomina.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
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
			insertarDatos();
		}
  }//GEN-LAST:event_boxEmpleadosItemStateChanged

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

private String[] insertarEmpleados() {
	Object[] listaTemp = getEmpleados();
	String[] listaEmpleados = new String[listaTemp.length];

	for (int iterador = 0; iterador < listaTemp.length; iterador++) {
		listaEmpleados[iterador] = listaTemp[iterador].toString();
	}
	return listaEmpleados;
}

private void insertarDatos() {
	txtHorasTrabajadas.setText(getHorasTrabajadas());
	txtPagoPorHora.setText(getPagoPorHora());

}

private boolean setRegistroNomina(String[] registro) {
	return manejador.insertarRegistroNomina(registro);
}

private Object[] getEmpleados() {
	return manejador.getListaEmpleados();
}

private Object getIdEmpleado(int indice) {
	return manejador.getIdEmpleado(indice);
}

private void insertarFecha() {
	txtFecha.setText(getFecha());
}

private String getFecha() {
	return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
}

private String getHora() {
	return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
}

private String mostrarObservacionesTabla(Object[][] tabla) {
	String informacion = "";
	double total = 0;

	if (tabla.length > 0) {
		informacion += "|      Fecha    |  Monto  |   Observacion   |" + "\n";
		Object[] fila = new Object[tabla[0].length];
		//Recorre las filas
		for (int numFila = 0; numFila < tabla.length; numFila++) {
			//Recorre las columnas
			for (int numColumna = 0; numColumna < 3; numColumna++) {
				if (numColumna == 1) {
					informacion += "       ";
				} else if (numColumna == 2) {
					informacion += "          ";
				} else if (numColumna == 3) {
					informacion += "  ";
					total += Double.valueOf(tabla[numFila][numColumna].toString());
				}
				informacion += fila[numColumna] = tabla[numFila][numColumna];
				if (numColumna == 1) {
					informacion += "        ";
				} else if (numColumna == 2) {
					informacion += "         ";
				}
				informacion += "  | ";
			}
			informacion += "\n";
		}

		setTotalObservaciones(total);

	} else {
		informacion += "No se encontraron observaciones :D\n";
	}

	return informacion;
}

private String mostrarNominaTabla(Object[][] tabla) {
	String informacion = "";
	double total = 0;

	if (tabla.length > 0) {
		informacion += "|      Fecha    |  Horas trabajadas  |   Pago por hora   |   pago |" + "\n";
		Object[] fila = new Object[tabla[0].length];
		//Recorre las filas
		for (int numFila = 0; numFila < tabla.length; numFila++) {
			//Recorre las columnas
			for (int numColumna = 0; numColumna < 4; numColumna++) {
				if (numColumna == 1) {
					informacion += "       ";
				} else if (numColumna == 2) {
					informacion += "          ";
				} else if (numColumna == 3) {
					informacion += "  ";
					total += Double.valueOf(tabla[numFila][numColumna].toString());
				}
				informacion += fila[numColumna] = tabla[numFila][numColumna];
				if (numColumna == 1) {
					informacion += "        ";
				} else if (numColumna == 2) {
					informacion += "         ";
				}
				informacion += "  | ";
			}
			informacion += "\n";
		}

		setTotalNomina(total);

	} else {
//No muestra nada 
	}

	return informacion;
}

private void generarPDF(File archivo, String informacion, String observaciones) {
//Tamaño del ancho del papel A7 
//Ancho:  74mm == 209.76 pt
//Largo: 104mm == 294.80 pt
	try {
		PDDocument documento = new PDDocument();
		PDPage pagina = new PDPage(new PDRectangle(209.76f, 294.80f));

		documento.addPage(pagina);

		PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

		contenido.beginText();
		contenido.setFont(PDType1Font.HELVETICA, 7);
		contenido.newLineAtOffset(10, pagina.getMediaBox().getHeight() - 10);
		contenido.setLeading(10.0f);

		contenido.showText("                                 ---[ Tienda Edwin ]---");
		contenido.newLine();
		contenido.showText("Fecha: " + getFecha() + "                                  Hora: " + getHora());
		contenido.newLine();
		contenido.showText("                                       Pago de nomina");
		contenido.newLine();

		//Aqui se recorre todo el contenido del
		//documento en busca de saltos de linea
		//para insertar las nuevas lineas cada
		//que se encuentren.
		String contenidoInsertar = "";
		for (char caracter : informacion.toCharArray()) {
			if (caracter == '\n') {
				//Se inserta el contenido cada que se encuentra un salto de linea
				contenido.showText(contenidoInsertar);
				contenido.newLine();
				contenidoInsertar = "";
			} else {
				contenidoInsertar += caracter;
			}
		}

		//Si al final sale del ciclo pero no hay un salto de linea
		//(caracter que sirve para insertar los datos) se debería 
		//de ejecutar esto, verifica si todavía hay contenido sin insertar.
		if (contenidoInsertar != "") {
			contenido.showText(contenidoInsertar);
			contenido.newLine();
			contenidoInsertar = "";
		}
		contenido.showText("                                                                          Total: $" + getTotalNomina());

		contenido.newLine();
		contenido.showText("                 Observaciones");
		contenido.newLine();
		contenidoInsertar = "";
		for (char caracter : observaciones.toCharArray()) {
			if (caracter == '\n') {
				//Se inserta el contenido cada que se encuentra un salto de linea
				contenido.showText(contenidoInsertar);
				contenido.newLine();
				contenidoInsertar = "";
			} else {
				contenidoInsertar += caracter;
			}
		}

		if (getTotalObservaciones() > 0) {
			contenido.showText("                                                                          Total: $" + getTotalNomina());
		}
		contenido.newLine();
		contenido.newLine();
		contenido.showText("                                                     Total neto: $" + (getTotalNomina() + getTotalObservaciones()));
		contenido.endText();
		contenido.close();

		documento.save(archivo);

	} catch (Exception error) {
		JOptionPane.showMessageDialog(this, "Error al generar el PDF", "Error", ERROR);
	}
}

public String getHorasTrabajadas() {
	return manejador.getHorasTrabajadas(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString());
}

public String getPagoPorHora() {
	return manejador.getPagoPorHora(getIdEmpleado(boxEmpleados.getSelectedIndex()).toString());
}

public double getTotalObservaciones() {
	return totalObservaciones;
}

public void setTotalObservaciones(double totalObservaciones) {
	this.totalObservaciones = totalObservaciones;
}

public double getTotalNomina() {
	return totalNomina;
}

public void setTotalNomina(double totalNomina) {
	this.totalNomina = totalNomina;
}


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> boxEmpleados;
  private javax.swing.JPanel btnGuardarRegistro;
  private javax.swing.JPanel contenedorFecha;
  private javax.swing.JPanel contenedorHorasTrabajadas;
  private javax.swing.JPanel contenedorNombreEmpleado;
  private javax.swing.JPanel contenedorPagoPorHora;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblGuardar;
  private javax.swing.JLabel lblHorasTrabajadas;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblPagoPorHora;
  private javax.swing.JTextField txtFecha;
  private javax.swing.JTextField txtHorasTrabajadas;
  private javax.swing.JTextField txtPagoPorHora;
  // End of variables declaration//GEN-END:variables
}
