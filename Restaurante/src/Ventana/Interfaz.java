package Ventana;

import java.util.ArrayList;

public class Interfaz {

    public ArrayList<Mesero> meseros;
    public ArrayList<Mesa> mesas;
    public ArrayList<Cliente> clientes;
    public ArrayList<Factura> facturas;
    public MenuBebida menuBebida;
    public MenuDesayuno menuDesayuno;
    public MenuAlmuerzo menuAlmuerzo;
    public MenuCena menuCena;

    public Interfaz() {

        meseros = new ArrayList<Mesero>();
        mesas = new ArrayList<Mesa>();
        clientes = new ArrayList<Cliente>();
        facturas = new ArrayList<Factura>();
        menuBebida = new MenuBebida();
        menuAlmuerzo = new MenuAlmuerzo();
        menuCena = new MenuCena();
        menuDesayuno =new MenuDesayuno();

    }

    public void agregarComida(Comida nueva) {
        
        if(nueva.getTipo().equals("Desayuno")){
            menuDesayuno.agegarComida(nueva);
        }
        if (nueva.getTipo().equals("Almuerzo")) {
            menuAlmuerzo.agegarAlmuerzo(nueva);
        }
        if (nueva.getTipo().equals("Cena")) {
            menuCena.agegarCena(nueva);
        }

    }

    public void agregarBebida(Bebida nueva) {

        menuBebida.agegarBebida(nueva);

    }

}
