package co.com.facturacion.model;

public class DetalleFactura {
    
    // Atributos
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    
    // Constructor
    public DetalleFactura(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }
    
    // Métodos
    
    // Devuelve el producto asociado al detalle
    public Producto getProducto() {
        return this.producto;
    }
    
    // Devuelve la cantidad comprada del producto
    public int getCantidad() {
        return this.cantidad;
    }
    
    // Devuelve el precio unitario del producto
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    // Devuelve el subtotal del detalle
    public double getSubtotal() {
        return this.subtotal;
    }
    
    // Actualiza la cantidad y el subtotal del detalle
    public void actualizar(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = cantidad * precioUnitario;
    }
    
    // Devuelve una representación en String del detalle
    @Override
    public String toString() {
        return "DetalleFactura[producto=" + producto.getNombre() + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + "]";
    }
}
