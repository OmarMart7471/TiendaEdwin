
package Interfaces.GestionPedidoProveedor;


public class Proveedor {

    private String id;
    private String nombre;
    private String telefono;
    private String empresa;

    public Proveedor(String id, String nombre, String telefono, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public Proveedor() {
    }
    
    
    
    public Proveedor(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
   
}
