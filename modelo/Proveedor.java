package modelo;

public class Proveedor {
    private String rut;
    private String nombre;
    private String correo;
    private int numero;
    private String direccion;

    public Proveedor(String rut, String nombre, String correo, int numero, String direccion){
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.direccion = direccion;
    }
    public String getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public int getNumero(){
        return numero;
    }
    public String getDireccion(){
        return direccion;
    }
}