
package Clases;

public class Empleado {
    
    private String idEmpleado;
    private String nombreEmpleado;
    private String numeroTelefono;
    private String puesto;
    private char sexo;
    private float pagoPorhora;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombreEmpleado, String numeroTelefono, String puesto, char sexo, float pagoPorhora) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.numeroTelefono = numeroTelefono;
        this.puesto = puesto;
        this.sexo = sexo;
        this.pagoPorhora = pagoPorhora;
    }

    
    
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPagoPorhora() {
        return pagoPorhora;
    }

    public void setPagoPorhora(float pagoPorhora) {
        this.pagoPorhora = pagoPorhora;
    }
    
    
}
