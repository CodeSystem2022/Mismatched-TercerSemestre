package UTN;

import java.sql.Connection;
import UTN.conexion.conexion;
public class Main {
    public static void main(String[] args) {
        var conexion1 = conexion.getConnection();
        if (conexion1 != null){
            System.out.println("Conexión exitosa: " + conexion1);
        } else {
            System.out.println("Error al conectarse");
        }
    }
}