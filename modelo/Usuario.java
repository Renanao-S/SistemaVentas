package modelo;

public class Usuario {
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;

    public Usuario(String rut, String nombre, String apellido, String correo, String contraseña){
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    public String getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCorreo(){
        return correo;
    }
    public String getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
}
