package Manejadores.GestionAsistencia;

import Manejadores.ManejadorGEmpleado.ManejadorGestionEmpleado;
import Manejadores.Principal;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManejadorGestionAsistencia {

//Conexión a la base de datos
private Principal dbConection = new Principal();

public Object[] getListaEmpleados() {
	ArrayList empleados = new ArrayList<>();
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("SELECT * FROM Empleado");
		ResultSet r = cts.executeQuery();
		while (r.next()) {
			empleados.add(r.getString(2));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return empleados.toArray();
}

public Object getIdEmpleado(int indice) {
	Object empleado = null;
	int contador = 0;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("SELECT * FROM Empleado");
		ResultSet r = cts.executeQuery();
		while (r.next()) {
			if (contador == indice) {
				empleado = r.getString(1);
				return empleado;
			}
			contador++;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}

public boolean insertarRegistro(String[] registro) {
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("insert into Asistencia(idEmpleado,fecha,horaEntrada,horaSalida,observacion,monto) values(?,?,?,?,?,?)");

		for (int contador = 0; contador < registro.length; contador++) {
			cts.setString(contador + 1, registro[contador]);
		}
		System.out.println(cts.toString());
		cts.executeUpdate();
		return true;
	} catch (Exception e) {
		return false;
	}
}

}
