package co.com.facturacion.controller;

import java.util.ArrayList;
import co.com.facturacion.model.Cliente;

public class ControladorCliente {

	    private ArrayList<Cliente> clientes;

	    public ControladorCliente() {
	        clientes = new ArrayList<Cliente>();
	    }

	    public void agregarCliente(Cliente c) {
	        clientes.add(c);
	    }

	    public void eliminarCliente(Cliente c) {
	        clientes.remove(c);
	    }

	    public Cliente buscarClientePorNombre(String nombre) {
	        for (Cliente c : clientes) {
	            if (c.getNombre().equals(nombre)) {
	                return c;
	            }
	        }
	        return null;
	    }

	    public Cliente buscarClientePorId(int id) {
	        for (Cliente c : clientes) {
	            if (c.getId() == id) {
	                return c;
	            }
	        }
	        return null;
	    }

	    public void actualizarTelefonoCliente(Cliente c, String nuevoTelefono) {
	        c.setTelefono(nuevoTelefono);
	    }

	    public ArrayList<Cliente> getClientes() {
	        return clientes;
	    }
	}
 
