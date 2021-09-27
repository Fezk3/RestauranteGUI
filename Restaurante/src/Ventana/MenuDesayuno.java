
package Ventana;

import java.util.ArrayList;


public class MenuDesayuno {
    public ArrayList<Comida> comidas;

    public MenuDesayuno() {
        this.comidas = new ArrayList<Comida>();
    }
    
    public void agegarComida(Comida nueva){
        
        comidas.add(nueva);
        
    }
    
    public void generarComidasBase(){
        
        Comida pinto=new Comida("Gallo Pinto", "Desayuno", 2500);
        Comida hotCake=new Comida("Hot cake", "Desayuno", 1500);
        Comida cereal=new Comida("Cereal", "Desayuno", 1300);
        Comida avena=new Comida("Avena", "Desayuno", 1300);
        Comida tortillas=new Comida("Tortillas", "Desayuno", 1700);
        
        comidas.add(pinto); comidas.add(hotCake);
        comidas.add(cereal); comidas.add(avena);
        comidas.add(tortillas);
        
    }
}
