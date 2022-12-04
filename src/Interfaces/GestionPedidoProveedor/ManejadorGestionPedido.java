
package Interfaces.GestionPedidoProveedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ManejadorGestionPedido {
    
    
    Connection con;
    private static PreparedStatement consultaProducto = null;
    private static PreparedStatement consultaProveedor = null;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
            con = DriverManager.getConnection(myBD, "sql9556799", "27GJest2yc");
            
            consultaProducto = con.prepareStatement("SELECT * FROM producto WHERE descripcion = ?");
            consultaProveedor = con.prepareStatement("SELECT * FROM proveedor WHERE nombre = ?");
            
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
        /*Código correspondiente a la conexion a la base de datos
        donde anteriormente se definen los datos necesarios para
        que la conexion mediante mysql sea exitosa
        */
       // try {
            //Parte del manejador que hace la conexion a la base de datos
           // static final String URL = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
            //static final String NOMBREUSUARIO = "sql9556799";
            //static final String CONTRASENIA = "27GJest2yc";
      
            
      // consultaProducto = conexion.prepareStatement("SELECT * FROM producto WHERE descripcion = ?");
       //consultaProveedor = conexion.prepareStatement("SELECT * FROM proveedor WHERRE ");
       
     
     
      public void close(){
      try{
      con.close();
      } // fin de try
       catch ( SQLException excepcionSql )
        {
          excepcionSql.printStackTrace();
          } // fin de catch 
            }
            
            
        } // fin de try
       // catch ( SQLException excepcionSql )
        //{ excepcionSql.printStackTrace();
        //System.exit( 1 );
        //} // fin de catch
    
     
     
     
    /* public List <Proveedor> consultaProveedor(JComboBox proveedor){
         List <Proveedor> provee = null;
          ResultSet conjuntoProveedor = null;//resultado de la consulta
     try{
         conjuntoProveedor = consultaProducto.executeQuery();//consulta
         provee = new ArrayList <>();
         while(conjuntoProveedor.next()){
        provee.
         }
     }catch(SQLException exs){
         exs.printStackTrace();
     }finally{try{
         conjuntoProveedor.close();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }
     }
     return producto;
         
         
     }
     */
     
     

 // fin del método close    
 //Fin de clase ManejadorGestionPedido



