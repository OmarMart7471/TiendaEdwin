
package Interfaces.GestionPedidoCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;


public class PedidoDatos {
    
    Connection con;
    ManejadorPedidoCliente cn = new ManejadorPedidoCliente();
    PreparedStatement ps;
    ResultSet rs;
    
      public boolean RegistrarPedido(Pedido pr){
        String sql = "INSERT INTO Pedido (id, fecha, nomCliente, telefonoCli, cantidad, anticipo, total, idVenta) VALUES (?,?,?,?,?,?,?,?)";
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
           ps.setInt(8, pr.getIdVenta());
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
      
       public boolean EliminarPedido(int id){
        String sql = "DELETE FROM Pedido WHERE id = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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
      
       public ArrayList ListarPedido(){
        ArrayList<Pedido> Listape = new ArrayList();
        String sql = "SELECT * FROM Pedido";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Pedido pe = new Pedido();
                pe.setId(rs.getInt("id"));
                pe.setFecha(rs.getString("fecha"));
                pe.setNombreCliente(rs.getString("nomCliente"));
                pe.setTelefono(rs.getString("telefonoCli"));
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
        public Pedido BuscarPedido(String id){
        Pedido pedido = new Pedido();
        String sql = "SELECT * FROM Pedido WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pedido.setId(rs.getInt("id"));
                pedido.setFecha(rs.getString("fecha"));
                pedido.setNombreCliente(rs.getString("nomCliente"));
                pedido.setTelefono(rs.getString("telefonoCli"));
                pedido.setCantidad(rs.getInt("cantidad"));
                pedido.setAnticipo(rs.getInt("anticipo"));
                pedido.setTotal(rs.getInt("total"));
                pedido.setIdVenta(rs.getInt("idVenta"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pedido;
    }
       
         public void consultaEstadoPedido(JComboBox id){
         String sql = "SELECT id,\n" +
            "CASE (anticipo<total)\n" +
            "WHEN 0 THEN \"Entregado\"\n" +
            "WHEN 1 THEN \"No entregado\"\n" +
            "END AS Estado\n" +
            "FROM Pedido;";
          try{
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               id.addItem(rs.getString("id"));
           }
           
        }catch (SQLException e){
            System.out.println(e.toString());
        }
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
