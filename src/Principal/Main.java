
package Principal;

import Interfaces.InicioSesion;
import Interfaces.VentanaPrincipal;
import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) throws SQLException {

        /*
        Por ahora se manda a traer a la interfaz de VentanaPrincipal
        para pruebas en el código y organización de este mismo aunque
        deberia ir la interfaz de Inicio de sesión primero
        */

        InicioSesion MainMenu = new InicioSesion();
        MainMenu.setVisible(true);
        
        
        
    }
    
}
