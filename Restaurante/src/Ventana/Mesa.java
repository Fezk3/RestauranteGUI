package Ventana;

import java.util.ArrayList;

public class Mesa {
    
    //ATRIBUTOS
    private int cantidad = 0;
    private boolean disponible;
    private int numero_mesa;
    private String mesero_encargado;
    private ArrayList<Cliente> clientes;
    public ArrayList<Comida> pedido;

    //CONSTRUCTOR
    public Mesa(int numero_mesa, String mesero_encargado) {
        this.clientes = new ArrayList<>();
        this.numero_mesa = numero_mesa;
        this.mesero_encargado = mesero_encargado;
        pedido=new ArrayList<Comida>();
        disponible = true;
    }

    //ACCESORES
    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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
    
     public ArrayList<Comida> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Comida> pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //AGREGA UN CLIENTE A LA MESA
    public boolean IngresarCliente(Cliente c){
        
        if(cantidad != 4){
            
            clientes.add(c);
            cantidad++;
            return true; // ingresa bien 
            
        }
        
        return false; // no hay espacio para mas
        
    }
    
    //RETIRA A UN CLIENTE DE LA MESA
    public void retiraCliente(){
        
        for(int i=0;i<clientes.size();i++){
         
            // cambiar metodo a getPagado
            if(clientes.get(i).getTipoDePago().equals("pagado")){
                
                clientes.remove(i);
                
            }    
            
        }
        
    }
    
    //TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero mesa: ").append(numero_mesa);
        sb.append(", mesero encargado: ").append(mesero_encargado);
        sb.append('}');
        return sb.toString();
    }
    
    //LIMPIA LA MESA
    public void desocuparMesa(){
        
        cantidad = 0;
        disponible = true;
        mesero_encargado = "";
        clientes.clear();
        pedido = new ArrayList<>();
        
    }
    
}
