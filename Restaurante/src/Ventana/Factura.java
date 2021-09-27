package Ventana;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    Pedido pedidoCliente;
    ArrayList<Bebida> LBebida = pedidoCliente.getLBebida();
    //ArrayList <Comida> LComida =pedidoCliente.getLComida();
    private int nFact;
    private Date fecha;
    private String tipoServicio;
    private String mesero;
    private int cantidad;
    private String nomCliente;

    public Factura() {
    }

    public int calcularTotal(){
        
        return 0;
    }
    
    public double calcularConIva(){
        
        
        return 0;
    }
}
