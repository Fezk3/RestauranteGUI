package Ventana;

import java.util.ArrayList;

public class Mesa {
    
    private final int cantidad = 4;
    private int numero_mesa;
    private String mesero_encargado;
    private ArrayList<Cliente> clientes;

    public Mesa(int numero_mesa, String mesero_encargado) {
        this.clientes = new ArrayList<>();
        this.numero_mesa = numero_mesa;
        this.mesero_encargado = mesero_encargado;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public String getMesero_encargado() {
        return mesero_encargado;
    }

    public void setMesero_encargado(String mesero_encargado) {
        this.mesero_encargado = mesero_encargado;
    }
    
    public boolean IngresarCliente(Cliente c){
        
        int cont = 0;
        
        if(cont != cantidad){
            
            clientes.add(c);
            cont++;
            return true; // ingresa bien 
            
        }
        
        return false; // no hay espacio para mas
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero mesa: ").append(numero_mesa);
        sb.append(", mesero encargado: ").append(mesero_encargado);
        sb.append('}');
        return sb.toString();
    }
    
}
