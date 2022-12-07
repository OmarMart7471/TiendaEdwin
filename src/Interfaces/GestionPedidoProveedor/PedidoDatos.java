
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
    
    
     public boolean RegistrarPedido(Pedido pro){
        String sql = "INSERT INTO PedidoProveedor (idPedido, fecha, cantidad, anticipo, total, idProducto, idProveedor) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
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
     
     public boolean EliminarPedido(int id){
       String sql = "DELETE FROM PedidoProveedor WHERE idPedido = ?";
       try {
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
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
       }
       
       
        public Pedido BuscarPedido(String cod){
        Pedido producto = new Pedido();
        String sql = "SELECT * FROM PedidoProveedor WHERE idPedido = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setIdPedido(rs.getInt("idPedido"));
                producto.setFecha(rs.getString("fecha"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setAnticipo(rs.getInt("anticipo"));
                producto.setTotal(rs.getInt("total"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setIdProveedor(rs.getString("idProveedor"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
        
        public boolean ModificarPedido(Pedido pr){
        String sql = "UPDATE PedidoProveedor SET fecha=? ,cantidad=?, anticipo=?, total=?, idProducto=?, idProveedor=? WHERE idPedido=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getIdPedido());
            ps.setString(2, pr.getFecha());
            ps.setInt(3, pr.getCantidad());
            ps.setInt(4, pr.getAnticipo());
            ps.setInt(5, pr.getTotal());
            ps.setInt(6, pr.getIdProducto());
            ps.setString(7, pr.getIdProveedor());
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
        
        
        /*public boolean ModificarProductos(Productos pro){
       String sql = "UPDATE PedidoProveedor SET  nombre=?, proveedor=?, stock=?, precio=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, pro.getCodigo());
           ps.setString(2, pro.getNombre());
           ps.setInt(3, pro.getProveedor());
           ps.setInt(4, pro.getStock());
           ps.setDouble(5, pro.getPrecio());
           ps.setInt(6, pro.getId());
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
*/
   
     
     public List ListarProductos(){
       List<Productos> Listapro = new ArrayList();
       String sql = "SELECT * FROM producto";
       try {
           con = cn.getConexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
               pro.setId(rs.getInt("id"));
               pro.setDescripcion(rs.getString("descripcion"));
               pro.setPrecio(rs.getInt("precio"));
               pro.setStock(rs.getInt("stock"));
               pro.setIdProveedor(rs.getString("idProveedor"));
               Listapro.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Listapro;

   }
     
      public List ListarProveedor(){
        List<Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor pr = new Proveedor();
                pr.setId(rs.getString("id"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setEmpresa(rs.getString("empresa"));
                Listapr.add(pr);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
      
      
        public ArrayList ListarPedido(){
        ArrayList<Pedido> Listape = new ArrayList();
        String sql = "SELECT * FROM PedidoProveedor";
        try {
            con = cn.getConexion();
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
                Listape.add(pe);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listape;
    }
      }
      
    
    

