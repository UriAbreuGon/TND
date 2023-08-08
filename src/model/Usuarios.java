package model;

/**
 *
 * @author Anderson
 */
public class Usuarios {
    
    private int idUsuario;
    private String nombre;
    private String usuario;
    private String password;
    private String correo;
    private String telefono;
    private String tipoUsuario;
    

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
    


   