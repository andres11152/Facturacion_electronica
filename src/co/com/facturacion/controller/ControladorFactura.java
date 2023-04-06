package co.com.facturacion.controller;

import java.util.ArrayList;
import java.util.Date;

import co.com.facturacion.model.Cliente;
import co.com.facturacion.model.Factura;

public class ControladorFactura {

    private ArrayList<Factura> facturas;

    public ControladorFactura() {
        facturas = new ArrayList<Factura>();
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public void eliminarFactura(Factura factura) {
        facturas.remove(factura);
    }

    public Factura buscarFacturaPorCodigo(int codigo) {
        for (Factura factura : facturas) {
            if (factura.getCodigo() == codigo) {
                return factura;
            }
        }
        return null;
    }

    public ArrayList<Factura> buscarFacturasPorCliente(Cliente cliente) {
        ArrayList<Factura> facturasEncontradas = new ArrayList<Factura>();
        for (Factura factura : facturas) {
            if (factura.getCliente().equals(cliente)) {
                facturasEncontradas.add(factura);
            }
        }
        return facturasEncontradas;
    }

    public ArrayList<Factura> buscarFacturasPorFecha(Date fecha) {
        ArrayList<Factura> facturasEncontradas = new ArrayList<Factura>();
        for (Factura factura : facturas) {
            if (factura.getFecha().equals(fecha)) {
                facturasEncontradas.add(factura);
            }
        }
        return facturasEncontradas;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
}
