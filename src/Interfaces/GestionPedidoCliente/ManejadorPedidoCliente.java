
package Interfaces.GestionPedidoCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ManejadorPedidoCliente {
    
    
    Connection con;
    private static PreparedStatement consultaProducto = null;
    private static PreparedStatement buscarPedido = null;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
            con = DriverManager.getConnection(myBD, "sql9556799", "27GJest2yc");
            buscarPedido = con.prepareStatement( "SELECT * FROM Pedido WHERE id = ?" );
            
            //consultaProducto = con.prepareStatement("SELECT * FROM producto WHERE descripcion = ?");
            //consultaProveedor = con.prepareStatement("SELECT * FROM proveedor WHERE nombre = ?");
            
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    
    
    public List<Pedido> encontrarPedido(String id){
     List<Pedido> pedidos = null;
     ResultSet conjuntoCancion = null;//resultado de la consulta
     try{
         buscarPedido.setString(1, id);
         conjuntoCancion = buscarPedido.executeQuery();//consulta
         pedidos = new ArrayList<Pedido>();
         while(conjuntoCancion.next()){
            pedidos.add(new Pedido(conjuntoCancion.getInt("id"),
            conjuntoCancion.getString("fecha"), 
            conjuntoCancion.getString("nombreCli"), 
            conjuntoCancion.getString("telefono"), 
            conjuntoCancion.getInt("cantidad"), 
            conjuntoCancion.getInt("anticipo"),
            conjuntoCancion.getInt("total"),
            conjuntoCancion.getInt("idVenta")));
         }
     }catch(SQLException exs){
         exs.printStackTrace();
     }finally{try{
         conjuntoCancion.close();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }
     }return pedidos;
 }
    
 public void close()
 {
 try
 {
 con.close();
 } // fin de try
 catch ( SQLException excepcionSql )
     {
excepcionSql.printStackTrace();
} // fin de catch
}
}
