
package Manejadores.ManejadorGEmpleado;
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


public class ManejadorGestionEmpleado {
    
    //Consultas correspondientes a la gestion de empleado
    private PreparedStatement mostrarEmpleados = null;
    private PreparedStatement agregarEmpleados = null;
    private PreparedStatement eliminarEmpleados = null;
    private PreparedStatement modificarEmpleados = null;
    private PreparedStatement buscarEmpleados = null;
    //Conexión a la base de datos
    private Principal dbConection = new Principal();

    public Principal getDbConection() {
        return dbConection;
    }

    public ManejadorGestionEmpleado() {
        
        try {
            
            mostrarEmpleados = dbConection.getConexion().prepareStatement("SELECT * FROM Empleado");
            
            agregarEmpleados = dbConection.getConexion().prepareStatement("INSERT INTO Empleado "+
                    "( id, nombre, direccion, numeroTelefono, puesto, sexo, pagoPorHora)"+
                    "VALUES ( ?, ?, ?, ?, ?, ?, ?)");
            
            eliminarEmpleados = dbConection.getConexion().prepareStatement("DELETE FROM Empleado WHERE id = ?");
            
            modificarEmpleados =  dbConection.getConexion().prepareStatement("UPDATE Empleado SET"
                    + " nombre=?"
                    + " direccion=?"
                    + " numeroTelefono=?"
                    + " puesto=?"
                    + " sexo=?"
                    + " pagoPorHora=?"
                    + "WHERE id=?");
            
            buscarEmpleados = dbConection.getConexion().prepareStatement("SELECT * FROM Empleado WHERE nombre=?");
            
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorGestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public List< Empleado > ObtenerTodosLosEmpleados(){
        
        List< Empleado > resultados = null;
        ResultSet conjuntoResultados = null;
        
        try {
            conjuntoResultados =  mostrarEmpleados.executeQuery();
            resultados = new ArrayList< Empleado >();
            while (conjuntoResultados.next()) {                
                resultados.add(
                        new Empleado(
                conjuntoResultados.getString("id"),
                conjuntoResultados.getString("nombre"),
                conjuntoResultados.getString("numeroTelefono"),
                conjuntoResultados.getString("puesto"),
                conjuntoResultados.getString("sexo").charAt(0),
                conjuntoResultados.getFloat("pagoPorHora"))
                );
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        } finally{
            try {
                conjuntoResultados.close();
            } catch (SQLException ex) {
                 ex.printStackTrace();
                 close();
            }  
        }
        
        
        return resultados;
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
