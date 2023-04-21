# Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8')# "w" write
    archivo.write('Escribiendo una linea de texto en prueba.txt desde python.\n')
    archivo.write('Agrego caracteres con acento\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción\n')
    archivo.write('r,a,w,c = (read,append,write, create,text) sucesivamente\n')
    archivo.write('t para text, b para binary, w+ lee y escribe, r+ lee y escribe\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() #Cierra el archivo
