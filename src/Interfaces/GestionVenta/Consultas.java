/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.GestionVenta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author César Abarca
 */
public class Consultas {
    
    
    
      //Parte del manejador que hace la conexion a la base de datos
     static final String URL = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
     static final String NOMBREUSUARIO = "sql9556799";
     static final String CONTRASENIA = "27GJest2yc";
     Connection conexion = null;
     
     public PreparedStatement nuevaVenta = null;
      public PreparedStatement consultaPrecioProducto = null;
      public PreparedStatement nuevoDetalleVenta = null;
      public PreparedStatement consultaLista = null;
     
     public Consultas() throws SQLException {
        
         try {
            conexion = DriverManager.getConnection( URL, NOMBREUSUARIO, CONTRASENIA );
        } // fin de try
         
        catch ( SQLException excepcionSql )
        { excepcionSql.printStackTrace();
        System.exit( 1 );
        } // fin de catch
        
          
         nuevaVenta = conexion.prepareStatement(" Insert Into Venta(id,fecha) Values (?,?)" );
         consultaPrecioProducto=conexion.prepareCall("Select * From producto Where descripcion = ?");
         nuevoDetalleVenta=conexion.prepareCall("Insert Into DetalleVenta Values(?, ?, ?, ?, ?)");
         consultaLista=conexion.prepareCall(" Select descripcion,cantidad,total from DetalleVenta, producto Where id=idProducto AND idVenta= ?;");
         
        
    }
     
     public void close()
 {
 try
 {
 conexion.close();
 } // fin de try
 catch ( SQLException excepcionSql )
     {
excepcionSql.printStackTrace();
} // fin de catch
}
     
     
     
      public int agregarVenta(int id,String fecha){
 int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
try
 {
     //Crear Nueva Venta para la Interfaz 
 nuevaVenta.setString(1, String.valueOf(id));
 nuevaVenta.setString(2, fecha);
 
 
 // inserta la nueva entrada; devuelve # de filas actualizadas
 resultado = nuevaVenta.executeUpdate();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
 } // fin de catch



 return resultado;
 } // fin del método agregarInstalacion
     
      
     public int agregarDetalleVenta(String idP,String idV,String cantidad, String precio, String total){
 int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
try
 {
     //Crear Nueva Venta para la Interfaz 
 nuevoDetalleVenta.setString(1, idP);
 nuevoDetalleVenta.setString(2, idV);
 nuevoDetalleVenta.setString(3, cantidad);
 nuevoDetalleVenta.setString(4, precio);
 nuevoDetalleVenta.setString(5, total);
 
 // inserta la nueva entrada; devuelve # de filas actualizadas
 resultado = nuevoDetalleVenta.executeUpdate();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
 } // fin de catch



 return resultado;
 } // fin del método agregarInstalacion
     
     public int retornaPrecioProducto(String descripcion){
 int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
try
 {
 consultaPrecioProducto.setString(1, descripcion);
 
 
 // inserta la nueva entrada; devuelve # de filas actualizadas
 resultado = consultaPrecioProducto.executeUpdate();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
 } // fin de catch



 return resultado;
 } 
     
     
     public ResultSet BuscaProducto(String desc){
        ResultSet conjuntoCancion = null;
        try{
            consultaPrecioProducto.setString(1, desc);
            conjuntoCancion = consultaPrecioProducto.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
     
      public ResultSet consultaLista(String idV){
        ResultSet conjuntoCancion = null;
        try{
            consultaLista.setString(1, idV);
            conjuntoCancion = consultaLista.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
     
     

    public Connection getConexion() {
        return conexion;
    }
}
