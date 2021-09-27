package Ventana;

import java.util.ArrayList;

public class MenuBebida {
    
    public ArrayList<Bebida> bebidas;

    public MenuBebida() {
        this.bebidas = new ArrayList<Bebida>();
    }
    
    public void agegarBebida(Bebida nueva){
        
        bebidas.add(nueva);
        
    }
    
    public void generarBebidasBase(){
        
        
        
    }
    
}
