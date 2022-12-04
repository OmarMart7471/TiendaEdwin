
package Clases;

public class Proveedor {
    
    private String Id;
    private String nombre;
    private String telefono;
    private String empresa;

    public Proveedor(String Id, String nombre, String telefono, String empresa) {
        this.Id = Id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
