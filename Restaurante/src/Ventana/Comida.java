package Ventana;

public class Comida {
    
    //ATRIBUTOS
    private String nombre, tipo;
    private double precio;
    private int cantidad;

    //CONSTRUCTORES
    public Comida(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        cantidad=0;
    }
    
    public Comida(String nombre, int cantidad,double precio, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //METODOS ACCESORES
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    //TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comida{nombre=").append(nombre);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", tipo=").append(tipo);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
}
