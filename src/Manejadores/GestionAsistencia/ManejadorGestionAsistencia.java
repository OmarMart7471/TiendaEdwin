package Manejadores.GestionAsistencia;

import Manejadores.Principal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

public Object[] getFechasEmpleado(Object idEmpleado) {
	ArrayList fechas = new ArrayList<>();
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("select fecha from Asistencia where idEmpleado=?");
		cts.setString(1, idEmpleado.toString());
		ResultSet r = cts.executeQuery();
		while (r.next()) {
			fechas.add(r.getString(1));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return fechas.toArray();
}

public Object[] getCamposFaltantes(String idEmpleado, String fecha) {
	ArrayList fila = new ArrayList<>();
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("select horaEntrada, horaSalida, observacion, monto from Asistencia where idEmpleado=? and fecha=?");
		cts.setString(1, idEmpleado);
		cts.setString(2, fecha);
		ResultSet r = cts.executeQuery();
		r.next();
		fila.add(r.getString(1));
		fila.add(r.getString(2));
		fila.add(r.getString(3));
		fila.add(r.getString(4));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return fila.toArray();
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

public Object[][] getFilas(String idEmpleado) {
	ArrayList<ArrayList> matriz = new ArrayList<>();
	ArrayList<String> subMatriz = new ArrayList<>();
	Object[][] matrizRetorno = null;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("SELECT * FROM Asistencia where idEmpleado=?");
		cts.setString(1, idEmpleado);
		ResultSet r = cts.executeQuery();

		while (r.next()) {
			subMatriz = new ArrayList<>();
			for (int columnaTemp = 0; columnaTemp < 5; columnaTemp++) {
				subMatriz.add(r.getString(columnaTemp + 2));
			}
			matriz.add(subMatriz);
		}
		try {
			matrizRetorno = new Object[matriz.size()][matriz.get(0).size()];

			for (int fila = 0; fila < matriz.size(); fila++) {
				for (int columna = 0; columna < matriz.get(0).size(); columna++) {
					matrizRetorno[fila][columna] = matriz.get(fila).get(columna);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			return new Object[0][0];
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return matrizRetorno;
}

public boolean insertarRegistro(String[] registro) {
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("insert into Asistencia(idEmpleado,fecha,horaEntrada,horaSalida,observacion,monto) values(?,?,?,?,?,?)");

		for (int contador = 0; contador < registro.length; contador++) {
			cts.setString(contador + 1, registro[contador]);
		}
		cts.executeUpdate();
		return true;
	} catch (Exception e) {
		return false;
	}
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
