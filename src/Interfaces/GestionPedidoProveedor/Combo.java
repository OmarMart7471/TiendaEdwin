
package Interfaces.GestionPedidoProveedor;

public class Combo {
    
    private int id;
    private String idPro;
    private String nombre;

    public Combo(int id, String idPro, String nombre) {
        this.id = id;
        this.idPro = idPro;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdPro() {
        return idPro;
    }

    public void setIdPro(String idPro) {
        this.idPro = idPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
