package modelo;

public class Vendedor extends Usuario{
    private Double sueldo;
    private String fecha_contratacion;

    public Vendedor(String rut, String nombre, String apellido, String correo, String contraseña, Double sueldo, String fecha_contratacion){
        super(rut,nombre,apellido,correo,contraseña);
        this.sueldo = sueldo;
        this.fecha_contratacion = fecha_contratacion;
    }

    public Double getSueldo(){
        return sueldo;
    }
    public String getFechaContratacion(){
        return fecha_contratacion;
    }
    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }
}
