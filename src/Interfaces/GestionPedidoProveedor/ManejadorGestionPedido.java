
package Interfaces.GestionPedidoProveedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ManejadorGestionPedido {
    
     public static final String URL = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
     public static final String NOMBREUSUARIO = "sql9556799";
     public static final String CONTRASENIA = "27GJest2yc";
     
     Connection conexion = null;
    
     
     public ManejadorGestionPedido() {
        try {
            conexion = DriverManager.getConnection( URL, NOMBREUSUARIO, CONTRASENIA );
        } // fin de try
        catch ( SQLException excepcionSql )
        { excepcionSql.printStackTrace();
        System.exit( 1 );
        } // fin de catch
    }

    public Connection getConexion() {
        return conexion;
    }
     
      }
      
            
   



