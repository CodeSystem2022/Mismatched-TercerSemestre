package paquete1;

class Clase2 {//Modificador de acceso default solo trabaja dentro del mismo paquete
    String atributoDefault = "Valor del atributo default";
    
    //Clase2(){
    //    System.out.println("Constructor Default");
    //}
    Clase2(){
        System.out.println("Constructor Default");
    }
    
    /*public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    */
    void metodoDefault(){
        System.out.println("Método Default");
    }
}
