
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
    
    
    
    public boolean RegistrarPedidos(Pedido pro){
        String sql = "INSERT INTO PedidoProveedor (idPedido, fecha, cantidad, anticipo, total, idProducto, idProveedor) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getIdPedido());
            ps.setString(2, pro.getFecha());
            ps.setInt(3, pro.getCantidad());
            ps.setInt(4, pro.getAnticipo());
            ps.setInt(5, pro.getTotal());
            ps.setInt(6, pro.getIdProducto());
            ps.setString(7, pro.getIdProveedor());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    
    public List ListarPedidos(){
       List<Pedido> Listapro = new ArrayList();
       String sql = "SELECT * FROM PedidoProveedor";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Pedido pe = new Pedido();
               pe.setIdPedido(rs.getInt("idPedido"));
               pe.setFecha(rs.getString("fecha"));
               pe.setCantidad(rs.getInt("cantidad"));
               pe.setAnticipo(rs.getInt("anticipo"));
               pe.setTotal(rs.getInt("total"));
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
