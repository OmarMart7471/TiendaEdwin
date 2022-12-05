
package Manejadores.ManejadorGestionProveedores;


import Manejadores.ManejadorGestionProducto.ManejadorProducto;
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

import Manejadores.Principal;

/**
 *
 * @author luis
 */
public class ManejadorProveedor {
    
    private PreparedStatement nuevaProveedor = null;
    private PreparedStatement agregarEmpleados = null;
    private PreparedStatement eliminarEmpleados = null;
    private PreparedStatement modificarEmpleados = null;
    private PreparedStatement buscarEmpleados = null;
      public PreparedStatement actualizarProveedor = null;
      public PreparedStatement buscarproveedor = null;
       public PreparedStatement eliminarProveedor = null;
    
    private Principal dbConection = new Principal();
    
    public Principal getDbConection() {
        return dbConection;
    }
    
    public ManejadorProveedor() {
        try {
            nuevaProveedor = dbConection.getConexion().prepareStatement(
                "INSERT INTO proveedor " +
                "( id, nombre, telefono, empresa) " +
                "VALUES ( ?, ?, ?, ?)" );
            
            //actualizar cancion
 actualizarProveedor = dbConection.getConexion().prepareStatement("UPDATE proveedor SET nombre=?, telefono=?, empresa=?"
         + "WHERE id = ?");
            
 //buscar productos
 buscarproveedor = dbConection.getConexion().prepareStatement( "SELECT * FROM proveedor WHERE id = ?" );           
 
 //eliminar cancion
 eliminarProveedor = dbConection.getConexion().prepareStatement("DELETE  FROM proveedor WHERE id = ?");
 
 
        } catch (SQLException e) {
            
            
            
            Logger.getLogger(ManejadorProducto.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    //METODO BORRAR 
 public int borrarProveedor (String Id){
     int resultado = 0;
     try{
         eliminarProveedor.setString(1, Id);
         resultado = eliminarProveedor.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
 
 public int agregarProveedor(String id, String nombre, String telefono, String empresa){
        int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
       try
        {
        nuevaProveedor.setString( 1, id );
        nuevaProveedor.setString( 2, nombre );
        nuevaProveedor.setString( 3, telefono );
        nuevaProveedor.setString( 4, empresa );

        // inserta la nueva entrada; devuelve # de filas actualizadas
        resultado = nuevaProveedor.executeUpdate();
        } // fin de try
        catch ( SQLException excepcionSql )
        {
        excepcionSql.printStackTrace();
        close();
    } // fin de catch

    return resultado;
    } // fin del método agregarCancion
 
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
 
     public int modificarProveedor(String id ,String nombre, String telefono, String empresa){
     int resultado=0;
     try{
     
     actualizarProveedor.setString(1, nombre);
     actualizarProveedor.setString(2, telefono);
     actualizarProveedor.setString(3, empresa);
     actualizarProveedor.setString(4, id);

     resultado = actualizarProveedor.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
 
     public ResultSet Buscarproveedor(String id){
        ResultSet conjuntoCancion = null;
        try{
            buscarproveedor.setString(1, id);
            conjuntoCancion = buscarproveedor.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
     
}
