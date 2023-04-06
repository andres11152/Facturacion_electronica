package co.com.facturacion.model;

import java.time.LocalDate;
import java.util.List;

public class Factura {
    
    // Atributos
    private int id;
    private Cliente cliente;
    private List<DetalleFactura> detalles;
    private LocalDate fecha;
    private double total;
    private int codigo;
    
    // Constructor
    public Factura(int codigo, int id, Cliente cliente, List<DetalleFactura> detalles, LocalDate fecha, double total) {
        this.id = id;
        this.cliente = cliente;
        this.detalles = detalles;
        this.fecha = fecha;
        this.total = total;
        this.codigo = codigo;
    }
    
    // Métodos
    
    // Devuelve el id de la factura
    public int getId() {
        return this.id;
    }
    
    // Devuelve el cliente asociado a la factura
    public Cliente getCliente() {
        return this.cliente;
    }
    
    // Devuelve la lista de detalles de la factura
    public List<DetalleFactura> getDetalles() {
        return this.detalles;
    }
    
    // Devuelve la fecha de la factura
    public LocalDate getFecha() {
        return this.fecha;
    }
    
    // Devuelve el total de la factura
    public double getTotal() {
        return this.total;
    }
    
    // Devuelve el codigo de la factura
    public int getCodigo() {
		return codigo;
	}
    
    // Establece código a la factura
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Agrega un nuevo detalle a la factura
    public void agregarDetalle(DetalleFactura detalle) {
        this.detalles.add(detalle);
    }
    
    // Calcula y actualiza el total de la factura
    public void calcularTotal() {
        double subtotal = 0.0;
        for (DetalleFactura detalle : detalles) {
            subtotal += detalle.getSubtotal();
        }
        this.total = subtotal;
    }
    
    // Devuelve una representación en String de la factura
    @Override
    public String toString() {
        return "Factura[codigo=" + codigo + ", id=" + id + ", cliente=" + cliente.getNombre() + ", fecha=" + fecha + ", total=" + total + "]";
    }
}
