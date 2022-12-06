package Interfaces.GestionPedidoCliente;

public class Pedido {

private int id;
private String fecha;
private String nombreCliente;
private String telefono;
private int cantidad;
private int anticipo;
private int total;
private int idVenta;
private String producto;

public Pedido() {
}

public Pedido(int id, String fecha, String nombreCliente, String telefono, int cantidad, int anticipo, int total, int idVenta, String producto) {
	this.id = id;
	this.fecha = fecha;
	this.nombreCliente = nombreCliente;
	this.telefono = telefono;
	this.cantidad = cantidad;
	this.anticipo = anticipo;
	this.total = total;
	this.idVenta = idVenta;
        this.producto = producto;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getNombreCliente() {
	return nombreCliente;
}

public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public int getAnticipo() {
	return anticipo;
}

public void setAnticipo(int anticipo) {
	this.anticipo = anticipo;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

public int getIdVenta() {
	return idVenta;
}

public void setIdVenta(int idVenta) {
	this.idVenta = idVenta;
}

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

public Object[] getRow() {
	Object[] pedido = new Object[9];
	pedido[0] = id;
	pedido[1] = fecha;
	pedido[2] = nombreCliente;
	pedido[3] = telefono;
	pedido[4] = cantidad;
	pedido[5] = anticipo;
	pedido[6] = total;
	pedido[7] = idVenta;
        pedido[8] = producto;
	return pedido;
}

}
