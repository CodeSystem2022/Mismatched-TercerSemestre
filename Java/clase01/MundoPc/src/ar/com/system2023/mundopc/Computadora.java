
package ar.com.system2023.mundopc;

public class Computadora {
    private final int idComputadora;
    private String nommbre;
    private Monitor monitor;
    private  Teclado teclado;
    private  Raton raton;
    private static int contadorComputadoras;
    
    //Constructorres
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    public Computadora(String nombre, Monitor monitor, Teclado teclado,Raton raton){
        this();
        this.nommbre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
   
    //Metodos Getters y Setters
    public int getidComputadora(){
        return idComputadora;
    }
    public String getNommbre() {
        return nommbre;
    }
    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public Raton getRaton() {
        return raton;
    }
    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    //metodo to-String
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nommbre=" + nommbre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
}
