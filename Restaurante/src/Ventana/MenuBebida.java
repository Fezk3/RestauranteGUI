package Ventana;

import java.util.ArrayList;

public class MenuBebida {
    
    public ArrayList<Comida> bebidas;

    //CONSTRUCTOR
    public MenuBebida() {
        this.bebidas = new ArrayList<Comida>();
        generarBebidasBase();
    }
    
    //AGREGA UNA BEBIDA A LA LISTA
    public void agegarBebida(Comida nueva){
        
        bebidas.add(nueva);
        
    }
    
    //GENERA BEBIDAS POR DEFECTO Y LAS AGREGA A LA LISTA
    public void generarBebidasBase(){
        
        Comida coca = new Comida("Coca-Cola","Bebida", 1200);
        Comida pepsi = new Comida("Pepsi","Bebida", 1250);
        Comida fantaUva = new Comida("Fanta Uva","Bebida", 1000);
        Comida sprite = new Comida("Sprite", "Bebida",1250);
        Comida drPepper = new Comida("Dr.Pepper","Bebida", 1200);
        
        bebidas.add(coca);  bebidas.add(pepsi);  bebidas.add(fantaUva);
        bebidas.add(sprite);  bebidas.add(drPepper);
        
    }
    
}
