package Ventana;

public class Mesero extends Persona {
    
    private String nombre, apellido, celular;
    private double salario;
  // private List<Mesa> mesasAtencion; falta clase mesa

    public Mesero(String nombre, String apellido, String celular, double salario) {
        super(nombre, apellido, celular);
        this.salario = salario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", celular=").append(celular);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
}
