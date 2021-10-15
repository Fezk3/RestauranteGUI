package Ventana;

import java.util.ArrayList;


public class Factura {

    //ATRIBUTOS
    ArrayList<Comida> LComida;
    private int nFact;
    private String fecha;
    private String tipoServicio;
    private String mesero;
    private String telCliente;
    private String nomCliente;
    private String direcCliente;

    //CONSTRUCTORES
    public Factura() {
        LComida= new ArrayList<Comida>();
    }
    
    public Factura(ArrayList<Comida> LComida, int nFact, String fecha, String tipoServicio, String mesero, String telCliente, String nomCliente, String direcCliente) {
        this.LComida = LComida;
        this.nFact = nFact;
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
        this.mesero = mesero;
        this.telCliente = telCliente;
        this.nomCliente = nomCliente;
        this.direcCliente = direcCliente;
    }

    //METODOS ACCESORES
    public ArrayList<Comida> getLComida() {
        return LComida;
    }

    public void setLComida(ArrayList<Comida> LComida) {
        this.LComida = LComida;
    }

    public int getnFact() {
        return nFact;
    }

    public void setnFact(int nFact) {
        this.nFact = nFact;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getDirecCliente() {
        return direcCliente;
    }

    public void setDirecCliente(String direcCliente) {
        this.direcCliente = direcCliente;
    }
    
    

    //CON LA LISTA DE COMIDAS CALCULA EL TOTAL DE LA FACTURA
    public double calcularTotal() {
        int topC=LComida.size();
        
        double totalB=0;
        double totalC=0;
        
       for(int i=0;i<topC;i++){
           totalC+=LComida.get(i).getPrecio();
       }
        return totalC+totalB;
    }

    //CON EL METODO ANTERIOR SE SACA EL MISMO CON IVA
    public double calcularConIva() {
        
        return calcularTotal()*1.13;
    }
}