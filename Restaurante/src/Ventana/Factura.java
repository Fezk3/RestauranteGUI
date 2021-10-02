package Ventana;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    ArrayList<Comida> LComida;
    private int nFact;
    private Date fecha;
    private String tipoServicio;
    private String mesero;
    private int cantidad;
    private String nomCliente;

    public Factura() {
        LComida= new ArrayList<Comida>();
    }
    
    public void agregarComida(Comida comida){
        LComida.add(comida);
    }
    
    
    public void eliminarComida(Comida comida){
        LComida.remove(comida);
    }

    
    public ArrayList<Comida> getLComida() {
        return LComida;
    }

    public double calcularTotal() {
        int topC=LComida.size();
        
        double totalB=0;
        double totalC=0;
        
       for(int i=0;i<topC;i++){
           totalC+=LComida.get(i).getPrecio();
       }
        return totalC+totalB;
    }

    public double calcularConIva() {
        
        return calcularTotal()*1.13;
    }
}