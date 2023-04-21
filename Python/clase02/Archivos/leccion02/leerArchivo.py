try:
    archivo = open('prueba.txt', 'r', encoding='utf8')
    # print(archivo.read(24))# Indica la cantidad de caracteres a leer
    # print(archivo.read(10))
    # print(archivo.readline()) # Lee la linea indicada

    # Recorro archivo e imprimo sus lineas
    # for line in archivo:
        #print(line)# Itera las lineas
    # print(archivo.readlines())# Imprime como lista

    # Anexamos informacion, clonamos archivo
    archivo2 = open('copia.txt', 'w', encoding='utf8')#w para reescribir,a para hacer append
    archivo2.write(archivo.read())

except Exception as e:
    print(e)
finally:
    archivo.close()
    archivo2.close()
