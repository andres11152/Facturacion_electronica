package model;

public class Producto {

	// Atributos
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidadDisponible;

	// Constructor
	public Producto(String nombre, String descripcion, double precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	// Métodos

	// Devuelve el nombre del producto
	public String getNombre() {
		return this.nombre;
	}

	// Devuelve la descripción del producto
	public String getDescripcion() {
		return this.descripcion;
	}

	// Devuelve el precio del producto
	public double getPrecio() {
		return this.precio;
	}

	// Devuelve la cantidad disponible del producto
	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	// Establece la cantidad disponible del producto
	public void setCantidadDisponible(int cantidad) {
		this.cantidadDisponible = cantidad;
	}

	// Vende una cantidad del producto y actualiza la cantidad disponible
	public void vender(int cantidad) {
		if (cantidad <= this.cantidadDisponible) {
			this.cantidadDisponible -= cantidad;
		} else {
			System.out.println("No hay suficiente cantidad disponible del producto.");
		}
	}
}
