package Ventana;

import java.util.ArrayList;

public class MenuCena {
    
    public ArrayList<Comida> cenas;

    public MenuCena() {
        
        this.cenas = new ArrayList<Comida>();
        
    }
    
    public void agegarCena(Comida nueva){
        
        cenas.add(nueva);
        
    }
    
    public void generarCenasBase(){
        
        Comida pizza = new Comida("Pizza", "Cena", 5000);
        Comida spaghetti = new Comida("Spaghetti", "Cena", 2500);
        Comida sopa = new Comida("Sopa Azteca", "Cena", 3000);
        Comida hamburguesa = new Comida("Hamburguesa", "Cena", 4000);
        Comida vigoron = new Comida("Vigoron", "Cena", 4500);
        
        cenas.add(pizza);   cenas.add(spaghetti);
        cenas.add(sopa);    cenas.add(hamburguesa);
        cenas.add(vigoron);
        
    }
    
}
