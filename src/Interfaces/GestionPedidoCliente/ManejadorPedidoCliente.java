
package Interfaces.GestionPedidoCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ManejadorPedidoCliente {
    
    
    Connection con;
    private static PreparedStatement consultaProducto = null;
    private static PreparedStatement consultaProveedor = null;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
            con = DriverManager.getConnection(myBD, "sql9556799", "27GJest2yc");
            
            //consultaProducto = con.prepareStatement("SELECT * FROM producto WHERE descripcion = ?");
            //consultaProveedor = con.prepareStatement("SELECT * FROM proveedor WHERE nombre = ?");
            
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
