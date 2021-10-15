package Ventana;

import java.util.ArrayList;

public class MenuAlmuerzo {

    public ArrayList<Comida> almuerzos;

    //CONSTRUCTOR
    public MenuAlmuerzo() {

        this.almuerzos = new ArrayList<Comida>();
        generarAlmuerzosBase();
    }

    //AGREGA UN ALMUERZO A LA LISTA
    public void agegarAlmuerzo(Comida nueva) {

        almuerzos.add(nueva);

    }

    //SE GENERAN ALMUERZOS POR DEFECTO Y LAS AGREGA A LA LISTA
    public void generarAlmuerzosBase() {

        Comida casado = new Comida("Casado con Pescado", "Almuerzo", 5000);
        Comida ceviche = new Comida("Ceviche", "Almuerzo", 2500);
        Comida sopa = new Comida("Olla de Carne", "Almuerzo", 3000);
        Comida hamburguesa = new Comida("Hamburguesa con Papas", "Almuerzo", 4000);
        Comida lasagna = new Comida("Lasagna", "Almuerzo", 4500);

        almuerzos.add(casado);
        almuerzos.add(ceviche);
        almuerzos.add(sopa);
        almuerzos.add(hamburguesa);
        almuerzos.add(lasagna);

    }

}
