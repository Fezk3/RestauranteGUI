package Ventana;

public class Cliente extends Persona{

    //atributos
    private String direccion;
    private String tipoDePago;
    private String servicioDeAtencion;
    private boolean pagado;

    
    //CONSTRUCTOR
    public Cliente(String direccion, String tipoDePago, String servicioDeAtencion, String nombre, String apellido, String celular) {
        super(nombre, apellido, celular);
        this.direccion = direccion;
        this.tipoDePago = tipoDePago;
        this.servicioDeAtencion = servicioDeAtencion;
        
    }

    //METODOS ACCESORES
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public String getServicioDeAtencion() {
        return servicioDeAtencion;
    }

    public void setServicioDeAtencion(String servicioDeAtencion) {
        this.servicioDeAtencion = servicioDeAtencion;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    //TOSTRING DE LA CLASE
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{direccion=").append(direccion);
        sb.append(", tipoDePago=").append(tipoDePago);
        sb.append(", servicioDeAtencion=").append(servicioDeAtencion);
        sb.append(", pagado=").append(pagado);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
