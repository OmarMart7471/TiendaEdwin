 
package Interfaces.GestionPedidoProveedor;


public class Pedido {
    
    private int idPedido;
    private String fecha;
    private int cantidad;
    private int anticipo;
    private int total;
    private int idProducto;
    private String idProveedor;
    

    public Pedido() {
    
    }

    public Pedido(int idPedido, String fecha, int cantidad, int anticipo, int total, int idProducto, String idProveedor) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.anticipo = anticipo;
        this.total = total;
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
    }
    
    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public Object[] getRow() {
	Object[] pedido = new Object[7];
	pedido[0] = idPedido;
	pedido[1] = fecha;
	pedido[2] = cantidad;
	pedido[3] = anticipo;
	pedido[4] = total;
	pedido[5] = idProducto;
        pedido[6] = idProveedor;
	return pedido;
}
    
    

   
    
    
    
    
}
