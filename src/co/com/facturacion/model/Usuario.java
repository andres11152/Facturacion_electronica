package co.com.facturacion.model;

public class Usuario {
    
    // Atributos
    private String nombreUsuario;
    private String contrasena;
    private String nombreCompleto;
    private String correoElectronico;
    
    // Constructor
    public Usuario(String nombreUsuario, String contrasena, String nombreCompleto, String correoElectronico) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }
    
    // Métodos
    
    // Devuelve el nombre de usuario del usuario
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    // Establece el nombre de usuario del usuario
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    // Devuelve la contraseña del usuario
    public String getContrasena() {
        return this.contrasena;
    }
    
    // Establece la contraseña del usuario
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    // Devuelve el nombre completo del usuario
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    // Establece el nombre completo del usuario
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    // Devuelve el correo electrónico del usuario
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    // Establece el correo electrónico del usuario
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    // Devuelve una representación en String del usuario
    @Override
    public String toString() {
        return "Usuario[nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + "]";
    }
}
