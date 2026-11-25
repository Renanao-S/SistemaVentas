package modelo;

public class Venta {
    private String cod_venta;
    private Vendedor vendedor;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private String fecha;
    private String metodo_pago;
    private Double valor_bruto;
    private Double iva;
    private Double valor_total;

    public Venta(String cod_venta, Vendedor vendedor, Cliente cliente, Producto producto, int cantidad, String fecha, String metodo_pago, Double valor_bruto,
        Double iva, Double valor_total){
            this.cod_venta = cod_venta;
            this.vendedor = vendedor;
            this.cliente = cliente;
            this.producto = producto;
            this.cantidad = cantidad;
            this.fecha = fecha;
            this.metodo_pago =  metodo_pago;
            this.valor_bruto= valor_bruto;
            this.iva = iva;
            this.valor_total = valor_total;
        }

    public String getCodigoVenta(){
        return cod_venta;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Producto getProducto(){
        return producto;
    }
    public int cantidad(){
        return cantidad;
    }
    public String fecha(){
        return fecha;
    }
    public String getMetodoPago(){
        return metodo_pago;
    }
    public Double getValorBruto(){
        return valor_bruto;
    }
    public Double getIva(){
        return iva;
    }
    public Double valorTotal(){
        return valor_total;
    }
}
