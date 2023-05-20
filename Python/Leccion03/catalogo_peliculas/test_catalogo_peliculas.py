from dominio.Pelicula import Pelicula
from servicio.catologo_peliculas import CatalogoPelicula as cp

opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula')
        print('2. Listar las peliculas.txt')
        print('3. Eliminar catálogo de peliculas.txt')
        print('4. Salir')
        opcion = int(input('Digite una opcion de menú(1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa...')