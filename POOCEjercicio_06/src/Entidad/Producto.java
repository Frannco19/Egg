
package Entidad;

public class Producto {
    
    private String producto;
    private Integer precio;

    public Producto() {
    }

    public Producto(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precio=" + precio + '}';
    }
    
    
    
}
