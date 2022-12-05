
package Clases;

/**
 *
 * @author Ima
 */
public class Usuario {
    
    private String usuario;
    private String contrasena;
    private String contraRecuper;

    public Usuario(String usuario, String contrasena, String contraRecuper) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.contraRecuper = contraRecuper;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContraRecuper() {
        return contraRecuper;
    }

    public void setContraRecuper(String contraRecuper) {
        this.contraRecuper = contraRecuper;
    }
    
    
    
    
    
}
