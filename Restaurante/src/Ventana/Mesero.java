package Ventana;

import java.util.ArrayList;

public class Mesero extends Persona {
    
    
    private double salario;
    private ArrayList<Integer> mesasAtencion;

    public Mesero(String nombre, String apellido, String celular, double salario) {
        super(nombre, apellido, celular);
        this.salario = salario;
        mesasAtencion = new ArrayList<Integer>();
    }
    
    public void recibeMesa(int numMesa){
        
        mesasAtencion.add(numMesa);  // id de la mesa
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        @Override
    public String toString() {

        return this.getNombre() + " " + this.getApellido();
        
    }
    
}
