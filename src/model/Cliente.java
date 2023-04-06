package model;

public class Cliente {
    
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    // Constructor
    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    // Métodos
    
    // Devuelve el nombre del cliente
    public String getNombre() {
        return this.nombre;
    }
    
    // Devuelve la dirección del cliente
    public String getDireccion() {
        return this.direccion;
    }
    
    // Devuelve el teléfono del cliente
    public String getTelefono() {
        return this.telefono;
    }
    
    // Devuelve el email del cliente
    public String getEmail() {
        return this.email;
    }
    
    // Establece la dirección del cliente
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Establece el teléfono del cliente
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Establece el email del cliente
    public void setEmail(String email) {
        this.email = email;
    }
}
