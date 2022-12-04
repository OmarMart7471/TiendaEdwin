
package Manejadores.ManejadorGestionProducto;

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

public class ManejadorProducto {
    private PreparedStatement nuevaProducto = null;
    private PreparedStatement agregarEmpleados = null;
    private PreparedStatement eliminarEmpleados = null;
    private PreparedStatement modificarEmpleados = null;
    private PreparedStatement buscarEmpleados = null;
      public PreparedStatement actualizarProducto = null;
      public PreparedStatement buscarproducto = null;
       public PreparedStatement eliminarProducto = null;
    
    private Principal dbConection = new Principal();

    public Principal getDbConection() {
        return dbConection;
    }

    
    
    public ManejadorProducto() {
        try {
            nuevaProducto = dbConection.getConexion().prepareStatement(
                "INSERT INTO producto " +
                "( id, descripcion, precio, stock, idProveedor) " +
                "VALUES ( ?, ?, ?, ?, ?)" );
            
            //actualizar cancion
 actualizarProducto = dbConection.getConexion().prepareStatement("UPDATE producto SET descripcion=?, precio=?, stock=?"
         + "WHERE id = ?");
            
 //buscar productos
 buscarproducto = dbConection.getConexion().prepareStatement( "SELECT * FROM producto WHERE id = ?" );           
 
 //eliminar cancion
 eliminarProducto = dbConection.getConexion().prepareStatement("DELETE  FROM producto WHERE id = ?");
 
 
        } catch (SQLException e) {
            
            
            
            Logger.getLogger(ManejadorProducto.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    //METODO BORRAR 
 public int borrarProducto (String Id){
     int resultado = 0;
     try{
         eliminarProducto.setString(1, Id);
         resultado = eliminarProducto.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
    
    public int agregarProducto(String id, String descripcion, String precio, String stock, String idProveedor ){
        int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
       try
        {
        nuevaProducto.setString( 1, id );
        nuevaProducto.setString( 2, descripcion );
        nuevaProducto.setString( 3, precio );
        nuevaProducto.setString( 4, stock );
        nuevaProducto.setString( 5, idProveedor );

        // inserta la nueva entrada; devuelve # de filas actualizadas
        resultado = nuevaProducto.executeUpdate();
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
    
    public int modificarProducto(String Descripcion,String precio, String stock, String id){
     int resultado=0;
     try{
     
     actualizarProducto.setString(1, Descripcion);
     actualizarProducto.setString(2, precio);
     actualizarProducto.setString(3, stock);
     actualizarProducto.setString(4, id);

     resultado = actualizarProducto.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
    
    public ResultSet Buscarproducto(String id){
        ResultSet conjuntoCancion = null;
        try{
            buscarproducto.setString(1, id);
            conjuntoCancion = buscarproducto.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
    
}
