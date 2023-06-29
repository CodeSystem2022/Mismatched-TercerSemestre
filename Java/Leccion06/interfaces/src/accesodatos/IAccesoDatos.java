
package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    // Metodo insertar es abstracto y sin cuerpo.
    // Los siguientes métodos sin para bases de datos.
    void listar();
    void actualizar();
    void eliminar();
    void insertar();

}
