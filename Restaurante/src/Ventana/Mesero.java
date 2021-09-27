package Ventana;

public class Mesero extends Persona {
    
    
    private double salario;
  // private List<Mesa> mesasAtencion; falta clase mesa

    public Mesero(String nombre, String apellido, String celular, double salario) {
        super(nombre, apellido, celular);
        this.salario = salario;
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
        sb.append("Persona{nombre=").append(super.getNombre());
        sb.append(", apellido=").append(super.getApellido());
        sb.append(", celular=").append(super.getCelular());
        sb.append(", salario=").append(salario);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
