package Ventana;

import static Ventana.VentanRest.interfaz;
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
        mesas = new ArrayList<Mesa>(12);
        clientes = new ArrayList<Cliente>();
        facturas = new ArrayList<Factura>();
        menuBebida = new MenuBebida();
        menuAlmuerzo = new MenuAlmuerzo();
        menuCena = new MenuCena();
        menuDesayuno = new MenuDesayuno();
        llenarListaMesa();
    }

    public void agregarComida(Comida nueva) {

        if (nueva.getTipo().equals("Desayuno")) {
            menuDesayuno.agegarComida(nueva);
        }
        if (nueva.getTipo().equals("Almuerzo")) {
            menuAlmuerzo.agegarAlmuerzo(nueva);
        }
        if (nueva.getTipo().equals("Cena")) {
            menuCena.agegarCena(nueva);
        }
        if (nueva.getTipo().equals("Bebida")) {
            menuBebida.agegarBebida(nueva);
        }

    }

    public void llenaMeseros() {

        meseros.add(new Mesero("Julio", "Perez", "85878986", 15000));
        meseros.add(new Mesero("Jose", "Pereira", "85878986", 15000));
        meseros.add(new Mesero("Mario", "Rodriguez", "85878986", 15000));
        meseros.add(new Mesero("Marvin", "Calvo", "85878986", 15000));

    }

    public boolean desocuparMesas(int n) {

        for (Mesa mes : mesas) {

            if (mes.getNumero_mesa() == n && mes.getDisponible() == false) {

                mes.desocuparMesa();
                return true;

            }

        }

        return false;

    }

    private void llenarListaMesa() {
        for (int i = 0; i < 12; i++) {
            mesas.add(new Mesa(i+1,""));
        }
    }
}
