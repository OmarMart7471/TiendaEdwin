package Manejadores.GestionNomina;

import Manejadores.Principal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ManejadorGestionNomina {

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

public boolean actualizarRegistro(String[] registro) {
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("update Asistencia set horaEntrada= ?,horaSalida= ?,observacion = ?,monto= ? where idEmpleado= ? and fecha= ?");
		for (int contador = 0; contador < registro.length; contador++) {
			cts.setString(contador + 1, registro[contador]);
		}
		cts.executeUpdate();
		return true;
	} catch (Exception e) {
		return false;
	}
}

}
