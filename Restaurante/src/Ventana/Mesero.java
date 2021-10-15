package Ventana;

import java.util.ArrayList;

public class Mesero extends Persona {
    
    //ATRIBUTOS
    private double salario;
    private ArrayList<Integer> mesasAtencion;

    //CONSTRUCTOR
    public Mesero(String nombre, String apellido, String celular, double salario) {
        super(nombre, apellido, celular);
        this.salario = salario;
        mesasAtencion = new ArrayList<Integer>();
    }
    
    //ACCESORES

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
