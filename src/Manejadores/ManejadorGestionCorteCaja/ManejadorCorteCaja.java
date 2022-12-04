/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores.ManejadorGestionCorteCaja;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.List;
 import java.util.ArrayList;
 import Manejadores.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Empleado;

public class ManejadorCorteCaja {
    
    private PreparedStatement agregarCorteCaja = null;
    private PreparedStatement agregarDiferencia = null;

    private Principal dbConection = new Principal();

    public Principal getDbConection() {
        return dbConection;
    }
    
    public ManejadorCorteCaja() {
        try {
            agregarCorteCaja = dbConection.getConexion().prepareStatement("INSERT INTO CorteCaja "+
                    "( idEmpleado,fecha,totalCC )"+
                    "VALUES ( ?, ?, ?)");
            agregarDiferencia = dbConection.getConexion().prepareStatement("UPDATE Asistencia SET observacion = ? , monto= ? WHERE idEmpleado = ? AND fecha = ?");
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorCorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public int nuevoCorteCaja(String idEmp,String fecha,String total){
        
        int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
                try
                 {
                    agregarCorteCaja.setString(1, idEmp);
                    agregarCorteCaja.setString(2, fecha);
                    agregarCorteCaja.setString(3, total);
                 // inserta la nueva entrada; devuelve # de filas actualizadas
                 resultado = agregarCorteCaja.executeUpdate();
                 } // fin de try
                 catch ( SQLException excepcionSql )
                 {
                 excepcionSql.printStackTrace();
                 close();
        }
    return resultado;
        
    }
     
    public int agregarDif(String observacion,float monto,String id,String fecha){
        
        int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
                try
                 {
                    agregarDiferencia.setString(1, observacion);
                    agregarDiferencia.setFloat(2, monto);
                    agregarDiferencia.setString(3, id);
                    agregarDiferencia.setString(4, fecha);
                 // inserta la nueva entrada; devuelve # de filas actualizadas
                 resultado = agregarDiferencia.executeUpdate();
                 } // fin de try
                 catch ( SQLException excepcionSql )
                 {
                 excepcionSql.printStackTrace();
                 close();
        }
    return resultado;
        
    }
     
      public void close(){
        try
        {
            dbConection.getConexion().close();
        } // fin de try
        catch ( SQLException excepcionSql )
            {
       excepcionSql.printStackTrace();
       } // fin de catch
   } // fin del método close
}
