package clases;

public class user {

    private String nombre;
    private String Apellidos;
    private String usuario;
    private String contra;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public user(String nombre, String Apellidos, String usuario, String contra, String correo) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.usuario = usuario;
        this.contra = contra;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
