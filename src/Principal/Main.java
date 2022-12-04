
package Principal;

import Interfaces.VentanaPrincipal;

public class Main {
    
    public static void main(String[] args) {

        /*
        Por ahora se manda a traer a la interfaz de VentanaPrincipal
        para pruebas en el código y organización de este mismo aunque
        deberia ir la interfaz de Inicio de sesión primero
        */

        VentanaPrincipal MainMenu = new VentanaPrincipal();
        MainMenu.setVisible(true);
        
        
        
    }
    
}
