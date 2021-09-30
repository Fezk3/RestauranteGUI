package Ventana;

import java.util.ArrayList;

public class MenuBebida {
    
    public ArrayList<Bebida> bebidas;

    public MenuBebida() {
        this.bebidas = new ArrayList<Bebida>();
        generarBebidasBase();
    }
    
    public void agegarBebida(Bebida nueva){
        
        bebidas.add(nueva);
        
    }
    
    public void generarBebidasBase(){
        
        Bebida coca = new Bebida("Coca-Cola", 1200);
        Bebida pepsi = new Bebida("Pepsi", 1250);
        Bebida fantaUva = new Bebida("Fanta Uva", 1000);
        Bebida sprite = new Bebida("Sprite", 1250);
        Bebida drPepper = new Bebida("Dr.Pepper", 1200);
        
        bebidas.add(coca);  bebidas.add(pepsi);  bebidas.add(fantaUva);
        bebidas.add(sprite);  bebidas.add(drPepper);
        
    }
    
}
