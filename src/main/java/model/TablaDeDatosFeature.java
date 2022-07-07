package model;

public class TablaDeDatosFeature {

    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String confirmcontrasena;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public String getConfirmcontrasena() {
        return confirmcontrasena;
    }

    public void setConfirmcontrasena(String confirmcontrasena) {
        this.confirmcontrasena = confirmcontrasena;
    }
}
