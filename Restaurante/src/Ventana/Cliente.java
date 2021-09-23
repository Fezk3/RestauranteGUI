package Ventana;

public class Cliente extends Persona{

    private String direccion;
    private String tipoDePago;
    private String servicioDeAtencion;

    public Cliente(String direccion, String tipoDePago, String servicioDeAtencion, String nombre, String apellido, String celular) {
        super(nombre, apellido, celular);
        this.direccion = direccion;
        this.tipoDePago = tipoDePago;
        this.servicioDeAtencion = servicioDeAtencion;
    }

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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{direccion=").append(direccion);
        sb.append(", tipoDePago=").append(tipoDePago);
        sb.append(", servicioDeAtencion=").append(servicioDeAtencion);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
