package co.com.facturacion.model;

public class DetalleCompra {
    
    // Atributos
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    
    // Constructor
    public DetalleCompra(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    // Métodos
    
    // Devuelve el producto del detalle de compra
    public Producto getProducto() {
        return this.producto;
    }
    
    // Establece el producto del detalle de compra
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    // Devuelve la cantidad del producto en el detalle de compra
    public int getCantidad() {
        return this.cantidad;
    }
    
    // Establece la cantidad del producto en el detalle de compra
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Devuelve el precio unitario del producto en el detalle de compra
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    // Establece el precio unitario del producto en el detalle de compra
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    // Calcula el subtotal del detalle de compra
    public double calcularSubtotal() {
        return this.cantidad * this.precioUnitario;
    }
    
    // Devuelve una representación en String del detalle de compra
    @Override
    public String toString() {
        return "DetalleCompra[producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + "]";
    }
}
