
package ar.com.system2023.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Contructores
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio){
        this(); //LLamado al monitor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Metodos Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanio() {
        return tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public int getidMonitor(){
        return idMonitor;
    }
    
   //Metodo to-String
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
