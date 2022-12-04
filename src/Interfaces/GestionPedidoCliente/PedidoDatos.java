
package Interfaces.GestionPedidoCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PedidoDatos {
    
    Connection con;
    ManejadorPedidoCliente cn = new ManejadorPedidoCliente();
    PreparedStatement ps;
    ResultSet rs;
    
      public boolean RegistrarPedido(Pedido pr){
        String sql = "INSERT INTO proveedor(id, fecha, nombreCli, telefono, cantidad, anticipo, total, idVenta) VALUES (?,?,?,?,?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, pr.getId());
           ps.setString(2, pr.getFecha());
           ps.setString(3, pr.getNombreCliente());
           ps.setString(4, pr.getTelefono());
           ps.setInt(5,pr.getCantidad());
           ps.setInt(6, pr.getAnticipo());
           ps.setInt(7, pr.getTotal());
           ps.execute();
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
      
       public List ListarPedido(){
        List<Pedido> Listape = new ArrayList();
        String sql = "SELECT * FROM Pedido";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Pedido pe = new Pedido();
                pe.setId(rs.getInt("id"));
                pe.setFecha(rs.getString("fecha"));
                pe.setNombreCliente(rs.getString("nombre"));
                pe.setTelefono(rs.getString("telefono"));
                pe.setCantidad(rs.getInt("cantidad"));
                pe.setAnticipo(rs.getInt("anticipo"));
                pe.setTotal(rs.getInt("total"));
                pe.setIdVenta(rs.getInt("idVenta"));
                Listape.add(pe);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listape;
    }
       
       public String numSerie(){
           String serie = "";
           String sql = "SELECT MAX(idVenta) FROM Pedido";
           try{
               con = cn.getConnection();
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery();
               while (rs.next()){
                   serie = rs.getString(8);
               }
           } catch (Exception e){}
           
           return serie;
       } 
    
}
