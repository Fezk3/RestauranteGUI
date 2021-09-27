
package Ventana;

import java.util.ArrayList;


public class Pedido {
    private ArrayList <Bebida> LBebida =new ArrayList <Bebida>();
    // private ArrayList <Comida> LComida =new ArrayList <Comida>();

    public Pedido() {
    }
    public void agregarBebida(Bebida bebida){
        LBebida.add(bebida);
    }
    
    /*public void agregarComida(Comida comida){
        LComida.add(comida);
    }*/
    
    public void eliminarBebida(Bebida bebida){
        LBebida.remove(bebida);
    }
    
    /*public void eliminarComida(Comida comida){
        LComida.remove(comida);
    }*/

    public ArrayList<Bebida> getLBebida() {
        return LBebida;
    }
    
    
}
