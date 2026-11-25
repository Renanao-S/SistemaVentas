package modelo;

public class Producto {
    private String cod_producto;
    private String nombre;
    private int stock;
    private Double precio;
    private String disponible;

    public Producto(String cod_producto, String nombre, int stock, Double precio, String disponible){
        this.cod_producto = cod_producto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.disponible = disponible;
    }
    public String getCodigoProducto(){
        return cod_producto;
    }
    public String getNombre(){
        return nombre;
    }
    public int getStock(){
        return stock;
    }
    public Double getPrecio(){
        return precio;
    }
    public String getDisponible(){
        return disponible;
    }

    public void setDisponible(String disponible){
        this.disponible = disponible;
    }


    
}
