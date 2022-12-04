
package Interfaces.GestionPedidoProveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductosPedido {
    
    
    Connection con;
    ManejadorGestionPedido cn = new ManejadorGestionPedido();
    PreparedStatement ps;
    ResultSet rs;
    
    public Productos BuscarPro(String descri){
    Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE descripcion = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, descri);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setId(rs.getInt("id"));
                producto.setDescripcion(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setIdProveedor(rs.getString("idProveedor"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
  
    
   
   
    
    
}
