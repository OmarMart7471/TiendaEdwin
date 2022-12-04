
package Interfaces.GestionPedidoProveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PedidoDatos {
    
    Connection con;
    ManejadorGestionPedido cn = new ManejadorGestionPedido();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public List ListarProductos(){
       List<Pedido> Listapro = new ArrayList();
       String sql = "SELECT pe.id AS id_pedido, p.* FROM pedido pe INNER JOIN producto p ON pr.id = pe.pedido ORDER BY p.id DESC";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Pedido pe = new Pedido();
               pe.setIdPedido(rs.getInt("id"));
               pe.setFecha(rs.getString("fecha"));
               pe.setCantidad(rs.getInt("cantidad"));
               pe.setAnticipo(rs.getInt("anticipo"));
               pe.setTotal(rs.getInt("Total"));
               pe.setIdProducto(rs.getInt("idProducto"));
               pe.setIdProveedor(rs.getString("idProveedor"));
               Listapro.add(pe);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Listapro;
   }
    
}
