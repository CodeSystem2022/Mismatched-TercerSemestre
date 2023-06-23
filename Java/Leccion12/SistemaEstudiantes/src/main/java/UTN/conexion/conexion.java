package UTN.conexion;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        var baseDatos = "estudiantes2022";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        // cargamos la clase del driver de MySQL en memoria
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error en la conexión" + e.getMessage());
        }
        return conexion;

    }
}
