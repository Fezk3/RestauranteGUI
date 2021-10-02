package Ventana;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    ArrayList<Bebida> LBebida;
    ArrayList<Comida> LComida;
    private int nFact;
    private Date fecha;
    private String tipoServicio;
    private String mesero;
    private int cantidad;
    private String nomCliente;

    public Factura() {
        LBebida= new ArrayList<Bebida>();
        LComida= new ArrayList<Comida>();
    }
    
    public void agregarBebida(Bebida bebida){
        LBebida.add(bebida);
    }
    
    public void agregarComida(Comida comida){
        LComida.add(comida);
    }
    
    public void eliminarBebida(Bebida bebida){
        LBebida.remove(bebida);
    }
    
    public void eliminarComida(Comida comida){
        LComida.remove(comida);
    }

    public ArrayList<Bebida> getLBebida() {
        return LBebida;
    }
    
    public ArrayList<Comida> getLComida() {
        return LComida;
    }

    public double calcularTotal() {
        int topB=LBebida.size();
        int topC=LComida.size();
        
        double totalB=0;
        double totalC=0;
        
       for(int i=0;i<topB;i++){
           totalB+=LBebida.get(i).getPrecio();
       }
       for(int i=0;i<topC;i++){
           totalC+=LComida.get(i).getPrecio();
       }
        return totalC+totalB;
    }

    public double calcularConIva() {
        
        return calcularTotal()*1.13;
    }
}