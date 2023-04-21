from ManejoArchivos import ManejoArchivo

# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt', 'r', encoding='utf8') as archivo:
#     print(archivo.read())
# No necesita try, ni finally

with ManejoArchivo('prueba.txt') as archivo:
    print(archivo.read())
