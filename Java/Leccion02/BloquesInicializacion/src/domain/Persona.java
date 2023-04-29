package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersona;

    static {//bloque de inicializacion estatico, se ejecuta una sola vez
        System.out.println("Ejecucion bloque estático");
        ++Persona.contadorPersona;
        //idPersona = 10;No es un atributo estatico, por esto tenemos un error
    }
    { //Bloque de inicializacion NO estático (contexto dinámico)
        System.out.println("Ejecución del bloque no estatico");
        this.idPersona = Persona.contadorPersona++;//Incrementamos el atributo
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
      
}
