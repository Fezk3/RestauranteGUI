package Ventana;

import java.util.ArrayList;

public class Mesa {
    
    private int cantidad = 0;
    private boolean disponible = true;
    private int numero_mesa;
    private String mesero_encargado;
    private ArrayList<Cliente> clientes;
    private ArrayList<Comida> pedido;

    public Mesa(int numero_mesa, String mesero_encargado) {
        this.clientes = new ArrayList<>();
        this.numero_mesa = numero_mesa;
        this.mesero_encargado = mesero_encargado;
        pedido=new ArrayList<Comida>();
    }

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
    
    public boolean IngresarCliente(Cliente c){
        
        if(cantidad != 4){
            
            clientes.add(c);
            cantidad++;
            return true; // ingresa bien 
            
        }
        
        return false; // no hay espacio para mas
        
    }
    
    public void retiraCliente(){
        
        for(int i=0;i<clientes.size();i++){
         
            // cambiar metodo a getPagado
            if(clientes.get(i).getTipoDePago().equals("pagado")){
                
                clientes.remove(i);
                
            }    
            
        }
        
    }
    
    // quizas no se ocupe y funcione solo con sets y gets :/
    public boolean disponible(){
        
        if(cantidad != 0){
            
            disponible = false;
            return false;
            
        }else{
         
            disponible = true;
            
        }
        
        return true;
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero mesa: ").append(numero_mesa);
        sb.append(", mesero encargado: ").append(mesero_encargado);
        sb.append('}');
        return sb.toString();
    }
    
    public void desocuparMesa(String n){
        
        cantidad = 0;
        disponible = true;
        mesero_encargado = "";
        clientes.clear();
        pedido.clear();
        
    }
    
}
