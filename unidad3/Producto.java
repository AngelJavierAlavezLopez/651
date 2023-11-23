
package inventariolinkedlist;

    
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private double almacen;

   
    public Producto(String nombre, double precio, int cantidad, double almacen) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.almacen = almacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getAlmacen() {
        return almacen;
    }

    public void setAlmacen(double almacen) {
        this.almacen = almacen;
    }

   

}