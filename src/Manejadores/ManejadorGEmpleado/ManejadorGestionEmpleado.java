
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
            
            modificarEmpleados =  dbConection.getConexion().prepareStatement("UPDATE Empleado SET nombre=?, direccion=?, numeroTelefono=?, puesto=?, sexo=?, pagoPorHora=? WHERE id=?");
            
            buscarEmpleados = dbConection.getConexion().prepareStatement("SELECT * FROM Empleado WHERE id = ?");
            
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
                conjuntoResultados.getString("direccionEmpleado"),
                conjuntoResultados.getString("puesto"),
                conjuntoResultados.getString("sexo"),
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
    
    public int agregarEmpleados(String idEmpleado, String nombreEmpleado, String direccionEmpleado, 
            String numEmpleado, String puestoEmpleado, String sexoEmpleado, String pagoEmpleado) {
        int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
try
 {
 agregarEmpleados.setString( 1, idEmpleado );;
 agregarEmpleados.setString( 2, nombreEmpleado );
 agregarEmpleados.setString( 3, direccionEmpleado );
 agregarEmpleados.setString( 4, numEmpleado );
 agregarEmpleados.setString( 5, puestoEmpleado );
 agregarEmpleados.setString( 6, sexoEmpleado);
 agregarEmpleados.setString( 7 , pagoEmpleado);

 // inserta la nueva entrada; devuelve # de filas actualizadas
 resultado = agregarEmpleados.executeUpdate();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
}
        return resultado;
    }
    
     public int borrarEmpleado(String idEmpleado){
     int resultado = 0;
     try{
         eliminarEmpleados.setString(1, idEmpleado);
         resultado = eliminarEmpleados.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
     
     
public List<Empleado> buscarEmpleado(String idEmple){
     List<Empleado> resultados = null;
     ResultSet conjuntoEmpleado = null;//resultado de la consulta
     try{
         buscarEmpleados.setString(1, idEmple);
         conjuntoEmpleado = buscarEmpleados.executeQuery();//consulta
         resultados = new ArrayList<Empleado>();
         while(conjuntoEmpleado.next()){
             resultados.add(
                     new Empleado(
                     
             conjuntoEmpleado.getString("id"),        
             conjuntoEmpleado.getString("nombre"),
             conjuntoEmpleado.getString("direccion"),
             conjuntoEmpleado.getString("numeroTelefono"),
             conjuntoEmpleado.getString("puesto"),
             conjuntoEmpleado.getString("sexo"),
             conjuntoEmpleado.getFloat("pagoPorHora")));
         }
     }catch(SQLException exs){
         exs.printStackTrace();
     }finally{try{
         conjuntoEmpleado.close();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }}return resultados;
 }

    public int modificarEmpleado(String idEmpleado,String nombreEmpleado, String direccionEmpleado, 
            String numEmpleado, String puestoEmpleado, String sexoEmpleado, String pagoEmpleado) {
        int resultado=0;
     try{
     
     
     modificarEmpleados.setString(1, nombreEmpleado);
     modificarEmpleados.setString(2, direccionEmpleado);
     modificarEmpleados.setString(3, numEmpleado);
     modificarEmpleados.setString(4, puestoEmpleado);
     modificarEmpleados.setString(5, sexoEmpleado);
     modificarEmpleados.setString(6, pagoEmpleado);
     modificarEmpleados.setString(7, idEmpleado);
     resultado = modificarEmpleados.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
    }
    
}
