package model;

public class Proveedor {
    
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    // Constructor
    public Proveedor(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    // Métodos
    
    // Devuelve el nombre del proveedor
    public String getNombre() {
        return this.nombre;
    }
    
    // Establece el nombre del proveedor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Devuelve la dirección del proveedor
    public String getDireccion() {
        return this.direccion;
    }
    
    // Establece la dirección del proveedor
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Devuelve el teléfono del proveedor
    public String getTelefono() {
        return this.telefono;
    }
    
    // Establece el teléfono del proveedor
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Devuelve el email del proveedor
    public String getEmail() {
        return this.email;
    }
    
    // Establece el email del proveedor
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Devuelve una representación en String del proveedor
    @Override
    public String toString() {
        return "Proveedor[nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + "]";
    }
}
