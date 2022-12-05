package Manejadores.ManejadorGUsuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import Manejadores.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Usuario;

/**
 *
 * @author Ima
 */
public class ManejadorGUsuarios {
    //Consultas correspondientes a la gestion de usuario

    private PreparedStatement mostrarUsuarios = null;
    private PreparedStatement agregarUsuarios = null;
    private PreparedStatement eliminarUsuarios = null;
    private PreparedStatement modificarUsuarios = null;
    private PreparedStatement buscarUsuarios = null;
    //Conexión a la base de datos
    private Principal dbConection = new Principal();

    public Principal getDbConection() {
        return dbConection;
    }

    public ManejadorGUsuarios() {
        try {
            mostrarUsuarios = dbConection.getConexion().prepareStatement("SELECT * FROM Usuario");

            agregarUsuarios = dbConection.getConexion().prepareStatement("INSERT INTO Usuario "
                    + "( usuario, contrasena, contraRecuper)"
                    + "VALUES ( ?, ?, ?)");

            eliminarUsuarios = dbConection.getConexion().prepareStatement("DELETE FROM Usuario WHERE usuario = ?");

            modificarUsuarios = dbConection.getConexion().prepareStatement("UPDATE Usuario SET usuario=?, contrasena=?, contraRecuper=? WHERE usuario=?");

            buscarUsuarios = dbConection.getConexion().prepareStatement("SELECT * FROM Usuario WHERE usuario=?");

        } catch (SQLException ex) {
            Logger.getLogger(ManejadorGUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List< Usuario> ObtenerTodosLosUsuarios() {

        List< Usuario> resultados = null;
        ResultSet conjuntoResultados = null;

        try {
            conjuntoResultados = buscarUsuarios.executeQuery();
            resultados = new ArrayList< Usuario>();
            while (conjuntoResultados.next()) {
                resultados.add(
                        new Usuario(
                                conjuntoResultados.getString("usuario"),
                                conjuntoResultados.getString("contrasena"),
                                conjuntoResultados.getString("contraRecuper"))
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                conjuntoResultados.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                close();
            }
        }

        return resultados;
    }

    public void close() {
        try {
            dbConection.getConexion().close();
        } // fin de try
        catch (SQLException excepcionSql) {
            excepcionSql.printStackTrace();
        } // fin de catch
    } // fin del método close

    public int agregarUsuarios(String usuario, String contrasena, String contraRecuper) {
        int resultado = 0;
        try {
            agregarUsuarios.setString(1, usuario);;
            agregarUsuarios.setString(2, contrasena);
            agregarUsuarios.setString(3, contraRecuper);

            // inserta la nueva entrada; devuelve # de filas actualizadas
            resultado = agregarUsuarios.executeUpdate();
        } // fin de try
        catch (SQLException excepcionSql) {
            excepcionSql.printStackTrace();
            close();
        }
        return resultado;
    }

    public int borrarUsuario(String usuario) {
        int resultado = 0;
        try {
            eliminarUsuarios.setString(1, usuario);
            resultado = eliminarUsuarios.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            close();
        }
        return resultado;
    }

    public List<Usuario> buscarUsuario(String usuario) {
        List<Usuario> resultados = null;
        ResultSet conjuntoUsuario = null;//resultado de la consulta
        try {
            buscarUsuarios.setString(1, usuario);
            conjuntoUsuario = buscarUsuarios.executeQuery();//consulta
            resultados = new ArrayList<Usuario>();
            while (conjuntoUsuario.next()) {
                resultados.add(
                        new Usuario(
                                conjuntoUsuario.getString("usuario"),
                                conjuntoUsuario.getString("contrasena"),
                                conjuntoUsuario.getString("contraRecuper")));
            }
        } catch (SQLException exs) {
            exs.printStackTrace();
        } finally {
            try {
                conjuntoUsuario.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                close();
            }
        }
        return resultados;
    }

    public int modificarUsuario(String usuario, String contrasena, String contraRecuper) {
        int resultado = 0;
        try {

            modificarUsuarios.setString(1, usuario);
            modificarUsuarios.setString(2, contrasena);
            modificarUsuarios.setString(3, contraRecuper);
            modificarUsuarios.setString(4, usuario);
            resultado = modificarUsuarios.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            close();
        }
        return resultado;
    }

}
