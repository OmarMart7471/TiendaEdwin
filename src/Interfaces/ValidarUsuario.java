/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author César Abarca
 */
public class ValidarUsuario {
    
    //Parte del manejador que hace la conexion a la base de datos
     static final String URL = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556799";
     static final String NOMBREUSUARIO = "sql9556799";
     static final String CONTRASENIA = "27GJest2yc";
     Connection conexion = null;
     
    public PreparedStatement consultaUsuario = null;
    public PreparedStatement consultaContrasenia = null;
     public PreparedStatement consultaContraseniaRecuper = null;
    
    
    public ValidarUsuario() throws SQLException {
        
         try {
     
             conexion = DriverManager.getConnection( URL, NOMBREUSUARIO, CONTRASENIA );
             
             
        } // fin de try
         
        catch ( SQLException excepcionSql )
        { excepcionSql.printStackTrace();
        System.exit( 1 );
        } // fin de catch
        
          
      
         
    }
    
   
    
    
     public ResultSet BuscarUsuario(String usuario){
        ResultSet conjuntoCancion = null;
        try{
            consultaUsuario.setString(1, usuario);
            conjuntoCancion = consultaUsuario.executeQuery();
            
            
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
    
     
     
     public String validaUsuario(String usuario) throws SQLException{
     
         
                consultaUsuario = conexion.prepareStatement("SELECT CASE WHEN Usuario.usuario= ? " +
"            THEN \"Si existe\" " +
"            ELSE \"No existe\" " +
"       END AS Estado_usuario " +
 "FROM Usuario ");
         
         consultaUsuario.setString(1, usuario);
          ResultSet r = consultaUsuario.executeQuery();
        
          
          r.next();
          return r.getString(1);
          
             
     }
    
     
        public String validaContrasenia(String usuario) throws SQLException{
     
         
                consultaContrasenia = conexion.prepareStatement("Select contrasena from Usuario where usuario= ?");
         
         consultaContrasenia.setString(1, usuario);
         
          ResultSet r = consultaContrasenia.executeQuery();
        
          
          r.next();
          return r.getString(1);
          
             
     }
        
          public String validaContraseniaRecuper(String usuario) throws SQLException{
     
         
                consultaContraseniaRecuper = conexion.prepareStatement("Select contraRecuper from Usuario where usuario= ?");
         
         consultaContraseniaRecuper.setString(1, usuario);
         
          ResultSet r = consultaContraseniaRecuper.executeQuery();
        
          
          r.next();
          return r.getString(1);
          
             
     }
}
