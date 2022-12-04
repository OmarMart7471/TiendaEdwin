
package Interfaces.GestionPedidoProveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;


public class Proveedor {

    Connection con;
    ManejadorGestionPedido cn = new ManejadorGestionPedido();
    PreparedStatement ps;
    ResultSet rs;
    
    
    private int id;
    private JComboBox nombre;
    private String telefono;
    private String empresa;
    
    
    public Proveedor(){
        
    }

    public Proveedor(JComboBox nombre) {
        this.nombre = nombre;
    }

    public JComboBox getNombre() {
        return nombre;
    }

    public void setNombre(JComboBox nombre) {
        this.nombre = nombre;
    }
    
     public void consultaProductos(JComboBox producto){
        String sql = "SELECT * FROM producto";
        try{
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               producto.addItem(rs.getString("descripcion"));
           }
           
        }catch (SQLException e){
            System.out.println(e.toString());
        }
    }
    
     public void consultaProveedor(JComboBox proveedor){
        String sql = "SELECT * FROM proveedor";
        try{
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               proveedor.addItem(rs.getString("nombre"));
           }
           
        }catch (SQLException e){
            System.out.println(e.toString());
        }
    }
}
