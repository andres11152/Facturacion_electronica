package co.com.facturacion.controller;

import java.util.ArrayList;

import co.com.facturacion.model.Producto;

public class ControladorProducto {

    private ArrayList<Producto> productos;

    public ControladorProducto() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> buscarProductosPorNombre(String nombre) {
        ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                productosEncontrados.add(p);
            }
        }
        return productosEncontrados;
    }

    public void actualizarPrecioProducto(Producto p, double nuevoPrecio) {
        p.setPrecio(nuevoPrecio);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
