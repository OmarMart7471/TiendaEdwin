package Manejadores.GestionNomina;

import Manejadores.Principal;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
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

public String getHorasTrabajadas(String idEmpleado) {
	Object consulta = null;
	int contador = 0;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("select time(sum(Asistencia.horaSalida-"
						+ "Asistencia.horaEntrada)) as horasTotales from Asistencia where Asistencia.idEmpleado=? "
						+ "and fecha between coalesce((select date(fechaPago+1) from Nomina where idEmpleado=? ORDER BY"
						+ " fechaPago DESC LIMIT 1),(select fecha from Asistencia where idEmpleado=? limit 1)) and curdate();");

		do {
			cts.setString(contador + 1, idEmpleado);
			contador++;
		} while (contador < 3);

		ResultSet r = cts.executeQuery();
		while (r.next()) {
			return r.getString(1);
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}

public String getPagoPorHora(String idEmpleado) {
	Object pago = null;
	int contador = 0;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("Select pagoPorHora from Empleado where id = ?");
		cts.setString(contador + 1, idEmpleado);
		ResultSet r = cts.executeQuery();
		while (r.next()) {

			return r.getString(1);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}

public Object[][] getNomina(String idEmpleado) {
	ArrayList<ArrayList> matriz = new ArrayList<>();
	ArrayList<String> subMatriz = new ArrayList<>();
	Object[][] matrizRetorno = null;
	int contador = 0;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("select Asistencia.fecha as fecha,"
						+ "time(Asistencia.horaSalida-Asistencia.horaEntrada) as horasTrabajadas, Empleado.pagoPorHora,"
						+ "sum(((Asistencia.horaSalida-Asistencia.horaEntrada)*Empleado.pagoPorHora)/10000) as pago "
						+ "from Asistencia,Empleado where Empleado.id=Asistencia.idEmpleado "
						+ "and Asistencia.idEmpleado=? "
						+ "and fecha between coalesce((select date(fechaPago+1) from Nomina where idEmpleado=? ORDER BY fechaPago DESC LIMIT 1) "
						+ ",(select fecha from Asistencia where idEmpleado=? limit 1)) and curdate() group by fecha");
		do {
			cts.setString(contador + 1, idEmpleado);
			contador++;
		} while (contador < 3);

		ResultSet r = cts.executeQuery();

		while (r.next()) {
			subMatriz = new ArrayList<>();
			for (int columnaTemp = 0; columnaTemp < 4; columnaTemp++) {
				subMatriz.add(r.getString(columnaTemp + 1));
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

public Object[][] getObservaciones(String idEmpleado) {
	ArrayList<ArrayList> matriz = new ArrayList<>();
	ArrayList<String> subMatriz = new ArrayList<>();
	Object[][] matrizRetorno = null;
	int contador = 0;
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("select fecha, monto, observacion "
						+ "from Asistencia where idEmpleado=? "
						+ "and monto != 0.00 and monto is not null "
						+ "and fecha between coalesce((select date(fechaPago+1) from Nomina where idEmpleado=? ORDER BY fechaPago DESC LIMIT 1) "
						+ ",(select fecha from Asistencia where idEmpleado=? limit 1)) and curdate() group by fecha");
		do {
			cts.setString(contador + 1, idEmpleado);
			contador++;
		} while (contador < 3);

		ResultSet r = cts.executeQuery();

		while (r.next()) {
			subMatriz = new ArrayList<>();
			for (int columnaTemp = 0; columnaTemp < 3; columnaTemp++) {
				subMatriz.add(r.getString(columnaTemp + 1));
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

public boolean insertarRegistroNomina(String[] registro) {
	try {
		CallableStatement cts = dbConection.getConexion().prepareCall("insert into Nomina(pagoPorHora,horasTrabajadas, "
						+ "idEmpleado,fechaPago) values(?,?,?,?)");
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
		CallableStatement cts = dbConection.getConexion().prepareCall("update Nomina set pagoPorHora= ?,horasTrabajadas= ? where idEmpleado= ? and fecha= ?");
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
