
package testinterfaces;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos accesodatos){
        accesodatos.listar();  }
}
