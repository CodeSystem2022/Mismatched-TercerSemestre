
package accesodatos;


public interface IAccesoDatos {

    int MAX_REGISTRO = 10;
    void actualizar();
    void eliminar();
    void insertar();
    void listar();
    // Metodo insertar es abstracto y sin cuerpo
    // Los siguientes métodos sin para bases de datos
}
