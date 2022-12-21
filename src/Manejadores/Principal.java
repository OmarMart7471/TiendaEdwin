
package Manejadores;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
    
public class Principal {
    
    
  //Parte del manejador que hace la conexion a la base de datos
     static final String URL = "jdbc:mysql://127.0.0.1:3306/tienda";
     static final String NOMBREUSUARIO = "root";
     static final String CONTRASENIA = "12345";
     Connection conexion = null;
     
     public Principal() {
        
        /*Código correspondiente a la conexion a la base de datos
        donde anteriormente se definen los datos necesarios para
        que la conexion mediante mysql sea exitosa
        */
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
