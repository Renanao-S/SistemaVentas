package modelo;

public class Cliente extends Usuario {
    private String codigo_cliente;
    private int numero;

    public Cliente(String codigo_cliente, String rut, String nombre, String apellido, String correo, String contraseña, int numero){
        super(rut,nombre,apellido,correo,contraseña);
        this.codigo_cliente = codigo_cliente;
        this.numero = numero;
    }
    public String getCodigoCliente(){
        return codigo_cliente;
    }
    public int getNumero(){
        return numero;
    }
}
